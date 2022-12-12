using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace FBNSeating
{

    //these delegates are used to pass values from other forms back to this one
    public delegate void DataTransfer(int data); //passenger count
    public delegate void passTransfer(string name, string classType, string seat, int numOfPass, int seatNum); //this recieved the information need for tickets from form3 
    
    
    public partial class Form1 : Form
    {
        //global values
        FileStream outFile;
        const string TICKETS = "BookedTickets.txt";
        const string FIRST_CLASS = "First Class";
        const string ECONONMY_CLASS = "Economy Class";
        const string WINDOW_SEAT = "Window";
        const string AISLE_SEAT = "Aisle";
        const string CENTER_SEAT = "Center";
        int numOfPasses;
        bool outFileIsOpen = false;
        Seating[] airlineSeats = new Seating[110];
        Ticket[] tickets;

        //created the transfer delegates
        public DataTransfer transferDelegate;
        public passTransfer transferPassDelegate;

        public Form1()
        {
            InitializeComponent();
            int seatCount = 0;
            string seatClass;
            int seatNum;
            string seatLoc;
            //populates the seating array
            while (seatCount < 110)
            {
                if (seatCount < 20)
                {
                    seatClass = FIRST_CLASS;
                    if ((seatCount + 1) % 4 == 0 || (seatCount + 1) % 4 == 1) //modulo used to determine where seat is
                    {
                        seatLoc = WINDOW_SEAT;
                    }
                    else
                        seatLoc = AISLE_SEAT;
                }
                else
                {
                    seatClass = ECONONMY_CLASS;
                    if (((seatCount - 20) + 1) % 6 == 0 || ((seatCount - 20) + 1) % 6 == 1)
                        seatLoc = WINDOW_SEAT;
                    else if (((seatCount - 20) + 1) % 6 == 2 || ((seatCount - 20) + 1) % 6 == 5)
                        seatLoc = CENTER_SEAT;
                    else
                        seatLoc = AISLE_SEAT;
                }
                seatNum = seatCount + 1;
                airlineSeats[seatCount] = new Seating(seatClass, seatNum, seatLoc, true); //populates each seat with the values needed
                seatCount++;
            }

            //iniates the delegates to the methods they will be passing
            transferDelegate += new DataTransfer(RecieveInput); 
            transferPassDelegate += new passTransfer(RecievePassPref);
        }

        private void addPass_Click(object sender, EventArgs e)
        {
            addPass.Enabled = false;
            Form2 addPassNum = new Form2(transferDelegate); //form 2 recieves the transferDelegate, which in turn sends back the passenger count to this form
            addPassNum.ShowDialog(); //show dialog allows the value from the passenger count to be processed before continuing
            tickets = new Ticket[numOfPasses]; //creates ticket array of size equal to num of passengers

            Form3 passengerInfoForm = new Form3(transferPassDelegate, numOfPasses, airlineSeats); //form3 constructor takes another delegate, num of passengers, and the airline seat array reference
            passengerInfoForm.ShowDialog();
            showSeatingButton.Enabled = true;
        }
        public void RecieveInput(int data) //this method is used by a delegate to recieve the number of passengers from another form
        {
            numOfPasses = data;
        }

        //this method received the passenger info needed to create their tickets from form3 using a delegate
        public void RecievePassPref(string name, string classType, string seatLoc, int numOfPass, int seatNum)
        {
            tickets[numOfPass] = new Ticket(name, seatNum, classType, seatLoc);
        }

        
        private void showSeatingButton_Click(object sender, EventArgs e)
        {
            //prints the tickets to the listView on the form
            foreach (Ticket t in tickets)
            {
                showSeatListView1.Show();
                showSeatListView1.Items.Add(t.passName + ", Seat #: " + t.seatNum + ", " + t.seatClass + ", " + t.seatLoc);              
            }
            showSeatingButton.Enabled = false;
            cancelButton.Enabled = true;
            bookPassengerButton.Enabled = true;
        }

        private void cancelButton_Click(object sender, EventArgs e)
        {
            int seatToReset;
            //sets the previously booked seats back to available
            for (int i = 0; i < tickets.Length; i++)
            {
                seatToReset = tickets[i].seatNum - 1;
                airlineSeats[seatToReset].available = true;
            }
            showSeatListView1.Clear();
            addPass.Enabled = true;
            cancelButton.Enabled = false;
            bookPassengerButton.Enabled = false;
            showSeatListView1.Visible = false;
        }

        private void bookPassengerButton_Click(object sender, EventArgs e)
        {
            addPass.Enabled = true;
            cancelButton.Enabled = false;
            bookPassengerButton.Enabled = false;
            showSeatListView1.Visible = false;
            showSeatListView1.Clear();
            outFileIsOpen = true;

            //creats the ticket output file
            if (File.Exists(TICKETS))
            {
                outFile = new FileStream(TICKETS, FileMode.Append, FileAccess.Write);
            }
            else
            {
                outFile = new FileStream(TICKETS, FileMode.Create, FileAccess.Write);
            }

            StreamWriter writer = new StreamWriter(outFile);

            //prints each ticket in the file
            foreach (Ticket t in tickets)
            {
                writer.WriteLine(t.passName + " " + t.seatNum + " " + t.seatClass + " " + t.seatLoc);
            }
            writer.Close();
        }

        private void quitButton_Click(object sender, EventArgs e)
        {
            if (outFileIsOpen)
            {
                outFile.Close();
            }
            Application.Exit();
        }
    }
}

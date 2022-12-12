using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FBNSeating
{
    public partial class Form3 : Form
    {
        //global variables
        passTransfer TransferPassDel;
        string passNam;
        string classPref;
        string seatLoc;
        int passCount;
        int count = 0;
        int seatBookedNum;
        Seating[] seatsAvail;

        public Form3(passTransfer passDel, int numOfPasses, Seating[] seatChart)
        {
            InitializeComponent();
            TransferPassDel = passDel;
            passCount = numOfPasses;
            seatsAvail = seatChart;
        }

        private void firstClassButton_CheckedChanged(object sender, EventArgs e)
        {
            classPref = firstClassButton.Text;
            firstClassSeatGroupBox.Show();
            ecoSeatGroupBox.Hide();
        }

        private void fClassWinButton_CheckedChanged(object sender, EventArgs e)
        {
            seatLoc = fClassWinButton.Text;
        }

        private void ecoClassButton_CheckedChanged(object sender, EventArgs e)
        {
            classPref = ecoClassButton.Text;
            firstClassSeatGroupBox.Hide();
            ecoSeatGroupBox.Show();
        }

        private void fClassAisleButton_CheckedChanged(object sender, EventArgs e)
        {
            seatLoc = fClassAisleButton.Text;
        }

        private void ecoClassWindowButton_CheckedChanged(object sender, EventArgs e)
        {
            seatLoc = ecoClassWindowButton.Text;
        }

        private void ecoClassAisleButton_CheckedChanged(object sender, EventArgs e)
        {
            seatLoc = ecoClassAisleButton.Text;
        }

        private void ecoClassCenterButton_CheckedChanged(object sender, EventArgs e)
        {
            seatLoc = ecoClassCenterButton.Text;
        }

        private void checkAvailButton_Click(object sender, EventArgs e)
        {
            bool seatAvailBool = false;
            bool seatLocAvail = false;
            bool noSeatFound = true;
            string backUpSeatLoc="";

            //checks each seat in the array for availability
           foreach (Seating s in seatsAvail)
            {
                if (s.seatClass.Equals(classPref) && s.location.Equals(seatLoc) && s.available) //if seat is a perfect match stop searching and use that seat
                {
                    seatAvailBool = true;
                    seatLocAvail = true;
                    seatBookedNum = s.seatNumber;
                    break;
                }
                else if (s.seatClass.Equals(classPref) && s.available && noSeatFound) //if a seat that meets class but not location is available, this statement holds the seat
                {
                    noSeatFound = false;
                    seatAvailBool = true;
                    seatBookedNum = s.seatNumber;
                    backUpSeatLoc = s.location;
                }
            }

           if (seatLocAvail == false) //if no seat in the desired location preference was available, use the backup seat instead
            {
                MessageBox.Show("There were no seats for the preferred location.\nAnother seat will now try to be found.", "Error with Loc", MessageBoxButtons.OK);
                seatLoc = backUpSeatLoc;
            }

           if (seatAvailBool == true) //if seat is found
            {
                MessageBox.Show("A seat was found", "Seat Found", MessageBoxButtons.OK);
                bookPassButton.Show();
            }
            else
            {
                //if no seat was found, the class is full
                //this locks the class from the option and searches the other class
                DialogResult dialogResult = MessageBox.Show("There are no seats in this class, would you like to switch?", "Error with Seating" , MessageBoxButtons.YesNo);
                if (dialogResult == DialogResult.Yes)
                {
                    if (classPref.Equals("Economy Class"))
                    {
                        ecoClassButton.Enabled = false;
                        ecoSeatGroupBox.Hide();
                    }
                    else
                    {
                        firstClassButton.Enabled = false;
                        firstClassSeatGroupBox.Hide();
                    }
                }
                else
                    Close();
            }
        }

        private void bookPassButton_Click_1(object sender, EventArgs e)
        {
            seatsAvail[seatBookedNum - 1].available = false; //sets the seat that was booked to unavailable
            passNam = passNameTextBox.Text.ToString();
            TransferPassDel.Invoke(passNam, classPref, seatLoc, count, seatBookedNum); //uses delegate to pass the ticket info back to form 1
            count++;
            if (count == passCount)
            {
                Close();
            }
            else
            {
                this.Controls.Clear();
                this.InitializeComponent();
            }
        }
    }
}

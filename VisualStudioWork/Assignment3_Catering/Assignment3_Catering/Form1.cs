//Joseph Steiger
//10/28/2021
//Assignment3 - Catering
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

namespace Assignment3_Catering
{
    public partial class Form1 : Form
    {
        const string ORDER = "Event.txt";
        FileStream outFile; //filestream for writing to a file
        public Form1()
        {
            InitializeComponent();
        }

        //global variables
        int guestCount;
        string custName;
        string custNum;
        string entree;
        string dessert;
        string sides;
        int count;

        //a check that happens with each side checked, ensuring the user can only select 2
        private void sidesCheckedListBox_ItemCheck(object sender, ItemCheckEventArgs e) //on item check
        {
            int checkedListLimit = 2; //limit
            if (e.NewValue == CheckState.Checked) //when a new item is checked
            {
                if (sidesCheckedListBox.CheckedItems.Count == checkedListLimit) //if the current listbox already has 2 checked items
                {
                    for (int i = 0; i < sidesCheckedListBox.Items.Count; i++) //reset each item of the listbox
                    {
                        sidesCheckedListBox.SetItemChecked(i, false);
                    }
                    e.NewValue = CheckState.Unchecked; //clears the current item
                }
            }    
        }
        private void reviewButton_Click(object sender, EventArgs e) //review order button click event
        {
            orderLabel.Visible = true;
            placeOrderButton.Visible = true;

            //trys to set guest count to a numerical value
            if (!int.TryParse(guestCountTextBox.Text, out guestCount) || guestCountTextBox.Text == null)
                guestCount = 0;
            else
                guestCount = Convert.ToInt32(guestCountTextBox.Text);

            //foreach loop to step through the selected sides from the checkedlistbox
            count = 0;
            foreach(String s in sidesCheckedListBox.CheckedItems)
            {
                if (count == 0)
                    sides = s;
                else
                    sides += "\n              " + s;
                count++;
            }

            //sets custname and num to the values help by the textboxes
            custName = customerNameTextBox.Text;
            custNum = custNumTextBox.Text;

            //the following if statements check if items were selected from the combo boxes
            //if not, they are set to none. 
            if (entreeComboBox.SelectedItem == null) //checks if the combobox is empty
                entree = "none";
            else
                entree = entreeComboBox.Text; 

            if (dessertComboBox.SelectedItem == null)
                dessert = "none";
            else
                dessert = dessertComboBox.Text;

            //sets the text for a label with the users processed order, including the total cost. 
            orderLabel.Text = String.Format("-Name: {0} \n-Phone #: {1} \n-Guest Count: {2} \n-Entree: {3} \n-Sides: {4} \n-Desserts: {5} \n-Total Cost: {6}", 
                custName, custNum, guestCount, entree, sides, dessert, (guestCount * 35).ToString("C2")); 
        }

        private void placeOrderButton_Click(object sender, EventArgs e) //button utilzied to place orders
        {
            //checks if the events file is already created
            if (File.Exists(ORDER))
            {
                outFile = new FileStream(ORDER, FileMode.Append, FileAccess.Write); //adds to the end of it if so
            }
            else
            {
                 outFile = new FileStream(ORDER, FileMode.Create, FileAccess.Write); //creates a new file if not
            }
            StreamWriter writer = new StreamWriter(outFile); //creates a streamwriter for writing to the output file

            if (!int.TryParse(guestCountTextBox.Text, out guestCount) || guestCountTextBox.Text == null) //same as the guestcount in the reviewButton click event above
                guestCount = 0;
            else
                guestCount = Convert.ToInt32(guestCountTextBox.Text);

            //same as other button
            custName = customerNameTextBox.Text;
            custNum = custNumTextBox.Text;

            //same as other button
            if (entreeComboBox.SelectedItem == null)
                entree = "none";
            else
                entree = entreeComboBox.Text;

            //same concept as above button
            //determines if there are any sides, and if so, writes them to a string
            if (sidesCheckedListBox.CheckedItems.Count == 0)
            {
                sides = "none";
            }
            else
            {
                count = 0;
                foreach (String s in sidesCheckedListBox.CheckedItems)
                {
                    if (count == 0) 
                        sides = s;
                    else
                        sides += " and " + s;
                    count++;
                }
            }

            //same as above, determines if any option was selected
            if (dessertComboBox.SelectedItem == null)
                dessert = "none";
            else
                dessert = dessertComboBox.Text;

            //writes the entire order to the outfile
            writer.WriteLine(custName + " " + custNum + " " + guestCount + " " + entree + " " + sides + " " + dessert); 

            writer.Close();
            outFile.Close();
        }
    }
}

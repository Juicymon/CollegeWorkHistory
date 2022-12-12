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
    public partial class Form2 : Form
    {
        DataTransfer transferDel;
        public Form2(DataTransfer del)
        {
            InitializeComponent();
            transferDel = del; //sets this forms datatransfer delegate to the one passed to it
        }

        private void passNextButton_Click(object sender, EventArgs e)
        {
            int numOfPass = Convert.ToInt32(addPassComboBox.Text);
            transferDel.Invoke(numOfPass); //invokes the method passed from form 1
            Close();
        }
    }
}

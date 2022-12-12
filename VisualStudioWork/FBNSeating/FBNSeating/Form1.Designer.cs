namespace FBNSeating
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.Windows.Forms.ListViewItem listViewItem2 = new System.Windows.Forms.ListViewItem("");
            this.addPass = new System.Windows.Forms.Button();
            this.showSeatingButton = new System.Windows.Forms.Button();
            this.showSeatListView1 = new System.Windows.Forms.ListView();
            this.bookPassengerButton = new System.Windows.Forms.Button();
            this.cancelButton = new System.Windows.Forms.Button();
            this.quitButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // addPass
            // 
            this.addPass.Location = new System.Drawing.Point(37, 66);
            this.addPass.Name = "addPass";
            this.addPass.Size = new System.Drawing.Size(209, 65);
            this.addPass.TabIndex = 0;
            this.addPass.Text = "Add Passenger(s)";
            this.addPass.UseVisualStyleBackColor = true;
            this.addPass.Click += new System.EventHandler(this.addPass_Click);
            // 
            // showSeatingButton
            // 
            this.showSeatingButton.Enabled = false;
            this.showSeatingButton.Location = new System.Drawing.Point(37, 177);
            this.showSeatingButton.Name = "showSeatingButton";
            this.showSeatingButton.Size = new System.Drawing.Size(209, 66);
            this.showSeatingButton.TabIndex = 2;
            this.showSeatingButton.Text = "Show Seating";
            this.showSeatingButton.UseVisualStyleBackColor = true;
            this.showSeatingButton.Click += new System.EventHandler(this.showSeatingButton_Click);
            // 
            // showSeatListView1
            // 
            this.showSeatListView1.HideSelection = false;
            this.showSeatListView1.Items.AddRange(new System.Windows.Forms.ListViewItem[] {
            listViewItem2});
            this.showSeatListView1.Location = new System.Drawing.Point(278, 66);
            this.showSeatListView1.Name = "showSeatListView1";
            this.showSeatListView1.Size = new System.Drawing.Size(436, 296);
            this.showSeatListView1.TabIndex = 3;
            this.showSeatListView1.UseCompatibleStateImageBehavior = false;
            this.showSeatListView1.View = System.Windows.Forms.View.List;
            this.showSeatListView1.Visible = false;
            // 
            // bookPassengerButton
            // 
            this.bookPassengerButton.Enabled = false;
            this.bookPassengerButton.Location = new System.Drawing.Point(37, 294);
            this.bookPassengerButton.Name = "bookPassengerButton";
            this.bookPassengerButton.Size = new System.Drawing.Size(209, 68);
            this.bookPassengerButton.TabIndex = 4;
            this.bookPassengerButton.Text = "Book Tickets";
            this.bookPassengerButton.UseVisualStyleBackColor = true;
            this.bookPassengerButton.Click += new System.EventHandler(this.bookPassengerButton_Click);
            // 
            // cancelButton
            // 
            this.cancelButton.Enabled = false;
            this.cancelButton.Location = new System.Drawing.Point(82, 391);
            this.cancelButton.Name = "cancelButton";
            this.cancelButton.Size = new System.Drawing.Size(121, 43);
            this.cancelButton.TabIndex = 5;
            this.cancelButton.Text = "Cancel";
            this.cancelButton.UseVisualStyleBackColor = true;
            this.cancelButton.Click += new System.EventHandler(this.cancelButton_Click);
            // 
            // quitButton
            // 
            this.quitButton.Location = new System.Drawing.Point(565, 488);
            this.quitButton.Name = "quitButton";
            this.quitButton.Size = new System.Drawing.Size(131, 41);
            this.quitButton.TabIndex = 6;
            this.quitButton.Text = "Quit";
            this.quitButton.UseVisualStyleBackColor = true;
            this.quitButton.Click += new System.EventHandler(this.quitButton_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(726, 552);
            this.Controls.Add(this.quitButton);
            this.Controls.Add(this.cancelButton);
            this.Controls.Add(this.bookPassengerButton);
            this.Controls.Add(this.showSeatListView1);
            this.Controls.Add(this.showSeatingButton);
            this.Controls.Add(this.addPass);
            this.Name = "Form1";
            this.Text = "FBN Airline Seat Booking";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button addPass;
        private System.Windows.Forms.Button showSeatingButton;
        private System.Windows.Forms.ListView showSeatListView1;
        private System.Windows.Forms.Button bookPassengerButton;
        private System.Windows.Forms.Button cancelButton;
        private System.Windows.Forms.Button quitButton;
    }
}


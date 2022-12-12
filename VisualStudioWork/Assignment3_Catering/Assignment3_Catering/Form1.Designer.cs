namespace Assignment3_Catering
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
            this.customerNameTextBox = new System.Windows.Forms.TextBox();
            this.customerNameLabel = new System.Windows.Forms.Label();
            this.custNumLabel = new System.Windows.Forms.Label();
            this.custNumTextBox = new System.Windows.Forms.TextBox();
            this.guestCountTextBox = new System.Windows.Forms.TextBox();
            this.guestCountLabel = new System.Windows.Forms.Label();
            this.sidesGroupBox = new System.Windows.Forms.GroupBox();
            this.sidesCheckedListBox = new System.Windows.Forms.CheckedListBox();
            this.reviewButton = new System.Windows.Forms.Button();
            this.orderLabel = new System.Windows.Forms.Label();
            this.placeOrderButton = new System.Windows.Forms.Button();
            this.entreeComboBox = new System.Windows.Forms.ComboBox();
            this.entreeLabel = new System.Windows.Forms.Label();
            this.dessertComboBox = new System.Windows.Forms.ComboBox();
            this.dessertLabel = new System.Windows.Forms.Label();
            this.cateringLabel = new System.Windows.Forms.Label();
            this.sidesGroupBox.SuspendLayout();
            this.SuspendLayout();
            // 
            // customerNameTextBox
            // 
            this.customerNameTextBox.BackColor = System.Drawing.SystemColors.Window;
            this.customerNameTextBox.Location = new System.Drawing.Point(296, 151);
            this.customerNameTextBox.Name = "customerNameTextBox";
            this.customerNameTextBox.Size = new System.Drawing.Size(204, 22);
            this.customerNameTextBox.TabIndex = 0;
            // 
            // customerNameLabel
            // 
            this.customerNameLabel.AutoSize = true;
            this.customerNameLabel.Font = new System.Drawing.Font("Open Sans", 9F, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.customerNameLabel.Location = new System.Drawing.Point(53, 151);
            this.customerNameLabel.Name = "customerNameLabel";
            this.customerNameLabel.Size = new System.Drawing.Size(130, 20);
            this.customerNameLabel.TabIndex = 1;
            this.customerNameLabel.Text = "Enter Your Name:";
            // 
            // custNumLabel
            // 
            this.custNumLabel.AutoSize = true;
            this.custNumLabel.Font = new System.Drawing.Font("Open Sans", 9F, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.custNumLabel.Location = new System.Drawing.Point(53, 202);
            this.custNumLabel.Name = "custNumLabel";
            this.custNumLabel.Size = new System.Drawing.Size(194, 20);
            this.custNumLabel.TabIndex = 2;
            this.custNumLabel.Text = "Enter Your Phone Number:";
            // 
            // custNumTextBox
            // 
            this.custNumTextBox.Location = new System.Drawing.Point(296, 202);
            this.custNumTextBox.Name = "custNumTextBox";
            this.custNumTextBox.Size = new System.Drawing.Size(174, 22);
            this.custNumTextBox.TabIndex = 3;
            // 
            // guestCountTextBox
            // 
            this.guestCountTextBox.Location = new System.Drawing.Point(296, 256);
            this.guestCountTextBox.Name = "guestCountTextBox";
            this.guestCountTextBox.Size = new System.Drawing.Size(67, 22);
            this.guestCountTextBox.TabIndex = 4;
            // 
            // guestCountLabel
            // 
            this.guestCountLabel.AutoSize = true;
            this.guestCountLabel.Font = new System.Drawing.Font("Open Sans", 9F, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.guestCountLabel.Location = new System.Drawing.Point(53, 256);
            this.guestCountLabel.Name = "guestCountLabel";
            this.guestCountLabel.Size = new System.Drawing.Size(204, 20);
            this.guestCountLabel.TabIndex = 5;
            this.guestCountLabel.Text = "Enter Expected Guest Count:";
            // 
            // sidesGroupBox
            // 
            this.sidesGroupBox.Controls.Add(this.sidesCheckedListBox);
            this.sidesGroupBox.Font = new System.Drawing.Font("Open Sans", 9F, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.sidesGroupBox.Location = new System.Drawing.Point(296, 327);
            this.sidesGroupBox.Name = "sidesGroupBox";
            this.sidesGroupBox.Size = new System.Drawing.Size(223, 144);
            this.sidesGroupBox.TabIndex = 7;
            this.sidesGroupBox.TabStop = false;
            this.sidesGroupBox.Text = "Pick Two Sides";
            // 
            // sidesCheckedListBox
            // 
            this.sidesCheckedListBox.CheckOnClick = true;
            this.sidesCheckedListBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.sidesCheckedListBox.ForeColor = System.Drawing.SystemColors.WindowText;
            this.sidesCheckedListBox.FormattingEnabled = true;
            this.sidesCheckedListBox.Items.AddRange(new object[] {
            "Fresh Fruit Salad",
            "Green Bean Almondine",
            "Roasted Red Potatoes",
            "Veggie Medley"});
            this.sidesCheckedListBox.Location = new System.Drawing.Point(7, 27);
            this.sidesCheckedListBox.Name = "sidesCheckedListBox";
            this.sidesCheckedListBox.Size = new System.Drawing.Size(210, 99);
            this.sidesCheckedListBox.Sorted = true;
            this.sidesCheckedListBox.TabIndex = 0;
            this.sidesCheckedListBox.ItemCheck += new System.Windows.Forms.ItemCheckEventHandler(this.sidesCheckedListBox_ItemCheck);
            // 
            // reviewButton
            // 
            this.reviewButton.BackColor = System.Drawing.SystemColors.ControlLight;
            this.reviewButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.reviewButton.Location = new System.Drawing.Point(56, 509);
            this.reviewButton.Name = "reviewButton";
            this.reviewButton.Size = new System.Drawing.Size(141, 42);
            this.reviewButton.TabIndex = 9;
            this.reviewButton.Text = "Review Order";
            this.reviewButton.UseVisualStyleBackColor = false;
            this.reviewButton.Click += new System.EventHandler(this.reviewButton_Click);
            // 
            // orderLabel
            // 
            this.orderLabel.AutoSize = true;
            this.orderLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.orderLabel.Location = new System.Drawing.Point(53, 580);
            this.orderLabel.Name = "orderLabel";
            this.orderLabel.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.orderLabel.Size = new System.Drawing.Size(96, 144);
            this.orderLabel.TabIndex = 10;
            this.orderLabel.Text = "Name:\r\nNumber:\r\nGuest Count:\r\nEntree:\r\nSides:\r\nDessert:\r\nTotal Cost:\r\n\r\n";
            this.orderLabel.Visible = false;
            // 
            // placeOrderButton
            // 
            this.placeOrderButton.Cursor = System.Windows.Forms.Cursors.Default;
            this.placeOrderButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.placeOrderButton.Location = new System.Drawing.Point(327, 591);
            this.placeOrderButton.Name = "placeOrderButton";
            this.placeOrderButton.Size = new System.Drawing.Size(158, 80);
            this.placeOrderButton.TabIndex = 11;
            this.placeOrderButton.Text = "Confirm Order";
            this.placeOrderButton.UseVisualStyleBackColor = true;
            this.placeOrderButton.Visible = false;
            this.placeOrderButton.Click += new System.EventHandler(this.placeOrderButton_Click);
            // 
            // entreeComboBox
            // 
            this.entreeComboBox.FormattingEnabled = true;
            this.entreeComboBox.Items.AddRange(new object[] {
            "Chicken Marsala",
            "Roasted Portobello",
            "Grilled Sirloin",
            "Pasta Alfredo"});
            this.entreeComboBox.Location = new System.Drawing.Point(56, 353);
            this.entreeComboBox.Name = "entreeComboBox";
            this.entreeComboBox.Size = new System.Drawing.Size(183, 24);
            this.entreeComboBox.TabIndex = 12;
            // 
            // entreeLabel
            // 
            this.entreeLabel.AutoSize = true;
            this.entreeLabel.Cursor = System.Windows.Forms.Cursors.Default;
            this.entreeLabel.Font = new System.Drawing.Font("Open Sans", 9F, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.entreeLabel.ForeColor = System.Drawing.SystemColors.ControlText;
            this.entreeLabel.Location = new System.Drawing.Point(53, 327);
            this.entreeLabel.Name = "entreeLabel";
            this.entreeLabel.Size = new System.Drawing.Size(119, 20);
            this.entreeLabel.TabIndex = 13;
            this.entreeLabel.Text = "Pick and Entrée:";
            // 
            // dessertComboBox
            // 
            this.dessertComboBox.FormattingEnabled = true;
            this.dessertComboBox.Items.AddRange(new object[] {
            "Assorted Cupcakes",
            "Mini Shooters",
            "Layered Bars"});
            this.dessertComboBox.Location = new System.Drawing.Point(56, 447);
            this.dessertComboBox.Name = "dessertComboBox";
            this.dessertComboBox.Size = new System.Drawing.Size(183, 24);
            this.dessertComboBox.TabIndex = 14;
            // 
            // dessertLabel
            // 
            this.dessertLabel.AutoSize = true;
            this.dessertLabel.Font = new System.Drawing.Font("Open Sans", 9F, System.Drawing.FontStyle.Underline, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.dessertLabel.Location = new System.Drawing.Point(53, 426);
            this.dessertLabel.Name = "dessertLabel";
            this.dessertLabel.Size = new System.Drawing.Size(109, 20);
            this.dessertLabel.TabIndex = 15;
            this.dessertLabel.Text = "Pick a Dessert:";
            // 
            // cateringLabel
            // 
            this.cateringLabel.AutoSize = true;
            this.cateringLabel.Font = new System.Drawing.Font("Monotype Corsiva", 36F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Italic))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.cateringLabel.Location = new System.Drawing.Point(89, 31);
            this.cateringLabel.Name = "cateringLabel";
            this.cateringLabel.Size = new System.Drawing.Size(390, 72);
            this.cateringLabel.TabIndex = 16;
            this.cateringLabel.Text = "Cindy\'s Catering";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(575, 753);
            this.Controls.Add(this.cateringLabel);
            this.Controls.Add(this.dessertLabel);
            this.Controls.Add(this.dessertComboBox);
            this.Controls.Add(this.entreeLabel);
            this.Controls.Add(this.entreeComboBox);
            this.Controls.Add(this.placeOrderButton);
            this.Controls.Add(this.orderLabel);
            this.Controls.Add(this.reviewButton);
            this.Controls.Add(this.sidesGroupBox);
            this.Controls.Add(this.guestCountLabel);
            this.Controls.Add(this.guestCountTextBox);
            this.Controls.Add(this.custNumTextBox);
            this.Controls.Add(this.custNumLabel);
            this.Controls.Add(this.customerNameLabel);
            this.Controls.Add(this.customerNameTextBox);
            this.Name = "Form1";
            this.Text = "Cindy\'s Catering - Placing Order";
            this.sidesGroupBox.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox customerNameTextBox;
        private System.Windows.Forms.Label customerNameLabel;
        private System.Windows.Forms.Label custNumLabel;
        private System.Windows.Forms.TextBox custNumTextBox;
        private System.Windows.Forms.TextBox guestCountTextBox;
        private System.Windows.Forms.Label guestCountLabel;
        private System.Windows.Forms.GroupBox sidesGroupBox;
        private System.Windows.Forms.CheckedListBox sidesCheckedListBox;
        private System.Windows.Forms.Button reviewButton;
        private System.Windows.Forms.Label orderLabel;
        private System.Windows.Forms.Button placeOrderButton;
        private System.Windows.Forms.ComboBox entreeComboBox;
        private System.Windows.Forms.Label entreeLabel;
        private System.Windows.Forms.ComboBox dessertComboBox;
        private System.Windows.Forms.Label dessertLabel;
        private System.Windows.Forms.Label cateringLabel;
    }
}


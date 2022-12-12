namespace FBNSeating
{
    partial class Form3
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
            this.bookPassButton = new System.Windows.Forms.Button();
            this.passNameLab = new System.Windows.Forms.Label();
            this.passNameTextBox = new System.Windows.Forms.TextBox();
            this.firstClassButton = new System.Windows.Forms.RadioButton();
            this.passClassGroupBox = new System.Windows.Forms.GroupBox();
            this.ecoClassButton = new System.Windows.Forms.RadioButton();
            this.firstClassSeatGroupBox = new System.Windows.Forms.GroupBox();
            this.fClassAisleButton = new System.Windows.Forms.RadioButton();
            this.fClassWinButton = new System.Windows.Forms.RadioButton();
            this.ecoSeatGroupBox = new System.Windows.Forms.GroupBox();
            this.ecoClassCenterButton = new System.Windows.Forms.RadioButton();
            this.ecoClassAisleButton = new System.Windows.Forms.RadioButton();
            this.ecoClassWindowButton = new System.Windows.Forms.RadioButton();
            this.checkAvailButton = new System.Windows.Forms.Button();
            this.passClassGroupBox.SuspendLayout();
            this.firstClassSeatGroupBox.SuspendLayout();
            this.ecoSeatGroupBox.SuspendLayout();
            this.SuspendLayout();
            // 
            // bookPassButton
            // 
            this.bookPassButton.Location = new System.Drawing.Point(277, 360);
            this.bookPassButton.Name = "bookPassButton";
            this.bookPassButton.Size = new System.Drawing.Size(143, 63);
            this.bookPassButton.TabIndex = 0;
            this.bookPassButton.Text = "Book Passenger";
            this.bookPassButton.UseVisualStyleBackColor = true;
            this.bookPassButton.Visible = false;
            this.bookPassButton.Click += new System.EventHandler(this.bookPassButton_Click_1);
            // 
            // passNameLab
            // 
            this.passNameLab.AutoSize = true;
            this.passNameLab.Location = new System.Drawing.Point(56, 83);
            this.passNameLab.Name = "passNameLab";
            this.passNameLab.Size = new System.Drawing.Size(121, 17);
            this.passNameLab.TabIndex = 1;
            this.passNameLab.Text = "Passenger Name:";
            // 
            // passNameTextBox
            // 
            this.passNameTextBox.Location = new System.Drawing.Point(183, 80);
            this.passNameTextBox.Name = "passNameTextBox";
            this.passNameTextBox.Size = new System.Drawing.Size(212, 22);
            this.passNameTextBox.TabIndex = 2;
            // 
            // firstClassButton
            // 
            this.firstClassButton.AutoSize = true;
            this.firstClassButton.Location = new System.Drawing.Point(6, 21);
            this.firstClassButton.Name = "firstClassButton";
            this.firstClassButton.Size = new System.Drawing.Size(94, 21);
            this.firstClassButton.TabIndex = 4;
            this.firstClassButton.TabStop = true;
            this.firstClassButton.Text = "First Class";
            this.firstClassButton.UseVisualStyleBackColor = true;
            this.firstClassButton.CheckedChanged += new System.EventHandler(this.firstClassButton_CheckedChanged);
            // 
            // passClassGroupBox
            // 
            this.passClassGroupBox.Controls.Add(this.ecoClassButton);
            this.passClassGroupBox.Controls.Add(this.firstClassButton);
            this.passClassGroupBox.Location = new System.Drawing.Point(135, 129);
            this.passClassGroupBox.Name = "passClassGroupBox";
            this.passClassGroupBox.Size = new System.Drawing.Size(200, 100);
            this.passClassGroupBox.TabIndex = 5;
            this.passClassGroupBox.TabStop = false;
            this.passClassGroupBox.Text = "Pick Class";
            // 
            // ecoClassButton
            // 
            this.ecoClassButton.AutoSize = true;
            this.ecoClassButton.Location = new System.Drawing.Point(6, 60);
            this.ecoClassButton.Name = "ecoClassButton";
            this.ecoClassButton.Size = new System.Drawing.Size(125, 21);
            this.ecoClassButton.TabIndex = 5;
            this.ecoClassButton.TabStop = true;
            this.ecoClassButton.Text = "Economy Class";
            this.ecoClassButton.UseVisualStyleBackColor = true;
            this.ecoClassButton.CheckedChanged += new System.EventHandler(this.ecoClassButton_CheckedChanged);
            // 
            // firstClassSeatGroupBox
            // 
            this.firstClassSeatGroupBox.Controls.Add(this.fClassAisleButton);
            this.firstClassSeatGroupBox.Controls.Add(this.fClassWinButton);
            this.firstClassSeatGroupBox.Location = new System.Drawing.Point(30, 235);
            this.firstClassSeatGroupBox.Name = "firstClassSeatGroupBox";
            this.firstClassSeatGroupBox.Size = new System.Drawing.Size(200, 100);
            this.firstClassSeatGroupBox.TabIndex = 6;
            this.firstClassSeatGroupBox.TabStop = false;
            this.firstClassSeatGroupBox.Text = "First Class Seat Pref.";
            this.firstClassSeatGroupBox.Visible = false;
            // 
            // fClassAisleButton
            // 
            this.fClassAisleButton.AutoSize = true;
            this.fClassAisleButton.Location = new System.Drawing.Point(6, 62);
            this.fClassAisleButton.Name = "fClassAisleButton";
            this.fClassAisleButton.Size = new System.Drawing.Size(59, 21);
            this.fClassAisleButton.TabIndex = 6;
            this.fClassAisleButton.TabStop = true;
            this.fClassAisleButton.Text = "Aisle";
            this.fClassAisleButton.UseVisualStyleBackColor = true;
            this.fClassAisleButton.CheckedChanged += new System.EventHandler(this.fClassAisleButton_CheckedChanged);
            // 
            // fClassWinButton
            // 
            this.fClassWinButton.AutoSize = true;
            this.fClassWinButton.Location = new System.Drawing.Point(6, 35);
            this.fClassWinButton.Name = "fClassWinButton";
            this.fClassWinButton.Size = new System.Drawing.Size(78, 21);
            this.fClassWinButton.TabIndex = 5;
            this.fClassWinButton.TabStop = true;
            this.fClassWinButton.Text = "Window";
            this.fClassWinButton.UseVisualStyleBackColor = true;
            this.fClassWinButton.CheckedChanged += new System.EventHandler(this.fClassWinButton_CheckedChanged);
            // 
            // ecoSeatGroupBox
            // 
            this.ecoSeatGroupBox.Controls.Add(this.ecoClassCenterButton);
            this.ecoSeatGroupBox.Controls.Add(this.ecoClassAisleButton);
            this.ecoSeatGroupBox.Controls.Add(this.ecoClassWindowButton);
            this.ecoSeatGroupBox.Location = new System.Drawing.Point(251, 235);
            this.ecoSeatGroupBox.Name = "ecoSeatGroupBox";
            this.ecoSeatGroupBox.Size = new System.Drawing.Size(200, 100);
            this.ecoSeatGroupBox.TabIndex = 7;
            this.ecoSeatGroupBox.TabStop = false;
            this.ecoSeatGroupBox.Text = "Economy Class Seat Pref.";
            this.ecoSeatGroupBox.Visible = false;
            // 
            // ecoClassCenterButton
            // 
            this.ecoClassCenterButton.AutoSize = true;
            this.ecoClassCenterButton.Location = new System.Drawing.Point(50, 62);
            this.ecoClassCenterButton.Name = "ecoClassCenterButton";
            this.ecoClassCenterButton.Size = new System.Drawing.Size(71, 21);
            this.ecoClassCenterButton.TabIndex = 7;
            this.ecoClassCenterButton.TabStop = true;
            this.ecoClassCenterButton.Text = "Center";
            this.ecoClassCenterButton.UseVisualStyleBackColor = true;
            this.ecoClassCenterButton.CheckedChanged += new System.EventHandler(this.ecoClassCenterButton_CheckedChanged);
            // 
            // ecoClassAisleButton
            // 
            this.ecoClassAisleButton.AutoSize = true;
            this.ecoClassAisleButton.Location = new System.Drawing.Point(110, 35);
            this.ecoClassAisleButton.Name = "ecoClassAisleButton";
            this.ecoClassAisleButton.Size = new System.Drawing.Size(59, 21);
            this.ecoClassAisleButton.TabIndex = 6;
            this.ecoClassAisleButton.TabStop = true;
            this.ecoClassAisleButton.Text = "Aisle";
            this.ecoClassAisleButton.UseVisualStyleBackColor = true;
            this.ecoClassAisleButton.CheckedChanged += new System.EventHandler(this.ecoClassAisleButton_CheckedChanged);
            // 
            // ecoClassWindowButton
            // 
            this.ecoClassWindowButton.AutoSize = true;
            this.ecoClassWindowButton.Location = new System.Drawing.Point(6, 35);
            this.ecoClassWindowButton.Name = "ecoClassWindowButton";
            this.ecoClassWindowButton.Size = new System.Drawing.Size(78, 21);
            this.ecoClassWindowButton.TabIndex = 5;
            this.ecoClassWindowButton.TabStop = true;
            this.ecoClassWindowButton.Text = "Window";
            this.ecoClassWindowButton.UseVisualStyleBackColor = true;
            this.ecoClassWindowButton.CheckedChanged += new System.EventHandler(this.ecoClassWindowButton_CheckedChanged);
            // 
            // checkAvailButton
            // 
            this.checkAvailButton.Location = new System.Drawing.Point(59, 360);
            this.checkAvailButton.Name = "checkAvailButton";
            this.checkAvailButton.Size = new System.Drawing.Size(150, 63);
            this.checkAvailButton.TabIndex = 8;
            this.checkAvailButton.Text = "Check Availability";
            this.checkAvailButton.UseVisualStyleBackColor = true;
            this.checkAvailButton.Click += new System.EventHandler(this.checkAvailButton_Click);
            // 
            // Form3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(519, 513);
            this.Controls.Add(this.checkAvailButton);
            this.Controls.Add(this.ecoSeatGroupBox);
            this.Controls.Add(this.firstClassSeatGroupBox);
            this.Controls.Add(this.passClassGroupBox);
            this.Controls.Add(this.passNameTextBox);
            this.Controls.Add(this.passNameLab);
            this.Controls.Add(this.bookPassButton);
            this.Name = "Form3";
            this.Text = "Form3";
            this.passClassGroupBox.ResumeLayout(false);
            this.passClassGroupBox.PerformLayout();
            this.firstClassSeatGroupBox.ResumeLayout(false);
            this.firstClassSeatGroupBox.PerformLayout();
            this.ecoSeatGroupBox.ResumeLayout(false);
            this.ecoSeatGroupBox.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button bookPassButton;
        private System.Windows.Forms.Label passNameLab;
        private System.Windows.Forms.TextBox passNameTextBox;
        private System.Windows.Forms.RadioButton firstClassButton;
        private System.Windows.Forms.GroupBox passClassGroupBox;
        private System.Windows.Forms.RadioButton ecoClassButton;
        private System.Windows.Forms.GroupBox firstClassSeatGroupBox;
        private System.Windows.Forms.RadioButton fClassAisleButton;
        private System.Windows.Forms.RadioButton fClassWinButton;
        private System.Windows.Forms.GroupBox ecoSeatGroupBox;
        private System.Windows.Forms.RadioButton ecoClassCenterButton;
        private System.Windows.Forms.RadioButton ecoClassAisleButton;
        private System.Windows.Forms.RadioButton ecoClassWindowButton;
        private System.Windows.Forms.Button checkAvailButton;
    }
}
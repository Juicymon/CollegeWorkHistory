namespace FBNSeating
{
    partial class Form2
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
            this.addPassLabel = new System.Windows.Forms.Label();
            this.passNextButton = new System.Windows.Forms.Button();
            this.addPassComboBox = new System.Windows.Forms.ComboBox();
            this.SuspendLayout();
            // 
            // addPassLabel
            // 
            this.addPassLabel.AutoSize = true;
            this.addPassLabel.Location = new System.Drawing.Point(12, 54);
            this.addPassLabel.Name = "addPassLabel";
            this.addPassLabel.Size = new System.Drawing.Size(195, 17);
            this.addPassLabel.TabIndex = 1;
            this.addPassLabel.Text = "Enter Number of Passengers:";
            // 
            // passNextButton
            // 
            this.passNextButton.Location = new System.Drawing.Point(115, 124);
            this.passNextButton.Name = "passNextButton";
            this.passNextButton.Size = new System.Drawing.Size(108, 38);
            this.passNextButton.TabIndex = 2;
            this.passNextButton.Text = "Next";
            this.passNextButton.UseVisualStyleBackColor = true;
            this.passNextButton.Click += new System.EventHandler(this.passNextButton_Click);
            // 
            // addPassComboBox
            // 
            this.addPassComboBox.FormattingEnabled = true;
            this.addPassComboBox.Items.AddRange(new object[] {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10"});
            this.addPassComboBox.Location = new System.Drawing.Point(213, 54);
            this.addPassComboBox.Name = "addPassComboBox";
            this.addPassComboBox.Size = new System.Drawing.Size(121, 24);
            this.addPassComboBox.TabIndex = 3;
            // 
            // Form2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(355, 225);
            this.Controls.Add(this.addPassComboBox);
            this.Controls.Add(this.passNextButton);
            this.Controls.Add(this.addPassLabel);
            this.Name = "Form2";
            this.Text = "Passengers";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label addPassLabel;
        private System.Windows.Forms.Button passNextButton;
        private System.Windows.Forms.ComboBox addPassComboBox;
    }
}
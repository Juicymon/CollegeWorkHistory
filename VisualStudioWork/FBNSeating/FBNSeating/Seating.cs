using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FBNSeating
{
    public class Seating
    {
        public string seatClass { get; set; }
        public int seatNumber { get; set; }
        public string location { get; set; }
        public bool available { get; set; }

        public Seating (string classification, int seatNumber, string location, Boolean avail)
        {
            seatClass = classification;
            this.seatNumber = seatNumber;
            this.location = location;
            available = avail;
        }
    }
}

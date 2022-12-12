using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FBNSeating
{
    class Ticket
    {
        public string passName { get; set; }
        public int seatNum { get; set; }
        public string seatLoc { get; set; }
        public string seatClass { get; set; }

        public Ticket (string name, int num, string classification, string location)
        {
            passName = name;
            seatNum = num;
            seatClass = classification;
            seatLoc = location;
        }
    }
}

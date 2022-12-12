//Joseph Steiger
//10/6/2021
//Assignment 2
using System;
using System.Collections.Generic;
using System.Text;

namespace Warehouses
{
    class Inventory //inventory class for creating the inventory objects of each warehouse
    {
        //Auto implemented properties
        public string wareName {get; set;}
        public int itemOne { get; set; }
        public int itemTwo { get; set; }
        public int itemThree { get; set; }
        public int itemFour { get; set; }
        public int itemFive { get; set; }

        public Inventory(string warehouse, int firstID, int secID, int thirdID, int fourthID, int fifthID) //inventory constructor
        {
            wareName = warehouse;
            itemOne = firstID;
            itemTwo = secID;
            itemThree = thirdID;
            itemFour = fourthID;
            itemFive = fifthID;
        }


    }
}

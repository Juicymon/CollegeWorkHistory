//Joseph Steiger
//10/6/2021
//Assignment 2
using System;
using System.IO;

namespace Warehouses
{
    class Program
    {
        static void Main(string[] args)
        {
            const char DELIM = ','; //delimiter to determine each new value in the record
            string recordIn; //holds the record as a string
            string[] fields; //holds each values in the record as a seperate string in the array
            int count = 0;
            Inventory[] wareInven = new Inventory[6]; //an array of inventory objects

            //file stream and reader to access inventory 
            FileStream inFile = new FileStream("Inventory.txt",
                FileMode.Open, FileAccess.Read);
            StreamReader reader = new StreamReader(inFile);

            recordIn = reader.ReadLine(); //holds the record as a string

            //while lopp to iterate through each record until none are founds
            while (recordIn != null)
            {
                fields = recordIn.Split(DELIM); //splits the record based on delim

                //instantiates and initializes each object in the array with its respective inventory and location
                //calles the WarehouseName() method to determine which warehouse the inventory is from
                wareInven[count] = new Inventory(WarehouseName(count),Convert.ToInt32(fields[0]), Convert.ToInt32(fields[1]),
                    Convert.ToInt32(fields[2]), Convert.ToInt32(fields[3]), Convert.ToInt32(fields[4]));

                recordIn = reader.ReadLine(); //updates reader
                count++;
            }//end while

            Console.WriteLine("-----Warehouse Inventory Beginning-of-Day-----");
            
            //prints each inventory object's contents 
            foreach(Inventory inventory in wareInven)
            {
                Console.WriteLine(inventory.wareName + " " + inventory.itemOne + " " + inventory.itemTwo + " " + 
                    inventory.itemThree + " " + inventory.itemFour + " " + inventory.itemFive);
            }

            //sets infile and read to the new file
            inFile = new FileStream("Transactions.txt", FileMode.Open, FileAccess.Read);
            reader = new StreamReader(inFile);

            recordIn = reader.ReadLine(); //reads record from transactions

            //loops for as long as there are transactions in the file
            while(recordIn != null)
            {
                fields = recordIn.Split(DELIM); //same delim as before
                int itemNumber = Convert.ToInt32(fields[1]); //gets the number of the item being bought/sold

                //if the transaction is a purchase
                //determine which warehouse to update based on item number and lowest inventory warehouse
                //calls the LowestInv() method to find the lowest warehouse based on index
                if (fields[0] == "P") 
                {
                    if (itemNumber == 102) //if item 1
                    {
                        int lowest = LowestInv(wareInven, itemNumber); //find lowest
                        wareInven[lowest].itemOne += Convert.ToInt32(fields[2]); //add to inventory of lowest warehouse
                    }
                    else if (itemNumber == 215)//if item 2
                    {
                        int lowest = LowestInv(wareInven, itemNumber);
                        wareInven[lowest].itemTwo += Convert.ToInt32(fields[2]);
                    }
                    else if (itemNumber == 410)//if item 3
                    {
                        int lowest = LowestInv(wareInven, itemNumber);
                        wareInven[lowest].itemThree += Convert.ToInt32(fields[2]);
                    }
                    else if (itemNumber == 525)//if item 4
                    {
                        int lowest = LowestInv(wareInven, itemNumber);
                        wareInven[lowest].itemFour += Convert.ToInt32(fields[2]);
                    }
                    else if (itemNumber == 711)//if item 5
                    {
                        int lowest = LowestInv(wareInven, itemNumber);
                        wareInven[lowest].itemFive += Convert.ToInt32(fields[2]);
                    }
                }//end purchase
                //if transaction is sale
                //same as above, but for highest value instead
                //calls HighestInv() to find highest warehouse to sell from
                else if (fields[0] == "S")
                {
                    if (itemNumber == 102)
                    {
                        int highest = HighestInv(wareInven, itemNumber);//finds highest
                        wareInven[highest].itemOne -= Convert.ToInt32(fields[2]);//removes transaction quantity from inventory
                    }
                    else if (itemNumber == 215)
                    {
                        int highest = HighestInv(wareInven, itemNumber);
                        wareInven[highest].itemTwo -= Convert.ToInt32(fields[2]);
                    }
                    else if (itemNumber == 410)
                    {
                        int highest = HighestInv(wareInven, itemNumber);
                        wareInven[highest].itemThree -= Convert.ToInt32(fields[2]);
                    }
                    else if (itemNumber == 525)
                    {
                        int highest = HighestInv(wareInven, itemNumber);
                        wareInven[highest].itemFour -= Convert.ToInt32(fields[2]);
                    }
                    else if (itemNumber == 711)
                    {
                        int highest = HighestInv(wareInven, itemNumber);
                        wareInven[highest].itemFive -= Convert.ToInt32(fields[2]);
                    }
                }//end sale

                recordIn = reader.ReadLine();
            }//end while    

            Console.WriteLine("\n\n\n-----Warehouse Inventory End-of-Day-----");

            //prints new inventory of each warehouse at the end of the day
            foreach (Inventory inventory in wareInven)
            {
                Console.WriteLine(inventory.wareName + " " + inventory.itemOne + " " + inventory.itemTwo + " " +
                    inventory.itemThree + " " + inventory.itemFour + " " + inventory.itemFive);
            }

            //closes the reader and filestream
            inFile.Close();
            reader.Close();

            Console.ReadLine();
            
        }//end main

        //the below method determines which warehouse is being 
        //created based on the counter passed to it
        public static string WarehouseName(int counter)
        {
            string warehouse= "";
            switch (counter)
            {
                case 0:
                    warehouse = "Atlanta";
                    break;
                case 1:
                    warehouse = "Baltimore";
                    break;
                case 2:
                    warehouse = "Chicago";
                    break;
                case 3:
                    warehouse = "Denver";
                    break;
                case 4:
                    warehouse = "Ely";
                    break;
                case 5:
                    warehouse = "Fargo";
                    break;
                default:
                    Console.WriteLine("Something went wrong in warehouse selection");
                    break;
            }//end switch
            return warehouse;
        }//end warehouse method

        //the below method determines which warehouse has the lowest 
        //inventory for a given item by first determining which item is
        //being evaluated, then it finds the appropiate warehouse item to compare
        //between the 6 warehouses and returns the index of the lowest one
        public static int LowestInv(Inventory[] warehouse, int itemNumber)
        {
            int index = 1; //lowest starts at one so compare next index, hence starting at 1
            int lowest = 0;
            switch (itemNumber) //switch case to determine item in object based on itemnum from transactions
            {
                
                case 102: //for item 1, find lowest itemOne out of all 6 objects
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[lowest].itemOne > warehouse[index].itemOne)
                        {
                            lowest = index;
                        }
                        index++;
                    }
                    break;
                case 215: //item 2
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[lowest].itemTwo > warehouse[index].itemTwo)
                        {
                            lowest = index;
                        }
                        index++;
                    }
                    break;
                case 410: //item 3
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[lowest].itemThree > warehouse[index].itemThree)
                        {
                            lowest = index;
                        }
                        index++;
                    }
                    break;
                case 525: //item 4
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[lowest].itemFour > warehouse[index].itemFour)
                        {
                            lowest = index;
                        }
                        index++;
                    }
                    break;
                case 711: //item 5
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[lowest].itemFive > warehouse[index].itemFive)
                        {
                            lowest = index;
                        }
                        index++;
                    }
                    break;
                default:
                    Console.WriteLine("Something went wrong in lowest method");
                    break;
            }//end switch

            return lowest;
        }//end LowestInv

        //Same as the above method but for find the highest value
        //neither of these methods are strictly necessary, as the switch statement 
        //only needed to be written once for highest and lowest in the main method as well,
        //but it makes the code easier to read by sectioning off the switch statements to 
        //eliminate some of the visual clutter.  
        public static int HighestInv(Inventory[] warehouse, int itemNumber)
        {
            int index = 1;
            int highest = 0;
            switch (itemNumber)
            {

                case 102:
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[highest].itemOne < warehouse[index].itemOne)
                        {
                            highest = index;
                        }
                        index++;
                    }
                    break;
                case 215:
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[highest].itemTwo < warehouse[index].itemTwo)
                        {
                            highest = index;
                        }
                        index++;
                    }
                    break;
                case 410:
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[highest].itemThree < warehouse[index].itemThree)
                        {
                            highest = index;
                        }
                        index++;
                    }
                    break;
                case 525:
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[highest].itemFour < warehouse[index].itemFour)
                        {
                            highest = index;
                        }
                        index++;
                    }
                    break;
                case 711:
                    for (int i = 0; i < 5; ++i)
                    {
                        if (warehouse[highest].itemFive < warehouse[index].itemFive)
                        {
                            highest = index;
                        }
                        index++;
                    }
                    break;
                default:
                    Console.WriteLine("Something went wrong in lowest method");
                    break;
            }//end switch

            return highest;
        }//end highestInv

    }
}

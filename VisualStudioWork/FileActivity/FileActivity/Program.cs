//Joseph Steiger
//9/28/21
//File I/O activity
using System;
using System.IO;

namespace FileActivity
{
    class Program
    {
        static void Main(string[] args)
        {
            const string NUMBERS = "Numbers.txt"; //name of numbers file, not really needed, just practice

            //filestream and streamreader to select file to read from, and 
            //the read to read the records for comparison
            FileStream inFile = new FileStream(NUMBERS,
            FileMode.Open, FileAccess.Read); 
            StreamReader reader = new StreamReader(inFile); 

            //filestream and writers to create text file and writer to 
            //place the read values in their appropriate file
            FileStream outFileEven = new FileStream("Evens.txt",
                FileMode.Create, FileAccess.Write); 
            FileStream outFileOdd = new FileStream("Odds.txt",
                FileMode.Create, FileAccess.Write); 
            StreamWriter writerEven = new StreamWriter(outFileEven);
            StreamWriter writerOdds = new StreamWriter(outFileOdd);

            Console.WriteLine("Creating Evens and Odds text files."); //process output text, simply for debugging

            string recordIn = reader.ReadLine(); //string to hold current lines record from reader

            Console.WriteLine("\n------- Evaluating and Writing Records -------\n");

            //while loop that steps through entire file, exiting when no more records founds
            while (recordIn != null)
             {
                if (Convert.ToInt32(recordIn) % 2 == 0) //converts the record to int and uses mod for even
                {
                    writerEven.WriteLine(recordIn); //writes the record to the even file 
                }
                else
                {
                    writerOdds.WriteLine(recordIn); //writes the record to the odd file if not even
                }

                recordIn = reader.ReadLine(); //reads next record
            }

            //closes the files and filestreams
            reader.Close();
            inFile.Close();
            writerEven.Close();
            writerOdds.Close();
            outFileEven.Close();
            outFileOdd.Close();

            Console.WriteLine("*FINISHED*\n(Press \"Enter\" to Close)"); //more debugging
            Console.ReadLine();


            
        }
    }
}

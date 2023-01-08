var userInput;
//The do-while loop ensures the prompt happens at least once to get user input
//as long as the user doesn't enter the flag value, the loop will continue to ask for values
do {
    //entry value is assigned to user input
    userInput = prompt("Enter number grade from 0 through 120 \nOr enter -1 to end entries");

    let letterGrade = replaceGrades(userInput); //calls the replaceGrades function, passing userInput as the argument

    //if the input was valid, display the converted value into an alert
    if (letterGrade != "Bad Value" && userInput != "") {
        alert("Number grade: " + userInput + "\nLetter Grade: " + letterGrade);
    }

} while (userInput != -1); //flag value to exit the loop

//function for converting number grades to letter grades and outputting the grade to the user
function replaceGrades(grade){
    let letterGrade;

    //if else ladder to check the users input for both validation and conversion
    if (grade >= 100 && grade <= 120)
        letterGrade = "A";
    else if (grade >= 80 && grade <= 99)
        letterGrade = "B";
    else if (grade >= 70 && grade <= 79)
        letterGrade = "C";
    else if (grade >= 60 && grade <= 69)
        letterGrade = "D";
    else if (grade < 60 && grade >= 0)
        letterGrade = "F";
    else
        letterGrade = "Bad Value";

    return letterGrade;
}


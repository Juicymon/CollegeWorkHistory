//Global variables
var prevCalc = 0;
var calc = "";

window.onload = function (){

    document.getElementById("btn1").onclick = showNum;
    document.getElementById("btn2").onclick = showNum;
    document.getElementById("btn3").onclick = showNum;
    document.getElementById("btn4").onclick = showNum;
    document.getElementById("btn5").onclick = showNum;
    document.getElementById("btn6").onclick = showNum;
    document.getElementById("btn7").onclick = showNum;
    document.getElementById("btn8").onclick = showNum;
    document.getElementById("btn9").onclick = showNum;
    document.getElementById("btn0").onclick = showNum;

    document.getElementById("btnPlus").onclick = add;
    document.getElementById("btnMinus").onclick = subtract;
    document.getElementById("btnTimes").onclick = multi;
    document.getElementById("btnPow").onclick = power;
    document.getElementById("btnPow2").onclick = powerTwo;
    document.getElementById("btnDivide").onclick = divide;
    document.getElementById("btnDecrement").onclick = decrement;
    document.getElementById("btnIncrement").onclick = increment;
    document.getElementById("btnSqrt").onclick = sqrt;
    document.getElementById("btnFloor").onclick = floor;
    document.getElementById("btnDecimal").onclick = decimal;
    document.getElementById("btnRound").onclick = round;

    document.getElementById("btnReset").onclick = clear;
    document.getElementById("btnCalc").onclick = calculate;
}


//The following function displays a number in the textfield when a number is clicked.
//Note that it keeps concatenating numbers which are clicked. 
function showNum() {
    document.frmCalc.txtNumber.value += this.value;
}

//The following function decreases the value of displayed number by 1.
//isNaN method checks whether the value passed to the method is a number or not.     
function decrement() {
    let num = parseFloat(document.frmCalc.txtNumber.value);
    if (!(isNaN(num))) {
        num--;
        document.frmCalc.txtNumber.value = num;
    }
}

function increment() {
    let num = parseFloat(document.frmCalc.txtNumber.value);
    if (!(isNaN(num))) {
        num++;
        document.frmCalc.txtNumber.value = num;
    }
}

//The following function is called when "Add" button is clicked. 
//Note that it also changes the values of the global variables.       
function add() {
    let num = parseFloat(document.frmCalc.txtNumber.value);
        if (!(isNaN(num))) {
            prevCalc = num;
            document.frmCalc.txtNumber.value = "";
            calc = "Add";
        }
}


//The following function is called when "Calculate" button is clicked.
//Note that this function is dependent on the value of global variable.        
function calculate() {
    let num = parseFloat(document.frmCalc.txtNumber.value);
        if (!(isNaN(num))) {
            if (calc == "Add"){
                var total = prevCalc + num;
                document.frmCalc.txtNumber.value = total;
            }
            else if(calc =="Sub"){
                document.frmCalc.txtNumber.value = (prevCalc - num);
            }
            else if (calc == "Multi"){
                document.frmCalc.txtNumber.value = (prevCalc * num);
            }
            else if (calc == "Power"){
                document.frmCalc.txtNumber.value = (Math.pow(prevCalc, num));
            }
            else if (calc == "Divide"){
                document.frmCalc.txtNumber.value = (prevCalc / num);
            }
}}

function clear() {
    document.frmCalc.txtNumber.value = "";
    prevCalc = 0;
    calc = "";
}

function subtract(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
        if (!(isNaN(num))){
            prevCalc = num;
            document.frmCalc.txtNumber.value = "";
            calc = "Sub";
        }
}

function sqrt(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
        if (!(isNaN(num))){
            num = Math.sqrt(num);
            document.frmCalc.txtNumber.value = num;
        }
}

function multi(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
        if (!(isNaN(num))){
            prevCalc = num;
            document.frmCalc.txtNumber.value = "";
            calc = "Multi";
        }
}

function divide(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
    if (!(isNaN(num))){
        prevCalc = num;
        document.frmCalc.txtNumber.value="";
        calc = "Divide";
    }
}

function powerTwo(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
    if (!(isNaN(num))){
        document.frmCalc.txtNumber.value = Math.pow(num, 2);
    }
}

function power(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
    if(!(isNaN(num))){
        prevCalc = num;
        document.frmCalc.txtNumber.value = "";
        calc = "Power";
    }
}

function floor(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
    if (!(isNaN(num))){
        document.frmCalc.txtNumber.value = Math.floor(num);
    }
}

function decimal(){
        document.frmCalc.txtNumber.value += ".";
}

function round(){
    let num = parseFloat(document.frmCalc.txtNumber.value);
    if (!(isNaN(num))){
        document.frmCalc.txtNumber.value = Math.round(num);
    }
}
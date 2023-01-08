var names = ["Tom", "Lily", "Jose", "Sarah"];
var height = [65, 60, 72, 68];

var $ = function (id) { return document.getElementById(id); };

window.onload = function () {
    $("show_results").onclick = showResult;
    $("add").onclick = addHeight;
    $("display_height").onclick = displayHeight;
    $("name").focus();
};

//function to calculate average height and highest height and display them in the proper html element
function showResult(){
    let avgHeight = 0;
    let tallestHeight = height[0];
    let count = 0;

    //adds and then averages the heights
    for (let i = 0; i < height.length; i++){
        avgHeight += height[i];
    }
    avgHeight = avgHeight/height.length;

    //iterates through the heights to find the largest
    for(let i = 1; i < height.length; i++){
        if (height[i] > tallestHeight){
            tallestHeight = height[i];
            count = i;
        }
    }

    //displays the average height and the name with the tallest height
    //adds a header and two paragraph elements to the results div DOM
    $("result").innerHTML =`<h2>Results</h2> <p>Average Height = ${avgHeight}</p> <p>Highest Height = ${names[count]}
        with a height of ${height[count]}</p>`;
}

//validates user input and either displays an alert for fails or adds the values to their arrays if the
//info is correct
function addHeight(){
    let name = $("name").value
    let heightIn = parseFloat($("height").value)

    //data validation for the height and name
    if ((!isNaN(heightIn) && heightIn >= 0 && heightIn <= 100) && name.trim().length > 0){
        names.push(name);
        height.push(heightIn);
        $("name").value = "";
        $("height").value = "";
        $("name").focus();
    }
    else
        window.alert("You must enter a name and a valid height.");
}

//function to add each array element to an entry in the table element and display them accordingly
function displayHeight(){
    let table = $("height_table");

    table.innerHTML = "<h2>Heights</h2><tr><td><strong>Name</strong></td><td><strong>Heights</strong></td></tr>";

    for (let i = 0; i < height.length; i++) {
        table.innerHTML += `<tr><td>${names[i]}</td><td>${height[i]}</td></tr>`;
    }
}
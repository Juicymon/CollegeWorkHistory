var days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
var duration = [5,6,7,8,4,5,5];

var $ = function(id) { return document.getElementById(id); };

window.onload = function() {
    //event handlers
    $("update").onclick = updateSleep;
    $("average").onclick = showAverageSleep;
    $("track-sleep").onmouseover = displaySleepDuration;
};


function updateSleep(){
    let hours = parseInt($("sleep-time").value);
    let day = $("days").value;
    if (isNaN(hours)){
        window.alert("Enter a valid number");
        $("sleep-time").value="";
    }
    else{
        window.alert("Your updated sleep duration is " + hours + "hrs on " + day);
        duration[days.indexOf(day)] = hours;
    }
}

function showAverageSleep(){
    let average = 0;
    let total = 0;

    for (let i = 0; i < duration.length; i++){
        total += duration[i];
    }
    average = total/duration.length;

    $("avg-sleep").value = parseFloat(average).toFixed(2);

    $("avg-sleep").style.color = "green";
    $("avg-sleep").style.borderColor = "red";
}

function displaySleepDuration(){
    let table = $("sleep_table");
    table.innerHTML="";

    $("result_here").innerHTML = "Hey ! you slept less than 7 hours on the following days";

    let head = table.createTHead();
    let row = head.insertRow();
    let cell1 = row.insertCell();
    cell1.innerHTML = "<b>Day</b>";
    let cell2 = row.insertCell();
    cell2.innerHTML = "<b>Hours</b>";
    for (let i = 0; i < days.length; i++){
        if (duration[i] < 7){
            let tr = table.insertRow();
            let cell1 = tr.insertCell();
            cell1.appendChild(document.createTextNode(days[i]));
            let cell2 = tr.insertCell();
            cell2.appendChild(document.createTextNode(duration[i]));
        }
    }

}
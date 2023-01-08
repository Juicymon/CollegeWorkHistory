var $ = function(id) {
	return document.getElementById(id);
};

var total = 0;

window.onload = function() {


	//add onclick event handler for each image

	// for click event add item to order and update total

	// display order and total

	$("cappuccino-Img").onclick = submit;
	$("espresso-Img").onclick = submit;
		
}; // end onload


function submit(){
	if(isNaN($("total").innerHTML))
	{
		$("total").innerHTML = "0";
	}

	if (this.id == "espresso-Img"){
		$("order").innerText += "$1.95 - Espresso - Delicious Espresso. Wanna try it? \n";
		total += 1.95;
		$("total").innerHTML = "Total $" +  parseFloat(total).toFixed(2);
	}

	else if (this.id == "cappuccino-Img"){
		$("order").innerText += "$3.45 - Cappuccino - Delicious Cappuccino \n";
		total += 3.45;
		$("total").innerHTML = "Total $" + parseFloat(total).toFixed(2);
	}
}



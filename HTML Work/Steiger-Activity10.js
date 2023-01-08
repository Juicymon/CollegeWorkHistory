$(document).ready(function() {


        // preload the image for each link
        var $imgs = new Array();
        $("ul a").each(function(i){
            $imgs.push($("<a>").attr("href", this.href).attr("title", this.title));
        });

        for (let i = 0; i < $imgs.length; i++){
            let $li = $("<li>").append($imgs[i]);
            $("#image_list").append($li);
        }

    // set up the event handlers for each link
    			// get the image URL and caption for each image and animate the caption
            // cancel the default action of each link
        $("main a").click(function(evt){
            evt.preventDefault();
            var thisTitle = this.title;
            var thisHref = this.href;
            $("#caption, #image").fadeOut(3000, function(){
                $("#caption").text(thisTitle);
                $("#image").attr("src", thisHref);
                $("#caption, #image").fadeIn(3000, function(){
                    $("#caption").animate({fontSize: "2em" }).delay(3000);
                });
            });
        });

    // move the focus to the first link
        $("a:first").focus();

}); // end ready
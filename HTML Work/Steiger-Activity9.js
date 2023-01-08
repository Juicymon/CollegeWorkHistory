$(document).ready(function() {

        // get the image URL and id for each image
        var $imgs = new Array();
        $("ul a").each(function(i){
            $imgs.push($("<a>").attr("href", this.href).attr("id", this.id));
        });

        // preload the image for each link
        for (let i = 0; i < $imgs.length; i++){
            let $li = $("<li>").append($imgs[i]);
            $("#image_list").append($li);
        }

        // set up the event handlers for each link
        $("a").click(function(evt){
            // cancel the default action of each link
            evt.preventDefault();
            $("#title").text(this.id);
            $("#image").attr("src", this.href);
        });

        // move the focus to the second link
        $("a:eq(1)").focus();

}); // end ready




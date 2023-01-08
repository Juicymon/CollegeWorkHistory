$(document).ready(function() {
    $("li a").click(function(){
        let title = $(this).attr("title");
        let fileURL = ("json_files/"+title+".json");

        $.ajax({
           type: "get",
           url: fileURL,
           success: function(data){
                $.each(data, function(){
                   $.each(this, function(){
                       $("main h1").html(this.title);
                       $("main h2").html(this.month);
                       $("main h3").html(this.speaker);
                       $("main img").attr("src", this.image);
                       $("main p").html(this.text);
                   });
               });
           }
        });
    });
}); // end ready
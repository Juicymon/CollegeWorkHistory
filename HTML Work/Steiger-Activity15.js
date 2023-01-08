$(document).ready(function(){
    $.getJSON("facultyList.json", function(data){
       $.each(data, function(){
          $.each(this, function(){
              $("#faculty").append(
                  "<img src = '" + this.image + "'>" +
                  "<h2>" + this.full_name + "</h2>" +
                  "<h3>" + this.department + "</h3>" +
                  "<p>" + this.bio + "</p>"
              );
          });
       });
    });
});

$(document).ready(function(){
	$("div.col-md-2").click(function(){
		var myHtml = "<div id='myid' class='row'>" +
						"<div class='col-md-2'>" + "user.firstName" + "</div>" + 
						"<div class='col-md-2'>" + "user.lastName" + "</div>" + 
						"<div class='col-md-2'>" + "user.phone" + "</div>" + 
						"<div class='col-md-2'>" + "user.email" + "</div>" + 
					"</div>";
		
	    if (document.getElementById("newDiv")) {
	    	$( "div#newDiv" ).remove();
	    } else {
	    	var div = $('<div/>')
				.attr("id", "newDiv")
				.addClass("row")
				.append("<span/>")
				.text("hello world");
	    	$(this).parent().after(div);
	    }
	});
	//displayUsersList();
});



function displayUsersList(){
	$.ajax({
		url: "/getUsers",
		type: "GET",
		contentType: "application/json; charset=utf-8",
		success: function(data) {
			var context = "";
			data.forEach(function(user){
				context += "<div class='row'>" +
								"<div class='col-md-2'>"+ 
								"<input class='myid' type='image' src='image/arrow.png' width='20' height='20' alt='Submit'>" +
								"&nbsp"+ user.firstName + "</div>" + 
								"<div class='col-md-2'>" + user.lastName + "</div>" + 
								"<div class='col-md-2'>" + user.phone + "</div>" + 
								"<div class='col-md-2'>" + user.email + "</div>" + 
							"</div>";
				
			});
			$("div.container").append(context);
		},
		error: function() {
			alert("Jquery Error.");
		}
	});
	return null;
}
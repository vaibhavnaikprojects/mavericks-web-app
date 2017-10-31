$(document).ready(function(){
});
$searchType="";
$("#directoryCollection .list-group-item").click(function(){
	$("#directoryCollection .list-group-item").removeClass("active");
	$(this).addClass("active");
	$("#searchDiv").show();
	$("#searchStarterMessage").hide();
	$searchType=$(this).attr('id');
	$("#searchDirectory").val("");
	$("#searchClearButton").hide();
});

$("#searchDirectory").on("keyup",function(){
	console.log($searchType);
	var searchInput=$("#searchDirectory").val();
	if(searchInput!="")
		$("#searchClearButton").show();
	else
		$("#searchClearButton").hide();
	if(searchInput!=""){
		$.ajax({
			type : "GET",
			contentType : "application/json",
			url : encodeURI("api/users/search/"+$searchType+"/"+$('#searchDirectory').val()),
			dataType : 'json',
			success : function(data) {
				console.log("success "+data);
			},
			error : function(e) {
				console.log("error "+e);
			}
		});
	}
});
$("#searchClearButton").on("click",function(){
	$("#searchDirectory").val("");
	$("#searchClearButton").hide();
});


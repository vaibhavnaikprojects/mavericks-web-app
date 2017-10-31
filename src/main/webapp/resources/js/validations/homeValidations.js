$(document).ready(function(){
	$.ajax({
		type : "GET",
		contentType : "application/json",
		url : encodeURI("api/users/"+mavId+"/holditems"),
		dataType : 'json',
		success : function(holdItems) {
			console.log(holdItems);
			$holdItemsArr=holdItems;
			
		},
		error : function(e) {
			console.log(e);
		}
	});
	$.ajax({
		type : "GET",
		contentType : "application/json",
		url : encodeURI("api/users/"+mavId+"/todoItems"),
		dataType : 'json',
		success : function(todoItems) {
			console.log(todoItems);
			$todoItemsArr=todoItems;
		},
		error : function(e) {
			console.log(e);
		}
	});
});

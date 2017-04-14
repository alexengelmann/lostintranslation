$(document).ready(function() {
	$("#btnSubmit").click(function(event) {
		event.preventDefault();
		$.ajax({
			type : "GET",
			dataType : "text",
			data: { label: $("#searchBox").val()},
			url : "search/bylabel",
			success : function(data) {
				$("#result").val(data);
			}
		});
	})
});
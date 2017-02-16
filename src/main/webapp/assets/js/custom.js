var counter = $("#counter").val();
console.log(counter);

function getEmployeeName(counter) {
	$.ajax({
		url : "emp-endpoint?counter=" + counter,
		success : function(data) {
			var parsed = JSON.parse(data);
			var arr = [];
			for ( var x in parsed) {
				arr.push(parsed[x]);
			}
			// console.log(arr);
			// setting employee attributes.
			$("#showEmpId").html(arr[0]);
			$("#showEmpName").html(arr[1]);
			$("#showEmpCity").html(arr[2]);

			$("#counter").val(counter);

		},
		error : function(data) {
			alert('no data found');
			console.log(data);
		}
	});
}
// calling on page load
getEmployeeName(counter);

// calling on next button click
$("#nextBtn").click(function() {
	var counter = $("#counter").val();
	counter = parseInt(counter) + 1;
	console.log("NextBtn" + counter);

	getEmployeeName(counter);
});

// calling on previous button click
$("#prevBtn").click(function() {
	var counter = $("#counter").val();
	counter = parseInt(counter) - 1;
	console.log("NextBtn" + counter);

	getEmployeeName(counter);
});

$("#add").click(function() {
	$.post("emp-endpoint", {
		name : $("#empname").val(),
		city : $("#empcity").val()
	}, function(data, status) {
		alert("Data: " + data + "\nStatus: " + status);
	});
});
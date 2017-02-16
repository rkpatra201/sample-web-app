<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>
<body>
	<h2>Hello World!</h2>
	<div id="showData">
		<h1>Display Employee</h1>
		Employee Id: <span id="showEmpId"></span> <br /> Employee Name: <span
			id="showEmpName"></span> <br /> Employee City: <span
			id="showEmpCity"></span> <br /> <input type="hidden" id="counter"
			value="1" /><input type="button" id="prevBtn" value="Prev" />&nbsp;&nbsp;
		<input type="button" id="nextBtn" value="Next" />
	</div>
	<br />
	<div id="addData">
		<h1>Add Employee</h1>
		<input placeholder="Enter Employee Name" type="text" id="empname" /><br />
		<input placeholder="Enter Employee City" type="text" id="empcity" />
		<input type="button" id="add" value="Add" />
	</div>


	<script src="assets/js/custom.js"></script>
</body>

</html>

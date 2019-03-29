<html>
<head>
<style>
table, th {
	border: 1px solid black;
}
</style>
</head>
<body>
	<form method="post" action="/MyFirstWeb/info">
		<table style="width: 270">
			<tr>
				<th colspan="2"><h3 align="center">PROFILE</h3><br></th>
			</tr>
			<tr>
				<th>First Name:</th>
				<th><input type="text" name="firstName" id="firstName" /><br></th>
			</tr>
			<tr>
				<th>Middle Name:</th>
				<th><input type="text" name="middleName" id="middleName" /><br></th>
			</tr>
			<tr>
				<th>Last Name:</th>
				<th><input type="text" name="lastName" id="lastName" /><br></th>
			</tr>
			<tr>
				<th>Gender:</th>
				<th><input type="radio" name="gender" value="Male" /> Male <input
					type="radio" name="gender" value="Female" /> Female <br></th>
			</tr>
			<tr>
				<th colspan="2" align="center"><input type="Submit"
					value="Submit"></th>
			</tr>
		</table>
	</form>
</body>
</html>

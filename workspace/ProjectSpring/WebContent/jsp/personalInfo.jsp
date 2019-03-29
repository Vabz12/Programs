<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Order processing page</title>
</head>
<body>
	<h2>Person Page</h2>
	<form:form  modelAttribute ="personVO" method="post" action="insertPerson.do">

		<table>
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="middleName">Middle Name</form:label></td>
				<td><form:input path="middleName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="gender">Gender</form:label></td>
				<td><form:input path="gender" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>











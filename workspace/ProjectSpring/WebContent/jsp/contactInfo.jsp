<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Order processing page</title>
</head>
<body>
	<h2>Contact Page</h2>
	<form:form  modelAttribute="personVO" method="post" action="insertContact.do">

		<table>
			<tr>
				<td><form:label path="address">Address</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="city">City</form:label></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td><form:label path="state">State</form:label></td>
				<td><form:input path="state" /></td>
			</tr>
			<tr>
				<td><form:label path="country">Country</form:label></td>
				<td><form:input path="country" /></td>
			</tr>
			<tr>
				<td><form:label path="phone">Phone</form:label></td>
				<td><form:input path="phone" /></td>
			</tr>
	
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>











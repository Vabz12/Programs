<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Order processing page</title>
</head>
<body>
	<h2>Bank Page</h2>
	<form:form  modelAttribute="personVO" method="post" action="insertBank.do">

		<table>
			<tr>
				<td><form:label path="bank">Bank</form:label></td>
				<td><form:input path="bank" /></td>
			</tr>
			<tr>
				<td><form:label path="actNo">Account No</form:label></td>
				<td><form:input path="actNo" /></td>
			</tr>
			<tr>
				<td><form:label path="ssn">SSN</form:label></td>
				<td><form:input path="ssn" /></td>
			</tr>
	
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>











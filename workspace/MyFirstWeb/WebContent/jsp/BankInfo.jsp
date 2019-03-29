
<html>
<head>
<style>
table, th {
	border: 1px solid black;
}
</style>
</head>
<center>
<%@include file="displayformerrors.jsp"%>
</center>
<body>
<body>

		<form method="post" action="/MyFirstWeb/bankInfo">
		<table style="width: 270">
			<tr>
				<th colspan="2"><h3 align="center">BANK</h3> <br></th>
			</tr>
			<tr>
				<th>Bank Name :</th>
				<th><input type="text" name="bankName" /> <br></th>
			</tr>
			<tr>
				<th>Account No :</th>
				<th><input type="text" name="actNo" /> <br></th>
			</tr>
			<tr>
				<th>SSN :</th>
				<th><input type="text" name="ssn" /> <br></th>
			</tr>
			<tr>
				<th colspan="2" align="center"><input type="Submit"
					value="Submit" /></th>
			</tr>
		</table>
	</form>
		<%
	Object obj = request.getAttribute("errorMessage");
	if(obj !=null){
	String message = (String)obj;	
	%>	
	<font color ="red"><%= message %></font>
	<% }%>
	
</body>
</html>
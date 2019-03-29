
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

			<form  method="post" action="/MyFirstWeb/cntctInfo">
		<table style="width: 270">
			<tr>
				<th colspan="2"><h3 align="center">CONTACT</h3> <br></th>
			</tr>
			<tr>
				<th>Address :</th>
				<th><input type="text" name="address" /> <br></th>
			</tr>
			<tr>
				<th>City :</th>
				<th><input type="text" name="city" /> <br></th>
			</tr>
			<tr>
				<th>State :</th>
				<th><input type="text" name="state" /> <br></th>
			</tr>
			<tr>
				<th>Country :</th>
				<th><input type="text" name="country" /> <br></th>
			</tr>
			<tr>
				<th>Phone :</th>
				<th><input type="text" name="phone" /> <br></th>
			</tr>

			<tr>
				<th colspan="2" align="center"><input type="Submit"
					value="Submit" /></th>
			</tr>
		</table>
	</form>
		<%
	Object obj = request.getAttribute("errorMessage");
	if(obj != null){
	String message = (String)obj;	
	%>	
	<font color ="red"><%= message %></font>
	<% }%>
	
</body>
</html>
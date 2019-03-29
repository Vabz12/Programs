<HTML>
<head>
<style>
table, th {
	border: 1px solid black;
}
</style>
<BODY>
	<br>
	<font color="blue">=============== PROFILE DETAILS
		===============</font>
	<br>
	<br>
	<br>
	<%
		String varFirstName = (String) request.getSession().getAttribute("ofname");
		String varLastName = (String) request.getSession().getAttribute("olname");
		String varMiddleName = (String) request.getSession().getAttribute("omname");
		String varGender = (String) request.getSession().getAttribute("ogender");
		String varAddress = (String) request.getSession().getAttribute("oaddress");
		String varCity = (String) request.getSession().getAttribute("ocity");
		String varState = (String) request.getSession().getAttribute("ostate");
		String varCountry = (String) request.getSession().getAttribute("ocountry");
		String varPhone = (String) request.getSession().getAttribute("ophone");
		String varBankName = (String) request.getSession().getAttribute("obankName");
		String varAccountNo = (String) request.getSession().getAttribute("oaccountNo");
		String varSSN = (String) request.getSession().getAttribute("ossn");
	%>

	<table>
		<tr>
			<th>FirstName :</th>
			<th colspan="2" align="center">
				<%
					if (varFirstName != null) {
				%> <%=varFirstName%> <br> <%
 	}
 %> <br>
		<tr>
			<th>LastName :</th>
			<th colspan="2" align="center">
				<%
					if (varLastName != null) {
				%> <%=varLastName%> <br> <%
 	}
 %> <br>
		<tr>
			<th>MiddleName :</th>
			<th colspan="2" align="center">
				<%
					if (varMiddleName != null) {
				%> <%=varMiddleName%> <br> <%
 	}
 %> <br>
		<tr>
			<th>Gender :</th>
			<th colspan="2" align="center">
				<%
					if (varGender != null) {
				%> <%=varGender%> <br> <%
 	}
 %> <br>
		<tr>
			<th>Address :</th>
			<th colspan="2" align="center">
				<%
					if (varAddress != null) {
				%> <%=varAddress%> <br> <%
 	}
 %> <br>
		<tr>
			<th>City :</th>
			<th colspan="2" align="center">
				<%
					if (varCity != null) {
				%> <%=varCity%> <br> <%
 	}
 %> <br>
		<tr>
			<th>State :</th>
			<th colspan="2" align="center">
				<%
					if (varState != null) {
				%> <%=varState%> <br> <%
 	}
 %> <br>
		<tr>
			<th>Country :</th>
			<th colspan="2" align="center">
				<%
					if (varCountry != null) {
				%> <%=varCountry%> <br> <%
 	}
 %> <br>
		<tr>
			<th>Phone :</th>
			<th colspan="2" align="center">
				<%
					if (varPhone != null) {
				%> <%=varPhone%> <br> <%
 	}
 %> <br>
		<tr>
			<th>Bank Name :</th>
			<th colspan="2" align="center">
				<%
					if (varBankName != null) {
				%> <%=varBankName%> <br> <%
 	}
 %> <br>
		<tr>
			<th>Account No :</th>
			<th colspan="2" align="center">
				<%
					if (varAccountNo != null) {
				%> <%=varAccountNo%> <br> <%
 	}
 %> <br>
		<tr>
			<th>S.S.N :</th>
			<th colspan="2" align="center">
				<%
					if (varSSN != null) {
				%> <%=varSSN%> <br> <%
 	}
 %>
			
	</table>
	<br>
	<font color="blue">================ || THANK YOU ||
		================</font>
</BODY>
</head>
</HTML>
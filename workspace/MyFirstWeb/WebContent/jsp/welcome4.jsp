
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<HTML>
<head>
<style>
table, th {
	border: 1px solid black;
}
</style>
</head>
<BODY>
	<h1>
		<font color="Blue"> Output Page By JSTL </font>
	</h1>
	<font color="Black">================ PROFILE ================</font>
	
	<table style= "width: 270"> <tr>
	<tr><td><h4>Person Info</h4>
	<tr><th>First Name :</th>
	<th colspan="2"> <c:out value="${personalInfo.firstName}" />

    <tr><th>Middle Name :</th> 
	<th colspan="2"><c:out value="${personalInfo.middleName}" />
	
	<tr><th>Last Name : </th>
	<th colspan = "2"><c:out value="${personalInfo.lastName}" />
	
	<tr><th>Gender :</th>
	<th colspan="2"><c:out value="${personalInfo.gender}" />
	
	<tr><td><h4>Address Info</h4>
	<tr><th>Address :</th>
	<th colspan="2"> <c:out value="${personalInfo.address}" /> 
	
	<tr><th>City :</th>
	<th colspan="2"> <c:out value="${personalInfo.city}" /> 
	
	<tr><th>State :</th>
	<th colspan="2"> <c:out value="${personalInfo.state}" />
	
	<tr><th>Country : </th>
	<th colspan="2"><c:out value="${personalInfo.country}" /> 
 	
 	<tr><th>Phone : </th>
 	<th colspan="2"><c:out value="${personalInfo.phone}" /> 
    
    <tr><td><h4>Bank Info</h4>
    <tr><th>Bank : </th>
    <th colspan="2"><c:out value="${personalInfo.bank}" />
 	
 	<tr><th>Account Number : </th>
 	<th colspan="2"><c:out value="${personalInfo.actNo}" /> 
		
	<tr><th>SSN : </th>
	<th colspan="2"><c:out value="${personalInfo.ssn}" />
	
	</table>
		<font color="Black">================ Thank You ================</font>

</BODY>
</HTML>

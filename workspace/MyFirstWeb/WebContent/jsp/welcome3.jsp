
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
		<font color="Blue"> Output Page By JavaBeans </font>
	</h1>
	<font color="Black">================ Your Details ================</font>
	
	
	
	<jsp:useBean id="personalInfo"
		class="com.as.bo.PersonProfileBean" scope="session"></jsp:useBean>
   	<jsp:useBean id="contactInfo"
		class="com.as.bo.PersonProfileBean" scope="session"></jsp:useBean>
		<jsp:useBean id="bankInfo"
		class="com.as.bo.PersonProfileBean" scope="session"></jsp:useBean>	 --%>
        
    <table style= "width: 270"> <tr>
	<tr><td><h4>Person Info</h4>    
	
	<tr><th>First Name:</th><th>
	<jsp:getProperty property="firstName" name="personalInfo" /></th>
	
	<tr><th>Middle Name :</th><th>
	<jsp:getProperty property="middleName" name="personalInfo" /> </th>
	
	<tr><th>Last Name :</th><th>
	<jsp:getProperty property="lastName" name="personalInfo" /></th>
	
	<tr><th> Gender :</th><th>
	<jsp:getProperty property="gender" name="personalInfo" /></th>
	
	<tr><td><h4>Address Info</h4>
	<tr><th> Address :</th><th>
	<jsp:getProperty property="address" name="contactInfo" /></th>
	
	<tr><th> City :</th><th>
	<jsp:getProperty property="city" name="contactInfo" /></th>
	
	<tr><th>State :</th><th>
	<jsp:getProperty property="state" name="contactInfo" /></th>
	
	 <tr><th>Country :</th><th>
	<jsp:getProperty property="country" name="contactInfo" /></th>
	
	 <tr><th>Phone :</th><th>
	<jsp:getProperty property="phone" name="contactInfo" /></th>
	
	<tr><td><h4>Bank Info</h4>
	 <tr><th>Bank Name :</th><th>
	<jsp:getProperty property="bank" name="bankInfo" /></th>
	
	 <tr><th>Account Num :</th><th>
	<jsp:getProperty property="actNo" name="bankInfo" /></th>
	
	 <tr><th>SSN :</th><th>
	<jsp:getProperty property="ssn" name="bankInfo" /></th>
	
	</table>
	<font color="Black">================ Thank You ================</font>
</BODY>
</HTML>

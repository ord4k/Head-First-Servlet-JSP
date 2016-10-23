<html><body>

	<jsp:useBean id="person" type="foo.Employee" class="foo.Employee">
		<jsp:setProperty name="person" property="*" />
	</jsp:useBean>
	
	Person is: <jsp:getProperty name="person" property="name" />
	Id is <jsp:getProperty name="person" property="empID" />
	
</body></html>
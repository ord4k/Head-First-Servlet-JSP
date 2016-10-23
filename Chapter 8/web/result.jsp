<%@ page import="java.util.*" %>

<html>
<body>
<%@ include file="Header.jsp" %> <br>

<%
	List styles = (List)request.getAttribute("styles");
	String adminEmail = request.getAttribute("adminEmail").toString();
	Iterator it = styles.iterator();
	while(it.hasNext()) {
		out.print("<br>try: " + it.next());
	}
	out.print("<br>" + "email " + adminEmail);
	%>
	
<%@ include file="Footer.jsp" %>
</body>
</html>

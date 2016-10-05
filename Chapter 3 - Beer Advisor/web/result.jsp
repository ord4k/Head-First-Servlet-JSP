<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Beer Recomendations JSP </h1>
<p>

<%
	List styles = (List)request.getAttribute("styles");
	String adminEmail = request.getAttribute("adminEmail").toString();
	Iterator it = styles.iterator();
	while(it.hasNext()) {
		out.print("<br>try: " + it.next());
	}
	out.print("<br>" + "email " + adminEmail);
	%>
	
</body>
</html>

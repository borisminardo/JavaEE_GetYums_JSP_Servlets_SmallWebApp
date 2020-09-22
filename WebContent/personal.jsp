<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("username")== null)
		response.sendRedirect("login.jsp");
%>

<span style="float:left;">
<form method="get" action="welcome.jsp">
    <button type="submit">home</button>
</form>
</span>
<span style="float:left;">
<form action="logout" >
<input type="submit" value="logout"> 
</form>
</span>
<br>
<h2>Personal area di ${username}</h2>
Username: ${username}<br>
Password: ${password}<br>
Yums: ${yums}<br>
<br>

<form action="spendyums" >
<input type="submit" value="spend yums">
</form>
<form action="getyums" >
<input type="submit" value="get yums">
</form>

<%
		session.getAttribute("noyums");
%>
<h4> ${noyums}</h4>

</body>
</html>
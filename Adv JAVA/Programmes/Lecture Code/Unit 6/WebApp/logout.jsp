<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Logout</title>
</head>
<body>
<%
    HttpSession session = request.getSession(false);
    if (session != null) {
        session.invalidate(); // Invalidate session
    }
    
    // Delete the cookie
    Cookie userCookie = new Cookie("username", null);
    userCookie.setMaxAge(0); // Remove the cookie
    response.addCookie(userCookie);
%>
    <h2>You have successfully logged out. <a href="index.jsp">Login again</a>.</h2>
</body>
</html>

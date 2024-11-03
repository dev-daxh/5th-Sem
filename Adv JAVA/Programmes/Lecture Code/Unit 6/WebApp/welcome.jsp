<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // Simple user validation (in real applications, use a database)
    if ("user".equals(username) && "pass".equals(password)) {
        // Create a new session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        
        // Set a cookie
        Cookie userCookie = new Cookie("username", username);
        userCookie.setMaxAge(60*60); // 1 hour
        response.addCookie(userCookie);
%>
        <h2>Welcome, <%= username %>!</h2>
        <a href="logout.jsp">Logout</a>
<%
    } else {
%>
        <h2>Invalid login. Please <a href="index.jsp">try again</a>.</h2>
<%
    }
%>
</body>
</html>

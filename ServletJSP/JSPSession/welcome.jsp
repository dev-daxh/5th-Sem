<%-- 
    Document   : welcome
    Created on : 10 Nov 2024, 9:43:01 pm
    Author     : devdaksh
--%>

<%@ page language="java" contentType="text/html;" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome to your session!</h2>

    <% 
        // Retrieve session attributes
        String name = (String) session.getAttribute("name");
        String email = (String) session.getAttribute("email");

        if (name != null && email != null) {
    %>
        <p>Welcome, <%= name %>! Your email is <%= email %>.</p>
    <% 
        } else {
    %>
        <p>No session data found. Please make sure you have entered your details.</p>
    <% 
        }
    %>

    <br><br>
    <a href="index.html">Go Back</a>
</body>
</html>


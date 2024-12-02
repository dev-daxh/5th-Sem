<%-- 
    Document   : session.jsp
    Created on : 10 Nov 2024, 9:43:01 pm
    Author     : devdaksh
--%>

<%@ page language="java" contentType="text/html;"%>
<html>
<head>
    <title>Session Information</title>
</head>
<body>
    <h2>Session attributes set successfully!</h2>

    <% 
        // Get parameters from the request
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Set session attributes
        session.setAttribute("name", name);
        session.setAttribute("email", email);
    %>

    <p>Your session has been created with the following information:</p>
    <ul>
        <li>Name: <%= name %></li>
        <li>Email: <%= email %></li>
    </ul>

    <br><br>
    <a href="welcome.jsp">Go to Welcome Page</a>
</body>
</html>


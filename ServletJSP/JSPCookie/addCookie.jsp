<%-- 
    Document   : addcookie
    Created on : 10 Nov 2024, 9:33:01 pm
    Author     : devdaksh
--%>

<%@ page language="java" contentType="text/html;" %>
<html>
<head>
    <title>Cookie Added</title>
</head>
<body>
    <h2>Dear <%= request.getParameter("name") %>, your cookie has been added!</h2>
    
    <%-- Create the cookie to store the user's name --%>
    <%
        String userName = request.getParameter("name");
        if (userName != null && !userName.isEmpty()) {
            // Create a cookie to store the user's name
            Cookie userCookie = new Cookie("username", userName);
            userCookie.setMaxAge(60 * 60 * 24);  // Cookie will last for 1 day
            response.addCookie(userCookie); // Add the cookie to the response
        }
    %>
    <h2>Dear <%= userName %>, Cookie added !</h2>
    <br><br>
    <form action="getCookie.jsp" method="GET">
        <input type="submit" value="Show All Cookies">
    </form>
</body>
</html>

<%-- 
    Document   : getCookie
    Created on : 10 Nov 2024, 9:33:01 pm
    Author     : devdaksh
--%>

<%@ page language="java" contentType="text/html;" %>
<html>
<head>
    <title>Show All Cookies</title>
</head>
<body>
    <h2>Cookies stored in your browser:</h2>

    <% 
        // Get all cookies
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null) {
            boolean cookieFound = false;
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    cookieFound = true;
                    out.println("<p>Cookie 'username' = " + cookie.getValue() + "</p>");
                }
            }
            if (!cookieFound) {
                out.println("<p>No 'username' cookie found.</p>");
            }
        } else {
            out.println("<p>No cookies found.</p>");
        }
    %>
    
    <br><br>
    <a href="index.html">Go Back</a>
</body>
</html>

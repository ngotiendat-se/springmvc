<%--
  Created by IntelliJ IDEA.
  User: datnt
  Date: 10/1/2016
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>Login Form</h1>
    <form action="/login/submit" method="post">
        Username: <input name="inputUsername" placeholder="your username or email address" value="" type="text"/><br/>
        Password: <input name="inputPassword" type="password"/>
        <button type="submit">Login</button>
    </form>
</body>
</html>

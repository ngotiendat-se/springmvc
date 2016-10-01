<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: datnt
  Date: 10/1/2016
  Time: 12:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person Manage Page</title>
</head>
<body>
    <h1>${customer.fullName}</h1>
    <h1>List of Person</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
        </tr>
        <c:forEach items="${customers}" var="entry">
            <tr>
                <td>${entry.value.fullName}</td>
                <td>${entry.value.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

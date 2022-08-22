<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>On this page you can view organizations were clinical research hold</h1>
<h2>Organizations</h2>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>phone</th>
        <th>email</th>
    </tr>
    <c:forEach var="organization" items="${organizations}">
        <tr>
            <td>${organization.id}</td>
            <td>${organization.name}</td>
            <td>${organization.phone}</td>
            <td>${organization.email}</td>
            <td><a href="${pageContext.request.contextPath}/edit/${organization.id}"> EDIT</a>
                <a href="${pageContext.request.contextPath}/delete/${organization.id}"> DELETE</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

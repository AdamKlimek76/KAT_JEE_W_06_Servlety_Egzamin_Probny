<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2021
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${smurfs}" var="smurf">
        <tr>
            <td>${smurf.name}, ${smurf.attribute}, ${smurf.description}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

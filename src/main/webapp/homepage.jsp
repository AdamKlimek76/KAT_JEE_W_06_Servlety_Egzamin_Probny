<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2021
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<c:if test="${empty cookie.cookieacc}">
    <a href='<c:url value="/acceptcookie" />'>Kliknij, jesli akceptujesz pliku Cookie</a><br>
</c:if>
</body>
</html>

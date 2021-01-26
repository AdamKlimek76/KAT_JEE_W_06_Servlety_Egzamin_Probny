<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2021
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href='<c:url value="/receiver?name=coder&mail=coder@somemail.com&id=34" />'>Link zadanie 1</a><br>
<a href='<c:url value="/smurfs" />'>Link do zadania 2</a><br>
<a href='<c:url value="/addquote" />'>Link addquote</a><br>
<a href='<c:url value="/randomquote" />'>Link do randomquote</a><br>
<a href='<c:url value="/homepage" />'>Link do zadania 5</a><br>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2021
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/receiver" method="get">
    Name:
    <input type="text" name="name">
    Mail:
    <input type="text" name="mail">
    Id:
    <input type="number" name="id">
    <input type="submit" value="Wyślij">
</form>
</body>
</html>

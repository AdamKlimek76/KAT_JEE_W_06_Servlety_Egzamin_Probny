<%--
  Created by IntelliJ IDEA.
  User: adam
  Date: 26.01.2021
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addquote" method="post">
    Author:
    <input type="text" name="author">
    Content:
    <input type="text" name="content">
    <input type="submit" value="Wyślij">
</form>
</body>
</html>

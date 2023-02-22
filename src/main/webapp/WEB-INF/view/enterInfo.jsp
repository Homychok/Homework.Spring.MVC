<%--
  Created by IntelliJ IDEA.
  User: Mvideo105
  Date: 22.02.2023
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Введите название страны и ее столицу </h1>
<br>
<%--<h3>Страна</h3>--%>
<form action="showInfo" method="get">
    <h3>Страна</h3>
    <input type="text" name="country" >
    <h3>Столица </h3>
    <input type="text" name="capital" >
    <br>
    <input type="submit" >

<%--    <input type="submit">--%>
</form>
<%--<form action="showInfoCapital" method="get">--%>
<%--     <input type="text" name="capital">--%>
<%--    <br>--%>
<%--    <input type="submit">--%>
<%--</form>--%>

</body>
</html>

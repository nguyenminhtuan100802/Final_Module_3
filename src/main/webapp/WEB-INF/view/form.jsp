<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 11/6/2024
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
<form action="/home?action=add" method="post">
    Ten: <input type="text" name="ten"> <br>
    Sdt: <input type="text" name="sdt"> <br>
    Ngay bat dau: <input type="text" name="date"><br>
    Thanh toan:
    <select name="tt" id="">
        <option value="1">THANG</option>
        <option value="2">QUY</option>
        <option value="3">NAM</option>
    </select><br>
    Ghi chu: <input type="text" name="ghi-chu"><br>
    <input type="submit" value="Tao moi">
</form>
</body>
</html>

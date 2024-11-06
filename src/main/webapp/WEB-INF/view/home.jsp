<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 11/6/2024
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Home</title>
    <style>
        table{
            border-collapse: collapse;
            border: 1px solid black;
        }
        tr, th, td{
            border: 1px solid black;
        }
    </style>
</head>
<body>
<h2>Danh Sách Người Thuê Trọ</h2>
<a href="/home?action=add">Thêm Người Thuê Trọ</a>
<table>
    <tr>
        <th>Mã Phòng</th>
        <th>Họ Tên</th>
        <th>Số Điện Thoại</th>
        <th>Ngày Bắt Đầu Thuê</th>
        <th>Hình Thức Thanh Toán</th>
        <th>Ghi Chú</th>
        <th>Thao Tác</th>
    </tr>
    <c:forEach var="nguoiThueTro" items="${nguoiThueTroList}">
        <tr>
            <td>PT-${nguoiThueTro.maPhongTro}</td>
            <td>${nguoiThueTro.ten}</td>
            <td>${nguoiThueTro.sdt}</td>
            <td>${nguoiThueTro.ngayBatDau}</td>
            <td>${nguoiThueTro.hinhThucThanhToan}</td>
            <td>${nguoiThueTro.ghiChu}</td>
            <td><a href="javascript:void(0);" onclick="confirmDelete(${nguoiThueTro.maPhongTro});">Xóa</a></td>
        </tr>
    </c:forEach>
</table>
<script>
    function confirmDelete(maPhongTro) {
        if (confirm("Bạn có chắc chắn muốn xóa người dùng này không?")) {
            // Chuyển hướng đến URL xóa người dùng nếu được xác nhận
            window.location.href = `${pageContext.request.contextPath}/home?action=delete&id=` + maPhongTro;
        }
    }
</script>
</body>
</html>

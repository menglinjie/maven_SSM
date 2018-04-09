<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
    <h2>恭喜您！${sessionScope.user.username},您的年龄是${sessionScope.user.password}岁</h2>
</body>
</html>

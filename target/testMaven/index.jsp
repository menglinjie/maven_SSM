<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="manage" value="${pageContext.request.contextPath}" />
<html>
<head>
  <title>登录</title>
</head>
<body>
<form action="${manage}/user/login">
  用户名：<input type="text" name="name" /><br/>
  年龄：<input type="number" name="age"><br/>
  <input type="submit" value="登录" /><br/>
</form>
</body>
</html>

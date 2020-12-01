<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page import="static java.nio.charset.StandardCharsets.ISO_8859_1" %><%--
  Created by IntelliJ IDEA.
  User: 16862
  Date: 2020/5/10
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <a href="account/findAll">测试查询</a><br>
       <form action="/account/save" method="post">
           姓名：<input type="text" name="name">
           价格：<input type="text" name="money">
           <input type="submit" value="保存" />
       </form>
</body>
</html>

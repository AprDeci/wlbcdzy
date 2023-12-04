<%@ page import="top.aprdec.pojo.essay" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% essay essay = (top.aprdec.pojo.essay) request.getAttribute("about");
String title = essay.getTitle();
String text = essay.getText();
%>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="./css/about.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
        <span>关于我们</span>
        <span>当前位置:首页->关于我们</span>
        <hr>
        <div class="details">
           <p><%= text %></p>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

<%@ page import="top.aprdec.pojo.news" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("utf-8");%>
<%news news = (news) request.getAttribute("news");

%>
<html>
<head>
    <title><%= news.getTitle() %></title>
    <link rel="stylesheet" type="text/css" href="./css/newsdetail.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
    <span><%= news.getTitle() %></span>
    <span>当前位置:首页->新闻信息</span>
    <hr>
    <div class="details">
        <p><%= news.getText() %></p>
    </div>
</div>


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

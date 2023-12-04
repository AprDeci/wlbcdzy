<%@ page import="top.aprdec.pojo.news" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<news> newsList = (List<news>) request.getAttribute("newslist");
List<String> typeList = (List<String>) request.getAttribute("types");%>
<%--<%request.setCharacterEncoding("utf-8"); %>--%>
<html>
<head>
    <title>新闻信息</title>
    <link rel="stylesheet" type="text/css" href="./css/news.css">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<div class="container">
    <div class="tr">
        <P id="title">新闻类型</P>
        <hr>
        <ul>
            <% for (String type : typeList) { %>
            <li><a href="/newsServlet?type=<%= type %>"><%= type %></a></li>
            <% } %>
        </ul>
    </div>
    <div class="list">
        <span>新闻信息</span>
        <span>当前位置:首页->新闻信息</span>
        <hr>
        <% for (news newss : newsList) { %>
        <jsp:include page="newsmodule.jsp">
            <jsp:param name="img" value="<%= newss.getImg() %>"/>
            <jsp:param name="title" value="<%= newss.getTitle() %>"/>
            <jsp:param name="text" value="<%= newss.getText() %>"/>
            <jsp:param name="id" value="<%= newss.getId() %>"/>
        </jsp:include>
        <% } %>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

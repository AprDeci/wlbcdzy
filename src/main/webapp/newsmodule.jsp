<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("utf-8"); %>
<html>
<head>
    <title>newsmoudle</title>
</head>
<script src="./js/jquery.min.js"></script>
<%
  String img = request.getParameter("img");
  String title = request.getParameter("title");
  String text = request.getParameter("text").substring(0,25)+"......";
%>
</head>
<body>
<div class="new-list">
  <img id="newsimg" src="${param.img}" alt="">
  <div class="news-intro">
    <p id="newstitle"><%= title %></p>
    <p id="newstext"><%= text %></p>
    <a href="/newsdetailServlet?id=${param.id}">MORE<img src="./imgs/more.svg" style="width: 20px; height: 20px;"></a>
  </div>
</div>
</body>

</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="top.aprdec.pojo.essay" %>
<%@ page import="top.aprdec.pojo.news" %>
<%@ page import="java.util.List" %>
<% essay essay = (top.aprdec.pojo.essay) request.getAttribute("about");
List<news> newsList = (List<news>) request.getAttribute("news");
String abouttext = essay.getText().substring(0,100)+"...";
news new1 = newsList.get(0);news new2 = newsList.get(1);
String newname1 = new1.getTitle();String newname2 = new2.getTitle();
String newtext1 = new1.getText().substring(0,50)+"...";String newtext2 = new2.getText().substring(0,50)+"...";%>

<html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<div class="about">
    <div>
        <img id="aboutimg" src="./imgs/about.jpg" alt="">
        <div id="abouttext">
            <span id="about-title" class="column-title">关于我们</span>
            <span class="MORE">MORE</span>
            <hr>
            <p><%= abouttext%></p>
        </div>
    </div>
</div>
<div class="news">
    <span class="column-title">新闻信息</span>
    <span class="MORE">MORE</span>
    <div class="newscontainer" id="news-one">
        <img src="<%= new1.getImg()%>" alt="">
        <div>
            <p><%= newname1%></p>
            <hr>
            <p><%= newtext1%></p>
        </div>
    </div>
    <div class="newscontainer" id="news-two">
        <img src="<%= new2.getImg()%>" alt="">
        <div>
            <p><%= newname2%></p>
            <hr>
            <p><%= newtext2%></p>
        </div>
    </div>
</div>
<div class="products">
    <span class="column-title">产品信息</span>
    <span class="MORE">MORE</span>
    <div class="product" id="product-one">
        <p>产品1号</p>
        <img src="./imgs/productsimg.png" alt="">
    </div>
    <div class="product" id="product-two">
        <p>产品2号</p>
        <img src="./imgs/productsimg.png" alt="">
    </div>
    <div class="product" id="product-three">
        <p>产品3号</p>
        <img src="./imgs/productsimg.png" alt="">
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
<script>

</script>
</html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

    </style>
</head>
<body>
<% String name = request.getParameter("name");
String model = request.getParameter("model");
String price = request.getParameter("price");
String sales = request.getParameter("sales");%>
<div class="productttt">
    <img src="${param.img}" alt="">
    <div class="details">
        <p id="name">产品名称:<%=name%></p>
        <p id="model">型号:<%=model%></p>
        <span id="price">¥<%=price%></span><span id="sales"><%=sales%>人付款</span><br/>
        <a href="/productdetailServlet?id=${param.id}">MORE<img src="./imgs/more.svg" style="width: 20px; height: 20px; vertical-align: middle; margin:0"></a>
    </div>
</div>
</body>

</html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="top.aprdec.pojo.product" %>
<% product product = (product) request.getAttribute("product");
String name = product.getName();
String model = product.getModel();
double price = product.getPrice();
int sales = product.getSales();
String intro = product.getIntroduction();%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="./css/productdetail.css">
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
    <div class="product-image">
        <img src="<%=product.getImg()%>" alt="Product Image">
    </div>
    <div class="product-info">
        <h1><%=name%></h1>
        <p class="price">¥<%=price%></p>
        <p>商品型号: <%=model%></p>
        <p>颜色: 红色</p>
        <p>库存: <%=sales%></p>
        <div class="description">
            <h2>商品描述</h2>
            <p><%=intro%>></p>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

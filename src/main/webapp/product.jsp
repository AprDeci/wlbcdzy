
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="top.aprdec.pojo.product" %>
<%@ page import="java.util.List" %>
<% List<product> productList = (List<product>) request.getAttribute("products");
    List<String> types = (List<String>) request.getAttribute("types");%>

<html>
<head>
    <title>产品信息</title>
    <style>

    </style>
    <link rel="stylesheet" type="text/css" href="./css/product.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">
    <div class="tr">
        <P id="title">产品类型</P>
        <hr>
        <ul>
        <% for (String type : types) { %>
        <li><a href="/productServlet?type=<%= type %>"><%= type %></a></li>
        <% } %>
        </ul>
    </div>
    <div class="list">
        <span>产品信息</span>
        <span>当前位置:首页->产品信息</span>
        <hr>
        <% for(product products : productList) { %>
        <jsp:include page="productmodule.jsp">
            <jsp:param name="id" value="<%= products.getId() %>"/>
            <jsp:param name="img" value="<%= products.getImg() %>"/>
            <jsp:param name="name" value="<%= products.getName() %>"/>
            <jsp:param name="model" value="<%= products.getModel() %>"/>
            <jsp:param name="price" value="<%= products.getPrice()%>"/>
            <jsp:param name="sales" value="<%= products.getSales() %>"/>
        </jsp:include>
        <% } %>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>

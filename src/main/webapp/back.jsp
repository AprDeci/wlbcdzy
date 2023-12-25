<%@ page import="top.aprdec.pojo.user" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String identity= (String) request.getAttribute("identity");
if (identity==null){
    request.setAttribute("error","请登录进入后台");
    request.getRequestDispatcher("login.jsp").forward(request,response);
}
if(!identity.equals("管理员")){
}%>
<html>
<head>
  <title>后台框架</title>
</head>


<style>
  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }

  body {
    font-family: Arial, sans-serif;
    background-color: #f5f5f5;
  }

  .topbar {
    border: 1px solid black;
    height: 60px;
    padding: 10px;
    display: flex;
    align-items: center;
    justify-content: flex-end;
    background-color: #007920;
  }
  .topbar a{
    color: white;
    text-decoration: none;
  }
  .topbar a:nth-child(1){
    position: relative;
    right: 85%;
  }
  .container {
    display: flex;
  }

  .sidebar {
    border: 1px solid black;
    color: #fff;
    width: 200px;
    height: 100vh;
    padding: 20px;
    background-color: #007920;
  }

  .content {
    border: 1px solid black;
    flex: 1;
    padding: 20px;
    background-color: #fff;
  }

  .sidebar a {
    display: block;
    color: #fff;
    text-decoration: none;
    margin-bottom: 10px;
    padding: 5px;
  }

  .sidebar a:hover {
    background-color: #555;
  }

  .content iframe {
    border: none;
    width: 100%;
    height: calc(100vh - 100px);
  }
</style>
</head>
<body>
<div class="topbar">
  <a href="indexServlet">XX公司门户后台</a>
  <a href="loginServlet">退出</a>
</div>

<div class="container">
  <div class="sidebar">
    <a href="/backNewsServlet" target="content-iframe">新闻管理</a>
    <a href="/backProductServlet" target="content-iframe">产品管理</a>
    <a href="/backUserServlet" target="content-iframe">用户管理</a>
  </div>

  <div class="content">
    <iframe src="/backNewsServlet" name="content-iframe"></iframe>
  </div>
</div>
</body>
</html>
</body>
</html>

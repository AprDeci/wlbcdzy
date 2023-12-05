<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<title>后台框架</title>
<style>
  *{
    margin: 0;
    padding: 0;
  }
  /* 顶部栏样式 */
  .topbar {
    border: black solid 1px;
    height: 60px;
    padding: 10px;
    display: flex;
    align-items: center;
    justify-content: flex-end;
  }

  /* 容器样式 */
  .container {
    display: flex;
  }

  /* 侧边栏样式 */
  .sidebar {
    border: black solid 1px;
    color: #fff;
    width: 200px;
    height: 100vh;
    padding: 20px;
  }

  /* 功能区样式 */
  .content {
    border: black solid 1px;
    flex: 1;
    padding: 20px;
  }

  /* iframe 样式 */
  iframe {
    border: none;
    width: 100%;
    height: 100%;
  }
</style>
</head>
<body>
<div class="topbar">
  <!-- 在这里放置顶部栏内容 -->
  <a href="#">用户</a>
  <a href="#">设置</a>
  <a href="#">退出</a>
</div>

<div class="container">
  <div class="sidebar">
    <!-- 在这里放置侧边栏内容 -->
    <a href="dashboard.html" target="content-iframe">仪表盘</a>
    <a href="/backNewsServlet" target="content-iframe">新闻管理</a>
    <a href="/backProductServlet" target="content-iframe">产品管理</a>
    <a href="/backUserServlet" target="content-iframe">用户管理</a>
  </div>

  <div class="content">
    <!-- 用于显示功能区内容的 iframe -->
    <iframe src="dashboard.html" name="content-iframe"></iframe>
  </div>
</div>
</body>
</html>
</body>
</html>

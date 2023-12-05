<%@ page import="java.util.List" %>
<%@ page import="top.aprdec.pojo.product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<product> products = (List<product>) request.getAttribute("products");%>
<html>
<head>
  <title>$Title$</title>
  <link rel="stylesheet" type="text/css" href="./css/backProducts.css">
</head>
<script src="../js/jquery.min.js"></script>
<body>
<table>
  <tr>
    <th>图片</th>
    <th>名称</th>
    <th>类型</th>
    <th>型号</th>
    <th>功能</th>
    <th>价格</th>
    <th>销量</th>
    <th>介绍</th>
  </tr>
  <%for (product product:products){%>
  <tr>
    <td><img src="<%=product.getImg()%>"></td>
    <td><%=product.getName()%></td>
    <td><%=product.getType()%></td>
    <td><%=product.getModel()%></td>
    <td><%=product.getFunction()%></td>
    <td><%=product.getPrice()%></td>
    <td><%=product.getSales()%></td>
    <td><%=product.getIntroduction().substring(0,50)+",,,"%></td>
    <td><button class="deletebt" dataid="<%=product.getId()%>">删除</button>
      <button class="changebt" dataid="<%=product.getId()%>">修改</button></td>
  </tr>
  <%}%>
</table>

<!-- 修改弹窗 -->
<div id="modal" class="modal">
  <div class="modal-content">
    <span class="close">X</span>
    <h2>新闻修改</h2>
    <form id="form" action="/newsupdate">
      <input type="text" id="id" name="id">
      <div class="form-group">
        <label for="imgurl">图片链接地址:</label>
        <input type="text" id="imgurl" name="imgurl" placeholder="输入图片链接地址">
      </div>
      <div class="form-group">
        <label for="name">名称:</label>
        <input type="text" id="name" name="name" placeholder="输入名称">
      </div>
      <div class="form-group">
        <label for="model">型号:</label>
        <input type="text" id="model" name="model" placeholder="输入型号">
      </div>
      <div class="form-group">
        <label for="type">类型:</label>
        <input type="text" id="type" name="type" placeholder="输入类型">
      </div>
      <div class="form-group">
        <label for="function">功能:</label>
        <input type="text" id="function" name="function" placeholder="输入功能">
      </div>
      <div class="form-group">
        <label for="price">功能:</label>
        <input type="text" id="price" name="price" placeholder="输入价格">
      </div>
      <div class="form-group">
        <label for="sales">功能:</label>
        <input type="text" id="sales" name="sales" placeholder="输入销量">
      </div>
      <div class="form-group">
        <label for="intro">介绍:</label>
        <input type="text" id="intro" name="intro" placeholder="输入介绍">
      </div>
      <div class="form-group">
        <button type="submit">提交</button>
      </div>
    </form>
  </div>
</div>

</body>
<script>
  let changebts = document.querySelectorAll('.changebt')
  for(let i = 0;i<changebts.length;i++){
    changebts[i].addEventListener("click",function () {
      let id = this.getAttribute("dataid")
      $.get({url:"newsselect?id="+id,success:function (data) {
          console.log(data)
          $('#id').val(id)
          $('#imgurl').val(data.img)
          $('#title').val(data.title)
          $("#text").val(data.text)
          $('#type').val(data.type)
        }})
      document.getElementById('modal').style.display = 'block';
    })
  }
  document.querySelector('.close').addEventListener('click', function() {
    document.getElementById('modal').style.display = 'none';
  })

</script>
</html>
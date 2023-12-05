<%@ page import="java.util.List" %>
<%@ page import="top.aprdec.pojo.news" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<news> newsList = (List<news>) request.getAttribute("news");%>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="./css/backNews.css">
</head>
<script src="../js/jquery.min.js"></script>
<body>
<table>
    <tr>
        <th>图片</th>
        <th>标题</th>
        <th>类型</th>
        <th>操作</th>
    </tr>
    <%for (news news:newsList){%>
    <tr>
        <td><img src="<%=news.getImg()%>"></td>
        <td><%=news.getTitle()%></td>
        <td><%=news.getType()%></td>
        <td><button class="deletebt" dataid="<%=news.getId()%>">删除</button>
            <button class="changebt" dataid="<%=news.getId()%>">修改</button></td>
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
                <label for="title">标题:</label>
                <input type="text" id="title" name="title" placeholder="输入标题">
            </div>
            <div class="form-group">
                <label for="type">类型:</label>
                <input type="text" id="type" name="type" placeholder="输入类型">
            </div>
            <div class="form-group">
                <label for="text">内容:</label>
                <input type="text" id="text" name="text" placeholder="输入内容">
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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="top.aprdec.pojo.user" %>
<%@ page import="java.util.List" %>
<% List<user> userList = (List<user>) request.getAttribute("users");
%>

<html>
<head>
    <title>后台用户管理</title>
    <link rel="stylesheet" type="text/css" href="./css/backUser.css">
</head>
<script src="./js/jquery.min.js"></script>
<body>
<button>添加用户</button>
<table id="editableTable">
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>身份</th>
    </tr>
    <% for(user user:userList){%>
    <tr>
        <td class="editable" dataid="<%=user.getId()%>"><%=user.getUsername()%></td>
        <td class="editable" dataid="<%=user.getId()%>"><%=user.getPassword()%></td>
        <td class="editable" dataid="<%=user.getId()%>"><%=user.getIdentity()%></td>
    </tr>
    <% } %>
</table>

<!-- 添加用户 -->
<div id="modal" class="modal">
    <div class="modal-content">
        <span class="close">X</span>
        <h2>用户添加</h2>
        <form id="form" action="/useradd">
            <div class="form-group">
                <label for="username">用户名:</label>
                <input type="text" id="username" name="username" placeholder="输入用户名">
            </div>
            <div class="form-group">
                <label for="password">密码:</label>
                <input type="text" id="password" name="password" placeholder="输入密码">
            </div>
            <div class="form-group">
                <label for="identity">身份:</label>
                <select name="identity" id="identity">
                    <option value="用户">用户</option>
                    <option value="管理员">管理员</option>
                </select>
            </div>
            <div class="form-group">
                <button type="submit">提交</button>
            </div>
        </form>
    </div>
</div>

<script>
    const table = document.getElementById("editableTable");
    const cells = table.getElementsByClassName("editable");

    for (let i = 0; i < cells.length; i++) {
        cells[i].addEventListener("dblclick", function() {
            this.setAttribute("contenteditable", "true");
            this.focus();
        });

        cells[i].addEventListener("blur", function() {
            this.removeAttribute("contenteditable");
            let id = this.getAttribute("dataid");
            const elements = document.querySelectorAll('.editable[dataid="' + id + '"]');
            let name = elements[0].innerText;
            let password = elements[1].innerText;
            let identity = elements[2].innerText;
            let url = "/userupdate?username=" + name + "&password=" + password + "&identity=" + identity + "&id=" + id;
            $.get(url);
        });
    }
    $("button").click(function(){
        document.getElementById('modal').style.display = 'block';
    })
    document.querySelector('.close').addEventListener('click', function() {
        document.getElementById('modal').style.display = 'none';
    })

</script>
</body>
</html>
</html>

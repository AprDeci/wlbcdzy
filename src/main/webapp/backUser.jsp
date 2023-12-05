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
        alert("111")
        $("#editableTable").appendChild("<tr><td className='editable' dataid=null></td><td className='editable' dataid=null></td><td className='editable' dataid=null></td></tr>")
    })
</script>
</body>
</html>
</html>

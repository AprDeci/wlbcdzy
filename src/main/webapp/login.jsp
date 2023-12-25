<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String errormessage =request.getAttribute("error")==null?"": request.getAttribute("error").toString();%>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="./css/login.css">
</head>
<body>
<div id="login-register-div">
    <div id="login">
        <span>登录</span><br/>
        <form action="/loginServlet">
            <p style="color:red"><%= errormessage %></p>
            <span>用户名</span>
            <input type="text" name="username"  placeholder="请输入用户名" value="${cookie.username.value}">
            <br/>
            <span>密码</span>
            <input type="password" name="password"  placeholder="请输入密码" value="${cookie.password.value}"><br/>
            <span>验证码</span>
            <input type="text" name="captcha"><img id="captcha" src="<c:url value="/captcha"/>" width="130px" height="48px" />
            <c:set var="remember" value="${cookie.remember.value}" />
            <input type="checkbox" name="remember" checked="${remember == 'on' ? 'checked' : ''}"><span>记住我</span>
            <input type="checkbox" name="autologin" ><span>自动登录</span><br/>
            <input type="submit" value="登录">
        </form>
        <input type="submit" value="注册" id="lregister">
    </div>
    <div id="register">
        <span>注册</span><br/>
        <form action="/registerServlet">
            <span>用户名</span>
            <input type="text" name="username"  placeholder="请输入用户名"><br/>
            <span>密码</span>
            <input type="password" name="password" placeholder="请输入密码"><br/>
            <span>验证码</span>
            <input type="text" name="captcha"><img src="<c:url value="/captcha"/>" width="130px" height="48px" />
            <input type="submit" value="注册">
        </form>
        <input type="submit" value="登录" id="rlogin">
    </div>
</div>
</body>
<script>
    document.querySelector("#rlogin").addEventListener("click",function(){
        document.querySelector("#login").style.display="block"
        document.querySelector("#register").style.display = "none"
    })
    document.querySelector("#lregister").addEventListener("click",function(){
        document.querySelector("#login").style.display = "none"
        document.querySelector("#register").style.display="block"
    })
    document.querySelector("#captcha").addEventListener("click",function(){
        document.querySelector("#captcha").src = "/captcha?a="+Math.random()
    })
</script>
</html>

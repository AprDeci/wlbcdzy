<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录成功界面</title>
</head>
<body>
<h1>用户登录成功界面</h1>
<hr>
<!-- 判断用户是否勾选了记住账户信息，如果勾选了，就使用cookie保存用户的账户信息，使用URLEncoder类进行编码，防止中文乱码 -->
<%
    request.setCharacterEncoding("utf-8");
    // 首先判断用户是否勾选了记住账户信息,如果勾选了值默认是on,也可以通过input的value属性设置
    String[] r = request.getParameterValues("isChecked");
    if(r != null && r.length > 0) {
        // 获取输入的username和password,进行编码
        String username = URLEncoder.encode(request.getParameter("username"), "utf-8");
        String password = URLEncoder.encode(request.getParameter("password"), "utf-8");
        // 新建cookie对象
        Cookie usernameCookie = new Cookie("usernameCookie", username);
        Cookie passwordCookie = new Cookie("passwordCookie", password);
        // 设置cookie的有效期7天，单位为秒
        usernameCookie.setMaxAge(604800);
        passwordCookie.setMaxAge(604800);
        // 写入cookie对象
        response.addCookie(usernameCookie);
        response.addCookie(passwordCookie);
    } else {
        //如果用户取消了记住账户信息，则应该对cookie里的信息进行清理
        Cookie[] cookies = request.getCookies();
        if(cookies != null && cookies.length > 0) {
            for(Cookie c:cookies) {
                if(c.getName().equals("usernameCookie") || c.getName().equals("passwordCookie")) {
                    // 使cookie过期
                    c.setMaxAge(0);
                    response.addCookie(c);
                }
            }
        }
    }
%>
<hr>
</body>
</html>

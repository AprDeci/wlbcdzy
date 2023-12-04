<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>header</title>
    <style>.nav {
        width: calc(100vw - 10%);
        height: 50px;
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        align-items: center;
        padding:20px 5%;
        background-color: rgb(255, 255, 255);
    }
    .nav p {
        display: inline-block;
        cursor: pointer;
        font-size: 1rem;
        position: relative;
    }
    .nav p::after {
         content: '';
         position: absolute;
         bottom: -5px;
         left: 0;
         width: 100%;
         height: 3px;
         background-color: orange;
         transform: scaleX(0);
         transition: transform 0.3s ease;
     }

     .nav p:hover::after {
         transform: scaleX(1);
     }

    .nav :nth-child(1){
        margin-left: 10vw;
        margin-right: 30vw;
        font-weight: 600;
        font-size: 2.0rem;
    }
    .banner img{
        width: 100vw;
        height: 300px
    }</style>
</head>
<body>
<div class="nav">
    <p id="index-p">XX企业门户</p>
    <p id="about-p">关于我们</p>
    <p id="products-p">产品信息</p>
    <p id="news-p">新闻信息</p>
    <p id="contact-p">联系信息</p>
    <p id="login-p">后台登录</p>
</div>
<div class="banner">
    <img src="./imgs/banner.jpg" alt="">
</div>
</body>
<script>
    document.querySelector("#index-p").addEventListener("click",function(){
        window.location.href = "/indexServlet"
    })
    document.querySelector("#login-p").addEventListener("click",function(){
        window.location.href = "login.jsp"
    })
    document.querySelector("#products-p").addEventListener("click",function(){
        window.location.href = "/productServlet?type=电器"
    })
    document.querySelector("#news-p").addEventListener("click",function(){
        window.location.href = "/newsServlet?type=推荐"
    })
    document.querySelector("#about-p").addEventListener("click",function(){
        window.location.href = "/aboutServlet"
    })
</script>
</html>

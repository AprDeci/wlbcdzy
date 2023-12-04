package top.aprdec.web;

import org.apache.ibatis.session.SqlSession;
import top.aprdec.mapper.usermapper;
import top.aprdec.pojo.user;
import top.aprdec.util.SqlSessionFactoryutil;
import org.apache.ibatis.session.SqlSessionFactory;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String remember = request.getParameter("remember");
        System.out.println(remember);
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        try {
            user user = usermapper.selectByusername(username);
            sqlSession.close();
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("存在该用户");
                if (remember.equals("on")&&remember!=null){
                    System.out.println("存储COOKIE");
                    Cookie usernameCookie = new Cookie("username", username);
                    usernameCookie.setMaxAge(60 * 60 * 24);
                    response.addCookie(usernameCookie);
                    Cookie passwordCookie = new Cookie("password", password);
                    passwordCookie.setMaxAge(60 * 60 * 24);
                    response.addCookie(passwordCookie);
                    response.addCookie(new Cookie("remember",remember));
                    System.out.println("存储完毕");
                }else{
                    Cookie[] cookies = request.getCookies();
                    if(cookies != null && cookies.length > 0) {
                        for(Cookie c:cookies) {
                            if(c.getName().equals("username") || c.getName().equals("password")) {
                                // 使cookie过期
                                c.setMaxAge(0);
                                response.addCookie(c);
                            }
                        }
                    }
                }
            }
            response.sendRedirect("index.html");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("不存在该用户");
        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

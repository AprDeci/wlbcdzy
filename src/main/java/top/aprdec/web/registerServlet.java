package top.aprdec.web;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.aprdec.mapper.usermapper;
import top.aprdec.pojo.user;
import top.aprdec.util.SqlSessionFactoryutil;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        try {
            System.out.println(username+"----"+password);
            usermapper.add(new user(username, password, 1));
            System.out.println("注册成功");
            sqlSession.close();
            response.sendRedirect("login.html");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("注册失败");
            response.sendRedirect("login.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

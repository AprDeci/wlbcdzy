package top.aprdec.web;

import com.alibaba.fastjson2.JSON;
import top.aprdec.pojo.news;
import top.aprdec.service.newsService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/newsServlet")
public class newsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        newsService newsservice = new newsService();
        List<news> newslist = newsservice.selectByType(type);
        List<String> types = newsservice.selectType();
        request.setAttribute("newslist",newslist);
        request.setAttribute("types",types);
        request.getRequestDispatcher("news.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

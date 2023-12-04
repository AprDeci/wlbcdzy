package top.aprdec.web;

import top.aprdec.pojo.news;
import top.aprdec.service.newsService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/newsdetailServlet")
public class newsdetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        newsService newsservice = new newsService();
        news news = newsservice.selectById(Integer.parseInt(id));
        request.setAttribute("news",news);
        request.getRequestDispatcher("newsdetail.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

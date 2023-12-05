package top.aprdec.web;

import top.aprdec.pojo.news;
import top.aprdec.service.newsService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/backNewsServlet")
public class backNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        newsService newsService = new newsService();
        List<news> news = newsService.selectAll();
        request.setAttribute("news",news);
        request.getRequestDispatcher("backNews.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

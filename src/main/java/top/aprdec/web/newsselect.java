package top.aprdec.web;

import com.alibaba.fastjson2.JSON;
import top.aprdec.pojo.news;
import top.aprdec.service.newsService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/newsselect")
public class newsselect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json;charset=utf-8");
        String id = request.getParameter("id");
        newsService newsservice = new newsService();
        news news = newsservice.selectById(Integer.parseInt(id));
        String jsonString = JSON.toJSONString(news);
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

package top.aprdec.web;
import top.aprdec.pojo.news;
import top.aprdec.service.newsService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/newsupdate")
public class newsupdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String img = request.getParameter("imgurl");
        String title = request.getParameter("title");
        String type = request.getParameter("type");
        String text = request.getParameter("text");

        news news = new news(id,img,title,text,type);
        System.out.println(news.toString());
        newsService newsService = new newsService();
        newsService.updateByid(news);
        response.sendRedirect("/backNewsServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

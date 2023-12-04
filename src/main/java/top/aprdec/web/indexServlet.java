package top.aprdec.web;

import top.aprdec.pojo.essay;
import top.aprdec.pojo.news;
import top.aprdec.pojo.product;
import top.aprdec.service.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/indexServlet")
public class indexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        otherService otherservice = new otherService();
        essay about = otherservice.selectBytitle("关于我们");
        request.setAttribute("about",about);

        newsService newsService = new newsService();
        List<news> news = newsService.selectByPage(0, 2);
        request.setAttribute("news", news);

        productService productservice = new productService();
        List<product> products = productservice.selectrand();
        request.setAttribute("products", products);

        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

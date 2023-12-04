package top.aprdec.web;

import top.aprdec.pojo.essay;
import top.aprdec.service.otherService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/aboutServlet")
public class abotServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        otherService otherservice = new otherService();
        essay about = otherservice.selectBytitle("关于我们");
        request.setAttribute("about",about);
        request.getRequestDispatcher("about.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

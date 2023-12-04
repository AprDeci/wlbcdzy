package top.aprdec.web;

import top.aprdec.pojo.product;
import top.aprdec.service.productService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/productdetailServlet")
public class productdetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id =request.getParameter("id");
        productService productservice = new productService();
        product product =productservice.selectByid(id);
        request.setAttribute("product",product);

        request.getRequestDispatcher("productdetail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

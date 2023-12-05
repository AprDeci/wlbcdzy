package top.aprdec.web;

import top.aprdec.pojo.product;
import top.aprdec.service.productService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/backProductServlet")
public class backProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        productService productservice = new productService();
        List<product> products = productservice.selectall();
        request.setAttribute("products",products);
        request.getRequestDispatcher("backProducts.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

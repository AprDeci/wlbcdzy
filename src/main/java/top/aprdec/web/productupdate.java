package top.aprdec.web;

import top.aprdec.pojo.product;
import top.aprdec.service.productService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/productupdate")
public class productupdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String img = request.getParameter("imgurl");
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        double price = Double.parseDouble(request.getParameter("price"));
        String model = request.getParameter("model");
        String function = request.getParameter("function");
        int sales = Integer.parseInt(request.getParameter("sales"));
        String intro = request.getParameter("intro");
        int id = Integer.parseInt(request.getParameter("id"));
        product product = new product(id,img,name,type,model,function,price,sales,intro);
        productService productservice = new productService();
        productservice.update(product);
        response.sendRedirect("/backProductServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

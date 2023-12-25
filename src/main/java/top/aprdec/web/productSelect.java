package top.aprdec.web;

import com.alibaba.fastjson2.JSON;
import top.aprdec.pojo.product;
import top.aprdec.service.productService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/productselect")
public class productSelect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        productService productservice = new productService();
        product product = productservice.selectByid(id);
        String jsonString = JSON.toJSONString(product);
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

package top.aprdec.web;
import top.aprdec.pojo.product;
import top.aprdec.service.productService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/productServlet")
public class productServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        productService productservice = new productService();
        List<String> types = productservice.selecttype();
        request.setAttribute("types",types);

        List<product> products = productservice.selectBytype(type);
        request.setAttribute("products",products);
        request.getRequestDispatcher("/product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

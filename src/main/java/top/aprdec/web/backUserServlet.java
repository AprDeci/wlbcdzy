package top.aprdec.web;
import top.aprdec.pojo.user;
import top.aprdec.service.userService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/backUserServlet")
public class backUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userService userservice = new userService();
        List<user> users = userservice.selectAll();
        request.setAttribute("users",users);
        request.getRequestDispatcher("backUser.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

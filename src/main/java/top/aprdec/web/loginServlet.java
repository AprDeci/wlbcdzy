package top.aprdec.web;
import com.wf.captcha.utils.CaptchaUtil;
import top.aprdec.pojo.user;
import top.aprdec.service.userService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String captcha = request.getParameter("captcha");
    String remember = request.getParameter("remember");
    userService userservice = new userService();
    //验证码判断
    if(!CaptchaUtil.ver(captcha,request)) {
        CaptchaUtil.clear(request);
        request.setAttribute("error", "验证码错误");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
        user user = userservice.selectByusername(username, password);
    if(user == null) {
        request.setAttribute("error", "用户名或密码错误");
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
    //登录成功
        //是否记住密码
        if (remember==null||!remember.equals("on")){
            response.addCookie(new Cookie("username",null));
            response.addCookie(new Cookie("password",null));
            response.addCookie(new Cookie("remember",null));
        }else{
            response.addCookie(new Cookie("username",username));
            response.addCookie(new Cookie("password",password));
            response.addCookie(new Cookie("remember",remember));
        }
        request.setAttribute("identity",user.getIdentity());
        request.getRequestDispatcher("index.jsp").forward(request, response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

import com.alibaba.fastjson2.JSON;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import top.aprdec.mapper.usermapper;
import top.aprdec.pojo.news;
import top.aprdec.pojo.product;
import top.aprdec.pojo.user;
import top.aprdec.service.newsService;
import top.aprdec.service.productService;
import top.aprdec.service.userService;
import top.aprdec.util.SqlSessionFactoryutil;

import java.util.List;

public class test {

    @Test
    public void testregister(){
        String username = "wlbcdzy";
        String password = "wlbcdzy";
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        try {
            user user = new user(username, password, 1);
            System.out.println("注册成功");
            sqlSession.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("注册失败");
        }
    }
    @Test
    public void testselect(){
        userService userservice = new userService();
        user user = userservice.selectByusername("123","123");
        System.out.println(user.toString());

    }

    @Test
    public void testnewsselectbyid(){
        newsService newsservice = new newsService();
        news s = newsservice.selectById(1);

        System.out.println(JSON.toJSONString(s));

    }
    @Test
    public void testnewsselectbypage(){
        newsService newsservice = new newsService();
        List<news> news = newsservice.selectByPage(0,2);
        for (news news1 : news) {
            System.out.println(news1.toString());
        }

    }
    @Test
    public void testproductselectrand(){
        productService productservice = new productService();
        List<product> products = productservice.selectrand();
        for (product prodcut: products) {
            System.out.println(prodcut.toString());
        }
    }
}

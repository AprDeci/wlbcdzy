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
    public void testuseradd(){
        userService userservice = new userService();
        user user = new user("test","test","管理");
        userservice.add(user);
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
    @Test
    public void testnewsadded(){
        newsService newsservice = new newsService();
        news news = new news("img","测试案例","text","推荐");
        newsservice.add(news);
    }
}

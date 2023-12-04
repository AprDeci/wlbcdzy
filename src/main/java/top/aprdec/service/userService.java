package top.aprdec.service;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.aprdec.mapper.usermapper;
import top.aprdec.util.SqlSessionFactoryutil;
import top.aprdec.pojo.user;
public class userService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();

    public void add(user user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        try {
            usermapper.add(user);
            sqlSession.commit();
            System.out.println("注册成功");
            sqlSession.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("注册失败");
        }
    }

    public user select(String username,String password){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        user user = usermapper.select(username,password);
        sqlSession.close();
        return user;
    }

    public user selectByusername(String username){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        user user = usermapper.selectByusername(username);
        sqlSession.close();
        return user;
    }
}

package top.aprdec.service;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.aprdec.mapper.usermapper;
import top.aprdec.util.SqlSessionFactoryutil;
import top.aprdec.pojo.user;

import java.util.List;

public class userService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();

    public void add(user user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        try {
            usermapper.add(user);
            sqlSession.commit();
            sqlSession.close();
            System.out.println("注册成功");
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
        if (user != null) {
            return user;
        } else  {
            return null;
        }
    }

    public user selectByusername(String username,String password){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        user user = usermapper.selectByusername(username);
        sqlSession.close();
        if(user == null) {
            return null;
        }
        if (!user.getPassword().equals(password)){
            return null;
        }
        return user;

    }

    public List<user> selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        List<user> select = usermapper.selectall();
        sqlSession.close();
        return select;
    }

    public void updateByid(user user){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        usermapper usermapper = sqlSession.getMapper(usermapper.class);
        usermapper.updateByid(user);
        sqlSession.commit();
        sqlSession.close();
    }
}

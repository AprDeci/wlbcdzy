package top.aprdec.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.aprdec.mapper.othermapper;
import top.aprdec.pojo.essay;
import top.aprdec.util.SqlSessionFactoryutil;

import java.util.List;

public class otherService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();

    public List<essay> select(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        othermapper othermapper = sqlSession.getMapper(othermapper.class);
        List<essay> select = othermapper.select();
        sqlSession.close();
        return select;
    }
    public essay selectBytitle(String title){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        othermapper othermapper = sqlSession.getMapper(othermapper.class);
        essay selectBytitle = othermapper.selectBytitle(title);
        sqlSession.close();
        return selectBytitle;
    }
}

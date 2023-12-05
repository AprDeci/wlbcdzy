package top.aprdec.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.aprdec.mapper.productmapper;
import top.aprdec.pojo.product;
import top.aprdec.util.SqlSessionFactoryutil;

import java.util.List;

public class productService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();

    public List<product> selectall(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        productmapper productmapper = sqlSession.getMapper(productmapper.class);
        List<product> select = productmapper.selectall();
        sqlSession.close();
        return select;
    }

    public product selectByid(String id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        productmapper productmapper = sqlSession.getMapper(productmapper.class);
        product selectByid = productmapper.selectByid(id);
        sqlSession.close();
        return selectByid;
    }

    public List<product> selectBytype(String type){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        productmapper productmapper = sqlSession.getMapper(productmapper.class);
        List<product> selectBytype = productmapper.selectBytype(type);
        sqlSession.close();
        return selectBytype;
    }

    public List<String> selecttype(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        productmapper productmapper = sqlSession.getMapper(productmapper.class);
        List<String> selectBytype = productmapper.selecttype();
        sqlSession.close();
        return selectBytype;
    }

    public List<product> selectrand(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        productmapper productmapper = sqlSession.getMapper(productmapper.class);
        List<product> selectrand = productmapper.selectrand();
        sqlSession.close();
        return selectrand;
    }
}

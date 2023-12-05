package top.aprdec.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.aprdec.mapper.newsmapper;
import top.aprdec.pojo.news;
import top.aprdec.util.SqlSessionFactoryutil;

import java.util.List;

public class newsService{
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryutil.getSqlSessionFactory();
    public List<news> select(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        List<news> select = newsmapper.select();
        sqlSession.close();
        return select;
    }

    public List<news> selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        List<news> selectAll = newsmapper.selectAll();
        sqlSession.close();
        return selectAll;
    }

    public news selectById(int id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        news selectById = newsmapper.selectById(id);
        sqlSession.close();
        return selectById;
    }

    public List<String> selectType(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        List<String> selectType = newsmapper.selectType();
        sqlSession.close();
        return selectType;
    }
    public List<news> selectByType(String type){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        List<news> selectByType = newsmapper.selectByType(type);
        sqlSession.close();
        return selectByType;
    }
    public List<news> selectByPage(int start, int end){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        List<news> selectByPage = newsmapper.selectByPage(start, end);
        sqlSession.close();
        return selectByPage;
    }
    public void add(news news){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        newsmapper.add(news);
        sqlSession.commit();
        sqlSession.close();
    }
    public void updateByid(news news){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        newsmapper newsmapper = sqlSession.getMapper(newsmapper.class);
        newsmapper.updateByid(news);
        sqlSession.commit();
        sqlSession.close();
    }
}

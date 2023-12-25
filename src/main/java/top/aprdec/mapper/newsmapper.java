package top.aprdec.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.aprdec.pojo.news;
import top.aprdec.pojo.user;

import java.util.List;

public interface newsmapper {
    //查询img title text从news

    @Select("select img,title,text,id from news")
    List<news> select();

    @Select("select * from news" )
    List<news> selectAll();

    @Select("select img,title,text,id,type from news where id = #{id}")
    news selectById(int id);

    //查询news表中所有不重复的type

    @Select("select distinct type from news")
    List<String> selectType();

    @Select("select img,title,text,id from news where type = #{type}")
    List<news> selectByType(String type);

    @Select("select img,title,text,id from news limit #{start},#{end}")
    List<news> selectByPage(@Param("start") int start, @Param("end") int end);

    @Insert("insert into news(img,title,text,type) values(#{img},#{title},#{text},#{type})")
    void add(news news);

    @Update("update news set img=#{img},title=#{title},text=#{text},type=#{type} where id=#{id}")
    void updateByid(news news);

}

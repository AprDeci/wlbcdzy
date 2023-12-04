package top.aprdec.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import top.aprdec.pojo.essay;

import java.util.List;

public interface othermapper {
    @Select("select title,text from other")
    List<essay> select();

    @Select("select title,text from other where title = #{title}")
    essay selectBytitle(String title);
}

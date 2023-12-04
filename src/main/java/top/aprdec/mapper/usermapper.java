package top.aprdec.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.aprdec.pojo.user;

public interface usermapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    user select(@Param("username") String username,@Param("password") String password);
    @Insert("insert into user values(null,#{username},#{password},#{identity})")
    void add(user user);
    @Select("select * from user where username=#{username}")
    user selectByusername(@Param("username")String username);


}


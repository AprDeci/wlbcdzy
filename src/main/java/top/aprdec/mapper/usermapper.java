package top.aprdec.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.aprdec.pojo.user;

import java.util.List;

public interface usermapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    user select(@Param("username") String username,@Param("password") String password);
    @Insert("insert into user (username, password, identity) values(#{username},#{password},#{identity})")
    void add(user user);
    @Select("select * from user where username=#{username}")
    user selectByusername(@Param("username")String username);

    @Select("select * from user")
    List<user> selectall();

    @Update("update user set username = #{username},password = #{password},identity = #{identity} where id=#{id}")
    void updateByid(user user);

}


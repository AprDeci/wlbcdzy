package top.aprdec.mapper;

import org.apache.ibatis.annotations.Select;
import top.aprdec.pojo.product;

import java.util.List;

public interface productmapper {
    @Select("select * from product")
    List<product> selectall();

    @Select("select * from product where id = #{id}")
    product selectByid(String id);

    @Select("select * from product where type = #{type}")
    List<product> selectBytype(String type);

    @Select("select distinct type from product")
    List<String> selecttype();

    @Select("select * from product order by rand() limit 3")
    List<product> selectrand();


}

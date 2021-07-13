package com.dao;

import com.pojo.Infos;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface InfosDao {
    @Insert("insert into infos (card,name,age,tress) values(#{card},#{name},#{age},#{tress})")
    int insert(Infos infos);
    @Select("select * from infos")
    List <Infos> findall();
    @Select("select * from infos where card=#{card}")
    Infos findbyid(Integer card);
    @Update("update infos set name=#{name},age=#{age},tress=#{tress} where card=#{card}")
    boolean updatebyid(Infos infos);
    @Delete("delete from infos where card=#{card}")
    boolean deletebyid(Infos infos);
}

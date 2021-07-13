package com.dao;

import com.pojo.Infos;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InfosDao {
    @Insert("insert into infos (card,name,age,tress) values(#{card},#{name},#{age},#{tress})")
    int insert(Infos infos);
    @Select("select * from infos")
    List <Infos> findall();
    @Select("select * from infos where card=#{card}")
    Infos findbyid(Integer card);
}

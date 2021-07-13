package com.dao;

import com.pojo.Admin;
import org.apache.ibatis.annotations.Select;

public interface AdminDao {
    @Select("select * from admin where username=#{username} and password=#{password}")
    Admin login(Admin admin);
}

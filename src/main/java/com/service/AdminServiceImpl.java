package com.service;

import com.dao.AdminDao;
import com.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin login(Admin admin) {

        return adminDao.login(admin);

    }
}

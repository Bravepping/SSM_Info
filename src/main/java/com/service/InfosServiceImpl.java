package com.service;

import com.dao.InfosDao;
import com.pojo.Infos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfosServiceImpl implements InfosService {

    @Autowired
    private InfosDao infosDao;
    //信息登记
    @Override
    public int insert(Infos infos) {
//        infosDao.insert(infos);
        return infosDao.insert(infos);
    }
    //查询所有信息
    @Override
    public List<Infos> findall() {
        return infosDao.findall();
    }
    //根据编号查询信息
    @Override
    public Infos findbyid(Integer card) {
        return infosDao.findbyid(card);
    }

    //修改信息根据编号
    @Override
    public boolean updatebyid(Infos infos) {
//        infosDao.updatebyid(card);
        return infosDao.updatebyid(infos);
    }

    //根据编号删除信息
    @Override
    public boolean deletebyid(Infos infos) {
        return infosDao.deletebyid(infos);
    }

}

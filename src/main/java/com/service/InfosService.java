package com.service;

import com.pojo.Infos;

import java.util.List;

public interface InfosService {
    int insert(Infos infos);
    List<Infos> findall();
    Infos findbyid(Integer card);
}

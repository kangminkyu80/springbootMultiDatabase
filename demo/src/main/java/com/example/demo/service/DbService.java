package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DbMapper;
import com.example.demo.dao1.Db1Mapper;
import com.example.demo.dao2.Db2Mapper;


@Service
public class DbService {

//    @Autowired
//    DbMapper dbMapper;
//    public String getDual()throws Exception{
//        return dbMapper.getDual();
//    }

    @Autowired
    Db1Mapper dbMapper1;
    public String getDb1Dual()throws Exception{
        return dbMapper1.getDb1Dual();
    }
    
    @Autowired
    Db2Mapper dbMapper2;
    public String getDb2Dual()throws Exception{
        return dbMapper2.getDb2Dual();
    }

}

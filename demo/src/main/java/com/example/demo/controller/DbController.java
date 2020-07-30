package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DbService;

@RestController
public class DbController {
	
    @Autowired
    DbService dbService;
 
//    @RequestMapping("/now")
//    public String now()throws Exception{
//        return dbService.getDual();
//    }
    
    @RequestMapping("/db1")
    public String db1()throws Exception{
        return dbService.getDb1Dual();
    }
    
    @RequestMapping("/db2")
    public String db2()throws Exception{
        return dbService.getDb2Dual();
    }

}

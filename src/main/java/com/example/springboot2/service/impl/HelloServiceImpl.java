package com.example.springboot2.service.impl;

import com.example.springboot2.dao.HelloDao;
import com.example.springboot2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2019/4/24.
 */

@Service
@Transactional
public class HelloServiceImpl implements HelloService {


    @Autowired
    private HelloDao helloDao;

    @Override
    public String hello(String msg) {

        List<Map<String,Object>> list=helloDao.select();

        return "============"+msg;
    }
}

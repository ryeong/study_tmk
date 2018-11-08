package com.co.tmk.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.co.tmk.test.dao.TestDao;
import com.co.tmk.test.service.TestService;
import com.co.tmk.test.vo.TestVo;

@Repository
public class TestServiceImpl implements TestService{
    @Autowired
    TestDao testDao;

    @Override
    public TestVo testSelect() {
        return testDao.testSelect();
    }

    @Override
    public String testAjax() {
        return testDao.testAjax();
    }

    @Override
    public String testJson() {
        return testDao.testJson();
    }

}

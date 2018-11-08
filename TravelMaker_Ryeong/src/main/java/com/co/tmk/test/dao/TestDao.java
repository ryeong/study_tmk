package com.co.tmk.test.dao;

import org.springframework.stereotype.Repository;

import com.co.tmk.common.dao.AbstractDAO;
import com.co.tmk.test.vo.TestVo;

@Repository
public class TestDao extends AbstractDAO{
    private final String NAMESPACE = "test.testMapper";

    public TestVo testSelect(){
        return (TestVo)selectOne(NAMESPACE + ".testSelect");
    }

    public String testAjax() {
        return selectString(NAMESPACE + ".testAjax");
    }

    public String testJson() {
        return selectString(NAMESPACE + ".testJson");
    }
}

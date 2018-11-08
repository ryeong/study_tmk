package com.co.tmk.test.vo;

import java.io.Serializable;

public class TestVo implements Serializable{

    private static final long serialVersionUID = -939290104528509406L;

    private String testCol;

    public String getTestCol() {
        return testCol;
    }

    public void setTestCol(String test) {
        this.testCol = test;
    }

    @Override
    public String toString() {
        return "TestVo [testCol=" + testCol + "]";
    }
}

package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 79986 on 2017/6/20.
 * 存储省份信息的表
 * id是每个实体类中都应该有的字段
 * provinceName记录省的名字，provinceCode记录省的代号，
 * LitePal中的每一个实体类都要继承自DataSupport类
 */

public class Province extends DataSupport{

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}

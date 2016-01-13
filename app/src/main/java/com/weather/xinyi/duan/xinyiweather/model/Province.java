package com.weather.xinyi.duan.xinyiweather.model;

/**
 * Created by Duan on 2016/1/13.
 */
public class Province {
    private int id;
    private String ProvinceName;
    private String ProvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        this.ProvinceName = provinceName;
    }

    public String getProvinceCode() {
        return ProvinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.ProvinceCode = provinceCode;
    }

}

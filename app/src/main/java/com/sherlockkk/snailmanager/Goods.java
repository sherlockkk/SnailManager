package com.sherlockkk.snailmanager;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

/**
 * @author SongJian
 * @created 16/3/22
 * @e-mail 1129574214@qq.com
 */

@AVClassName("Goods")
public class Goods extends AVObject {
    public static final Creator CREATOR = AVObjectCreator.instance;

    private String brand;
    private String name;
    private String specification;
    private int sales;
    private String price;
    private int stock;
    private String picUrl;


    public String getBrand() {
        return getString("brand");
    }

    public void setBrand(String brand) {
        put("brand",brand);
    }

    public String getName() {
        return getString("name");
    }

    public void setName(String name) {
       put("name",name);
    }

    public String getSpecification() {
        return getString("specification");
    }

    public void setSpecification(String specification) {
       put("specification",specification);
    }

    public int getSales() {
        return getInt("sales");
    }

    public void setSales(int sales) {
        put("sales",sales);
    }

    public String getPrice() {
        return getString("price");
    }

    public void setPrice(String price) {
        put("price",price);
    }

    public int getStock() {
        return getInt("stock");
    }

    public void setStock(int stock) {
        put("stock",stock);
    }

    public String getPicUrl() {
        return getString("picUrl");
    }

    public void setPicUrl(String picUrl) {
        put("picUrl",picUrl);
    }


    @Override
    public String toString() {
        return "Goods{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", specification='" + specification + '\'' +
                ", sales=" + sales +
                ", price='" + price + '\'' +
                ", stock=" + stock +'\''+
                ", picUrl"+ picUrl +
                '}';
    }
}

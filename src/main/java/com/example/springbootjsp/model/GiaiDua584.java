package com.example.springbootjsp.model;

public class GiaiDua584 {
    int id;
    String ten;
    String mota;
    String nam;

    public GiaiDua584(int id, String ten, String mota, String nam) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.nam = nam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }
}
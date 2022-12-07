package com.example.springbootjsp.model;

public class GiaiDua584 {
    int id;
    int tblBTC584id;

    String ten;

    String mota;

    String nam;

    BTC584 btc584;

    public GiaiDua584(int id, String ten, String mota, String nam, BTC584 btc584) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.nam = nam;
        this.btc584 = btc584;
    }

    public GiaiDua584(int id, String ten, String mota, String nam, int tblBTC584id) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.nam = nam;
        this.tblBTC584id = tblBTC584id;
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

    public int getTblBTC584id() {
        return tblBTC584id;
    }

    public void setTblBTC584id(int tblBTC584id) {
        this.tblBTC584id = tblBTC584id;
    }
}

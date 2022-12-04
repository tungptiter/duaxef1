package com.example.springbootjsp.model;

public class TayDuaChang {
    int id;
    String mataydua;
    String sothuxuatphat;
    int diem;
    float thoigian;
    int sovong;
    ChangDua changDua;
    TayDua tayDua;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMataydua() {
        return mataydua;
    }

    public void setMataydua(String mataydua) {
        this.mataydua = mataydua;
    }

    public String getSothuxuatphat() {
        return sothuxuatphat;
    }

    public void setSothuxuatphat(String sothuxuatphat) {
        this.sothuxuatphat = sothuxuatphat;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public float getThoigian() {
        return thoigian;
    }

    public void setThoigian(float thoigian) {
        this.thoigian = thoigian;
    }

    public int getSovong() {
        return sovong;
    }

    public void setSovong(int sovong) {
        this.sovong = sovong;
    }

    public ChangDua getChangDua() {
        return changDua;
    }

    public void setChangDua(ChangDua changDua) {
        this.changDua = changDua;
    }

    public TayDua getTayDua() {
        return tayDua;
    }

    public void setTayDua(TayDua tayDua) {
        this.tayDua = tayDua;
    }
}

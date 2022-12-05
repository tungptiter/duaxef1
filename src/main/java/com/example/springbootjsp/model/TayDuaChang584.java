package com.example.springbootjsp.model;

public class TayDuaChang584 {
    int id;
    String mataydua;
    String sothuxuatphat;
    int diem;
    float thoigian;
    int sovong;
    ChangDua584 changDua584;
    TayDua584 tayDua584;

    int idChangDua;
    int idTayDua;


    public TayDuaChang584() {
    }

    public TayDuaChang584(int id, String mataydua, String sothuxuatphat, int diem, float thoigian, int sovong, int idChangDua, int idTayDua) {
        this.id = id;
        this.mataydua = mataydua;
        this.sothuxuatphat = sothuxuatphat;
        this.diem = diem;
        this.thoigian = thoigian;
        this.sovong = sovong;
        this.idChangDua = idChangDua;
        this.idTayDua = idTayDua;
    }

    //    public TayDuaChang584(int id, String mataydua, String sothuxuatphat, int diem, float thoigian, int sovong, ChangDua584 changDua584, TayDua584 tayDua584) {
//        this.id = id;
//        this.mataydua = mataydua;
//        this.sothuxuatphat = sothuxuatphat;
//        this.diem = diem;
//        this.thoigian = thoigian;
//        this.sovong = sovong;
//        this.changDua584 = changDua584;
//        this.tayDua584 = tayDua584;
//    }


    public int getIdChangDua() {
        return idChangDua;
    }

    public void setIdChangDua(int idChangDua) {
        this.idChangDua = idChangDua;
    }

    public int getIdTayDua() {
        return idTayDua;
    }

    public void setIdTayDua(int idTayDua) {
        this.idTayDua = idTayDua;
    }

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

    public ChangDua584 getChangDua() {
        return changDua584;
    }

    public void setChangDua(ChangDua584 changDua584) {
        this.changDua584 = changDua584;
    }

    public TayDua584 getTayDua() {
        return tayDua584;
    }

    public void setTayDua(TayDua584 tayDua584) {
        this.tayDua584 = tayDua584;
    }
}

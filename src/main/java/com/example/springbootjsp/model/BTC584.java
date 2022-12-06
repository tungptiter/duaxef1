package com.example.springbootjsp.model;

public class BTC584 {
    int id;
    int maBTC;
    ThanhVien584 thanhVien584;

    public BTC584(int id, int maBTC, ThanhVien584 thanhVien584) {
        this.id = id;
        this.maBTC = maBTC;
        this.thanhVien584 = thanhVien584;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaBTC() {
        return maBTC;
    }

    public void setMaBTC(int maBTC) {
        this.maBTC = maBTC;
    }

    public ThanhVien584 getThanhVien584() {
        return thanhVien584;
    }

    public void setThanhVien584(ThanhVien584 thanhVien584) {
        this.thanhVien584 = thanhVien584;
    }
}

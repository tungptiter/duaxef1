package com.example.springbootjsp.model;

public class DoiDua584 {
    int id;
    String ten;
    String hang;
    String mota;

    int tblQuanLy584id;

    QuanLy584 quanLy584;

    public DoiDua584() {
    }

    public DoiDua584(int id, String ten, String hang, String mota, QuanLy584 quanLy584) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.mota = mota;
        this.quanLy584 = quanLy584;
    }

    public DoiDua584(int id, String ten, String hang, String mota, int tblQuanLy584id) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.mota = mota;
        this.tblQuanLy584id = tblQuanLy584id;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getTblQuanLy584id() {
        return tblQuanLy584id;
    }

    public void setTblQuanLy584id(int tblQuanLy584id) {
        this.tblQuanLy584id = tblQuanLy584id;
    }
}

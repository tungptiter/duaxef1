package com.example.springbootjsp.model;

public class TayDua584 {
    int id;
    String ten;
    String ngaysinh;
    String quoctich;
    String tieusu;

    public TayDua584() {
    }

    public TayDua584(int id, String ten, String ngaysinh, String quoctich, String tieusu) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.quoctich = quoctich;
        this.tieusu = tieusu;
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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getTieusu() {
        return tieusu;
    }

    public void setTieusu(String tieusu) {
        this.tieusu = tieusu;
    }
}

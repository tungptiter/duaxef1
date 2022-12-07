package com.example.springbootjsp.model;

public class TayDua584 {
    int id;
    String ten;
    String ngaysinh;
    String quoctich;
    String tieusu;
    DoiDua584 doiDua584;
    int tblDoiDua584id;

    public TayDua584() {
    }

    public TayDua584(int id, String ten, String ngaysinh, String quoctich, String tieusu, DoiDua584 doiDua584) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.quoctich = quoctich;
        this.tieusu = tieusu;
        this.doiDua584 = doiDua584;
    }

    public TayDua584(int id, String ten, String ngaysinh, String quoctich, String tieusu, int tblDoiDua584id) {
        this.id = id;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.quoctich = quoctich;
        this.tieusu = tieusu;
        this.tblDoiDua584id = tblDoiDua584id;
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


    public int getTblDoiDua584id() {
        return tblDoiDua584id;
    }

    public void setTblDoiDua584id(int tblDoiDua584id) {
        this.tblDoiDua584id = tblDoiDua584id;
    }
}

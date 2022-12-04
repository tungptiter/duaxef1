package com.example.springbootjsp.model;

public class ThanhVien584 {
    int id;
    String tendangnhap;
    String matkhau;
    String hoten;
    String socccd;
    String sdt;

    public ThanhVien584() {
    }

    public ThanhVien584(int id, String tendangnhap, String matkhau, String hoten, String socccd, String sdt) {
        this.id = id;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.hoten = hoten;
        this.socccd = socccd;
        this.sdt = sdt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSocccd() {
        return socccd;
    }

    public void setSocccd(String socccd) {
        this.socccd = socccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}

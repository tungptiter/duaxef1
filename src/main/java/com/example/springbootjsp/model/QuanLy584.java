package com.example.springbootjsp.model;

public class QuanLy584 {
    int id;
    int maQuanLy;
    ThanhVien584 thanhVien584;

    public QuanLy584(int id, int maQuanLy, ThanhVien584 thanhVien584) {
        this.id = id;
        this.maQuanLy = maQuanLy;
        this.thanhVien584 = thanhVien584;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaQuanLy() {
        return maQuanLy;
    }

    public void setMaQuanLy(int maQuanLy) {
        this.maQuanLy = maQuanLy;
    }

    public ThanhVien584 getThanhVien584() {
        return thanhVien584;
    }

    public void setThanhVien584(ThanhVien584 thanhVien584) {
        this.thanhVien584 = thanhVien584;
    }
}

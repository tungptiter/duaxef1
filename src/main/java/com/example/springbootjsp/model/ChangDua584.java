package com.example.springbootjsp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity(name = "tblChangDua584")
@Getter
@Setter

public class ChangDua584 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String sovongdua;
    String diadiem;
    String thoigian;
    String mota;

    public ChangDua584() {
    }

    public int getId() {
        return id;
    }

    public ChangDua584(int id, String sovongdua, String diadiem, String thoigian, String mota) {
        this.id = id;
        this.sovongdua = sovongdua;
        this.diadiem = diadiem;
        this.thoigian = thoigian;
        this.mota = mota;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSovongdua() {
        return sovongdua;
    }

    public void setSovongdua(String sovongdua) {
        this.sovongdua = sovongdua;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}

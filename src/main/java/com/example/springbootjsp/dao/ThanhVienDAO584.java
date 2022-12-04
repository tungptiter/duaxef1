package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ThanhVien584;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThanhVienDAO584 extends DAO {

    public ThanhVienDAO584() {
        super();
    }

    public boolean dangNhap(ThanhVien584 tv) {
        String sql = "SELECT * FROM `tblthanhvien584` WHERE tendangnhap = ? AND matkhau = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tv.getTendangnhap());
            stm.setString(2, tv.getMatkhau());

            ResultSet result = stm.executeQuery();
            if (result.next()) {
                tv.setId(result.getInt("id"));
//                tv.setChucvu(result.getString("chucvu"));
                tv.setHoten(result.getString("hoten"));
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ThanhVienDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}


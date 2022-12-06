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

    public String dangNhap(String username, String password) {
        String sql = "SELECT * FROM `tblthanhvien584` WHERE tendangnhap = ? AND matkhau = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);

            ResultSet result = stm.executeQuery();
            if (result.next()) {
                return result.getString("hoten");
//                return true;
            }
            return "";
//            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ThanhVienDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return "";
//            return false;
        }
    }
}


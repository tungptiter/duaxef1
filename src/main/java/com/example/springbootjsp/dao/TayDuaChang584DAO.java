package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.DoiDua584;
import com.example.springbootjsp.model.TayDuaChang584;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TayDuaChang584DAO extends DAO {

    public TayDuaChang584DAO() {
        super();
    }
    public String luuDangKy(TayDuaChang584 tdc) {
        if (tdc == null) {
            return "Lỗi đăng ký tay đua";
        }

        String sql = "SELECT * FROM `tbltayduachang584` WHERE tblChangDua584id = ?, tblTayDua584id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, tdc.getIdChangDua());
            stm.setInt(2, tdc.getIdTayDua());
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return "Đã đăng ký";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return "Đã đăng ký";
        }


        String sql1 = "INSERT INTO `tbltayduachang584` ( mataydua, sothutuxuatphat, diem, thoigian, sovong, tblChangDua584id, tblTayDua584id)\n" +
                "VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        try {
            con.setAutoCommit(false);
            PreparedStatement stm = con.prepareStatement(sql1);
//            stm.setInt(1, tdc.getId());
            stm.setString(1, tdc.getMataydua());
            stm.setString(2, tdc.getSothuxuatphat());
            stm.setInt(3, tdc.getDiem());
            stm.setFloat(4, tdc.getThoigian());
            stm.setInt(5, tdc.getSovong());
            stm.setInt(6, tdc.getIdChangDua());
            stm.setInt(7, tdc.getIdTayDua());

            if (stm.executeUpdate() <= 0) {
                return "Lỗi đăng ký tay đua";
            }
            con.commit();
            return "ok";
        } catch (SQLException ex) {
            Logger.getLogger(TayDuaChang584DAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Lỗi đăng ký tay đua";
        }
    }
}

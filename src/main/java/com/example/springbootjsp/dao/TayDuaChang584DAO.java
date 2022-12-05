package com.example.springbootjsp.dao;

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
    public boolean luuDangKy(TayDuaChang584 tdc) {
        if (tdc == null) {
            return false;
        }
        boolean check = false;

        String sql1 = "INSERT INTO `tbltayduachang584` (id, mataydua, sothutuxuatphat, diem, thoigian, sovong, tblChangDua584id, tblTayDua584id)\n" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con.setAutoCommit(false);
            PreparedStatement stm = con.prepareStatement(sql1);
            stm.setInt(1, tdc.getId());
            stm.setString(2, tdc.getMataydua());
            stm.setString(3, tdc.getSothuxuatphat());
            stm.setInt(4, tdc.getDiem());
            stm.setFloat(5, tdc.getThoigian());
            stm.setInt(6, tdc.getSovong());
            stm.setInt(7, tdc.getIdChangDua());
            stm.setInt(8, tdc.getIdTayDua());
            if (stm.executeUpdate() <= 0) {
                return false;
            }
            con.commit();
            check = true;
        } catch (SQLException ex) {
            Logger.getLogger(TayDuaChang584DAO.class.getName()).log(Level.SEVERE, null, ex);
            check = false;
        }
        return check;
    }
}

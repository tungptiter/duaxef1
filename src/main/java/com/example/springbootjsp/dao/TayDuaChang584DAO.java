package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.TayDuaChang584;
import java.sql.PreparedStatement;
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

        String sql = "UPDATE `tbltayduachang584` SET mataydua = ?, sothutuxuatphat = ?, diem = ?," +
                "thoigian = ?, sovong  = ?, tblChangDua584id  = ?, tblTayDua584id = ? \n"
                + "WHERE id = ?";

        try {
            con.setAutoCommit(false);

            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tdc.getMataydua());
            stm.setString(2, tdc.getSothuxuatphat());
            stm.setInt(3, tdc.getDiem());
            stm.setFloat(4, tdc.getThoigian());
            stm.setInt(5, tdc.getSovong());
            stm.setInt(6, tdc.getIdChangDua());
            stm.setInt(7, tdc.getIdTayDua());

            if (stm.executeUpdate() <= 0) {
                return false;
            }
            con.commit();
            check = true;
        } catch (SQLException ex) {
            try {
                con.rollback(); //cmt dong nay ney chay che do JUnit test



            } catch (SQLException ex1) {
                check = false;
                Logger.getLogger(TayDuaChang584DAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                con.setAutoCommit(true); //cmt dong nay ney chay che do JUnit test



            } catch (SQLException ex) {
                check = false;
                Logger.getLogger(TayDuaChang584DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return check;
    }
}

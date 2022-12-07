package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.GiaiDua584;
import com.example.springbootjsp.model.TayDuaChang584;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChangDuaDAO584 extends DAO {
    public ChangDuaDAO584() {
        super();
    }

    public String luuThongTin(int idChangDua, int idTayDua) {

        TayDuaChang584 tdc = new TayDuaChang584();

        String sql = "SELECT * FROM `tbltayduachang584` WHERE tblChangDua584id = ? AND  tblTayDua584id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, idChangDua);
            stm.setInt(2, idTayDua);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
//                System.out.println("Da Dang Ky roi 1");
                return "Đã đăng ký";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql1 = "INSERT INTO `tbltayduachang584` ( mataydua, sothutuxuatphat, diem, thoigian, sovong, tblChangDua584id, tblTayDua584id)\n" +
                "VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        try {
            con.setAutoCommit(false);
            PreparedStatement stm = con.prepareStatement(sql1);
//            stm.setInt(1, tdc.getId());
            stm.setString(1, idChangDua + " " + idTayDua);
            stm.setString(2, "S" + idChangDua + " " + idTayDua);
            stm.setInt(3, 0);
            stm.setFloat(4, 0);
            stm.setInt(5, 0);
            stm.setInt(6, idChangDua);
            stm.setInt(7, idTayDua);

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

    public ArrayList<ChangDua584> getDSChangDua() {
        ArrayList<ChangDua584> listChangDua584 = new ArrayList();
        String sql = "SELECT * FROM `tblchangdua584`";
        try {
            PreparedStatement stm = con.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ChangDua584 cd = new ChangDua584( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                listChangDua584.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listChangDua584;
    }

    public String getChangDuaTheoId(int idCd) {
        String diadiemCd = "";
        ChangDua584 cd = new ChangDua584();
        String sql = "SELECT * FROM `tblchangdua584` WHERE id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, idCd);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                diadiemCd = rs.getString(3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChangDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return diadiemCd;
    }
}

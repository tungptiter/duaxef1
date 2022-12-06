package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.GiaiDua584;

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

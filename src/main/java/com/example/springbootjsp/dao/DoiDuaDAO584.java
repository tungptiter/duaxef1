package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.DoiDua584;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoiDuaDAO584 extends DAO {

    public DoiDuaDAO584() {
        super();
    }

    public ArrayList<DoiDua584> getDSDoiDua() {
        ArrayList<DoiDua584> listDoiDua584 = new ArrayList();
        String sql = "SELECT * FROM `tbldoidua584`";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                DoiDua584 dd = new DoiDua584( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listDoiDua584.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listDoiDua584;
    }

    public DoiDua584 getIdDoiDuaTheoTen(String tenDoiDua) {
        DoiDua584 doidua = new DoiDua584();

        String sql = "SELECT * FROM `tbldoidua584` WHERE ten = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tenDoiDua);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                doidua= new DoiDua584( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return doidua;
    }

    public String getTenDoiDuaTheoId(int idDd) {
        String tenDoiDua = "";

        String sql = "SELECT * FROM `tbldoidua584` WHERE id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, idDd);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                tenDoiDua = rs.getString(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return tenDoiDua;
    }
}

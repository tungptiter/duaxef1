package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.DoiDua584;
import com.example.springbootjsp.model.TayDua584;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TayDuaDAO584 extends DAO {

    public TayDuaDAO584() {
        super();
    }

    public ArrayList<TayDua584> getDSTayDua() {
        ArrayList<TayDua584> listChangDua = new ArrayList();
        String sql = "SELECT * FROM `tbltaydua584`";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                TayDua584 td = new TayDua584( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),  rs.getInt(6));
                listChangDua.add(td);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TayDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listChangDua;
    }

    public ArrayList<TayDua584> getDSTayDuaTheoDoiDua(int idDoiDua) {
        ArrayList<TayDua584> listTayDua = new ArrayList();

        String sql = "SELECT * FROM `tbltaydua584`  WHERE tblDoiDua584id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, idDoiDua);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                TayDua584 td = new TayDua584( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),  rs.getInt(6));
                listTayDua.add(td);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TayDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listTayDua;
    }

    public int getIdDdTheoIdTd(int idTayDua) {
        int idDd = 0;

        String sql = "SELECT * FROM `tbltaydua584`  WHERE id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, idTayDua);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                idDd =  rs.getInt(6);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TayDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return idDd;
    }
}

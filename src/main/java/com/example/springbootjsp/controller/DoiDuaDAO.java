package com.example.springbootjsp.controller;

import com.example.springbootjsp.model.DoiDua;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoiDuaDAO extends DAO {

    public DoiDuaDAO() {
        super();
    }

    public ArrayList<DoiDua> getDSDoiDua() {
        ArrayList<DoiDua> listDoiDua = new ArrayList();

        String sql = "SELECT * FROM `tbldoidua`";
        try {
            PreparedStatement stm = con.prepareStatement(sql);

            ResultSet result = stm.executeQuery();
            while (result.next()) {
                DoiDua cd = new DoiDua();
                cd.setId(result.getInt("id"));
//                cd.setTen(result.getString("ten"));


//                cd.setSovongdua(result.getFloat("sovongdua"));
//                cd.setThoigian(result.getInt("thoigian"));
//                cd.setMota(result.getString("mota"));
//
//                DiaDiem dd = new DiaDiem();
//                dd.setId(result.getInt("tblDiaDiemid"));
//                cd.setDiaDiem(dd);
//
//                MuaGiai mg = new MuaGiai();
//                mg.setId(result.getInt("tblMuaGiaiid"));
//                cd.setMuaGiai(mg);

                listDoiDua.add(cd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiDuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listDoiDua;
    }
}

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
//                DoiDua584 cd = new DoiDua584();
//                cd.setId(result.getInt("id"));

                DoiDua584 dd = new DoiDua584( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

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
}

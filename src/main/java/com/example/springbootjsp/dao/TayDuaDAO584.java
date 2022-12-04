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
//                TayDua584 td = new TayDua584();
//                td.setId(result.getInt("id"));

                TayDua584 td = new TayDua584( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
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

                listChangDua.add(td);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TayDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listChangDua;
    }
}

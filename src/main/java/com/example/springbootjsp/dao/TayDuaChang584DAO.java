package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.DoiDua584;
import com.example.springbootjsp.model.TayDua584;
import com.example.springbootjsp.model.TayDuaChang584;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        String sql = "SELECT * FROM `tbltayduachang584` WHERE tblChangDua584id = ? AND  tblTayDua584id = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, tdc.getIdChangDua());
            stm.setInt(2, tdc.getIdTayDua());
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                System.out.println("Da Dang Ky roi 1");
                return "Đã đăng ký";
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiDuaDAO584.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Da Dang Ky roi 2");
//            return "chua đăng ký 2";
        }

//        TayDuaDAO584 daoTd = new TayDuaDAO584();
//        int idDd = daoTd.getIdDdTheoIdTd(tdc.getIdTayDua());
//        ArrayList<TayDua584> listTayDua584 = daoTd.getDSTayDuaTheoDoiDua(idDd);
//        int dem = 0;
//        for (TayDua584 td: listTayDua584) {
//            if(td.getId() == tdc.getIdTayDua()) {
//                System.out.println(td.getTen());
//                System.out.println(tdc.getId());
//                System.out.println(dem);
//                dem = dem + 1;
//                if(dem == 2){
//                    System.out.println("du thanh vien roi");
//                    return "Du Tay Dua";
//                }
//            }
//        }



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

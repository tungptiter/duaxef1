package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.TayDuaChang584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.annotation.Rollback;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TayDuaChangDAOTest584 {
    @InjectMocks
    private TayDuaChang584DAO changDuaDAO584;

    @Mock
    Connection connection;

    @Rollback
    @Test
    public void testLuuDangKyThanhCong() {
        TayDuaChang584DAO dao = new TayDuaChang584DAO();

        TayDuaChang584 tdc2 = new TayDuaChang584(10,"7","s7",0,0,0, 4, 4);
        String check2 = dao.luuDangKy(tdc2);
        assertEquals(check2, "ok");

        TayDuaChang584 tdc3 = new TayDuaChang584(8,"8","s8",0,0,0, 4, 5);
        String check3 = dao.luuDangKy(tdc3);
        assertEquals(check3, "ok");

        TayDuaChang584 tdc4 = new TayDuaChang584(9,"9","s9",0,0,0, 4, 6);
        String check5 = dao.luuDangKy(tdc4);
        assertEquals(check5, "ok");
    }

    @Rollback
    @Test
    public void testLuuDangKyDaDangKy() {
        TayDuaChang584DAO dao = new TayDuaChang584DAO();

        TayDuaChang584 tdc = new TayDuaChang584(6,"6","s6",0,0,0, 1, 2);
        String check = dao.luuDangKy(tdc);
        assertEquals(check, "Đã đăng ký");

        TayDuaChang584 tdc3 = new TayDuaChang584(8,"8","s8",0,0,0, 1, 3);
        String check3 = dao.luuDangKy(tdc3);
        assertEquals(check3, "Đã đăng ký");
    }

    @Rollback
    @Test
    public void testLuuDangKyNull() {
        TayDuaChang584DAO dao = new TayDuaChang584DAO();

        String check4 = dao.luuDangKy(null);
        assertEquals(check4, "Lỗi đăng ký tay đua");
    }

    @Rollback
    @Test
    public void testLuuDangKyThanhCongCSDL() {
        TayDuaChang584DAO dao = new TayDuaChang584DAO();

        TayDuaChang584 tdc2 = new TayDuaChang584(55,"7","s7",0,0,0, 5, 5);
        String check2 = dao.luuDangKy(tdc2);

        TayDuaChang584 tdc = dao.getTdc(55);
        assertEquals(tdc.getIdChangDua(), 5);
        assertEquals(tdc.getIdTayDua(), 5);
        assertEquals(check2, "ok");
    }

}

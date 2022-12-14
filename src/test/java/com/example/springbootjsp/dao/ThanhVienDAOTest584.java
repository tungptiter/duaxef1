package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.annotation.Rollback;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThanhVienDAOTest584 {
    @InjectMocks
    private ThanhVienDAO584 changDuaDAO584;

    @Mock
    Connection connection;

    @Rollback
    @Test
    public void testGetDSChangDua() {

        ThanhVienDAO584 dao = new ThanhVienDAO584();
        String tendangnhap = dao.dangNhap("admin", "admin");
        assertEquals(tendangnhap, "thanh");

        String tendangnhap2 = dao.dangNhap("tunglo", "123456");
        assertEquals(tendangnhap2, "tùng lổ");

        String tendangnhap3 = dao.dangNhap("", "");
        assertEquals(tendangnhap3, "");
    }
}

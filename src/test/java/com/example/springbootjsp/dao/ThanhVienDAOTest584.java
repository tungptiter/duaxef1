package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThanhVienDAOTest584 {
    @InjectMocks
    private ThanhVienDAO584 changDuaDAO584;

    @Mock
    Connection connection;

    @Test
    public void testGetDSChangDua() {

        ThanhVienDAO584 dao = new ThanhVienDAO584();
        String tendangnhap = dao.dangNhap("admin", "2");
        assertEquals(tendangnhap, "thanh");
    }
}

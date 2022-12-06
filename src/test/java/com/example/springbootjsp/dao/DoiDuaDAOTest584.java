package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.DoiDua584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DoiDuaDAOTest584 {
    @InjectMocks
    private DoiDuaDAO584 doiDuaDAO584;

    @Mock
    Connection connection;

    @Test
    public void testGetDSDoiDua() {

        DoiDuaDAO584 dao = new DoiDuaDAO584();
        ArrayList<DoiDua584> listDoiDua584 = dao.getDSDoiDua();
        for (DoiDua584 cd:   listDoiDua584) {
            assertEquals(cd.getTen(), "redbull");
            break;
        }
    }

    @Test
    public void testGetIdDoiDuaTheoTen() {
        DoiDuaDAO584 dao = new DoiDuaDAO584();
        assertEquals(dao.getIdDoiDuaTheoTen("redbull"), 1);
    }

    @Test
    public void testGetTenDoiDuaTheoId() {
        DoiDuaDAO584 dao = new DoiDuaDAO584();
        assertEquals(dao.getTenDoiDuaTheoId(4), "vinfastf88");
    }
}

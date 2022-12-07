package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.DoiDua584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.annotation.Rollback;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DoiDuaDAOTest584 {
    @InjectMocks
    private DoiDuaDAO584 doiDuaDAO584;

    @Mock
    Connection connection;

    @Rollback
    @Test
    public void testGetDSDoiDua() {

        DoiDuaDAO584 dao = new DoiDuaDAO584();
        ArrayList<DoiDua584> listDoiDua584 = dao.getDSDoiDua();
        int dem = 0;
        for (DoiDua584 cd:   listDoiDua584) {
            dem++;
            if(dem == 1)  assertEquals(cd.getTen(), "Redbull");
            else if(dem == 4)  assertEquals(cd.getTen(), "Vinfastf88");
            else if(dem == 8)  assertEquals(cd.getTen(), "Huyndai x5");
            else if(dem > 8) break;
        }
    }

    @Rollback
    @Test
    public void testGetIdDoiDuaTheoTen() {
        DoiDuaDAO584 dao = new DoiDuaDAO584();
        assertEquals(dao.getIdDoiDuaTheoTen("Redbull"), 1);
        assertEquals(dao.getIdDoiDuaTheoTen("Ford z8"), 9);
        assertEquals(dao.getIdDoiDuaTheoTen("Toyota JaPan"), 10);
    }

    @Rollback
    @Test
    public void testGetTenDoiDuaTheoId() {
        DoiDuaDAO584 dao = new DoiDuaDAO584();
        assertEquals(dao.getTenDoiDuaTheoId(4), "Vinfastf88");
        assertEquals(dao.getTenDoiDuaTheoId(5), "Rollroyce 99");
        assertEquals(dao.getTenDoiDuaTheoId(6), "Mercedes-Benz");
    }
}

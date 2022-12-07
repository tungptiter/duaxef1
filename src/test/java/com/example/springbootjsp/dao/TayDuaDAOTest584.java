package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.TayDua584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TayDuaDAOTest584 {
    @InjectMocks
    private TayDuaDAO584 tayDuaDAO584;

    @Mock
    Connection connection;

    @Test
    public void testGetDSTayDua() {
        TayDuaDAO584 dao = new TayDuaDAO584();
        ArrayList<TayDua584> listTayDua584 = dao.getDSTayDua();
        int dem = 0;
        for (TayDua584 cd:   listTayDua584) {
            dem++;
            if(dem == 1)  assertEquals(cd.getTen(), "nguyễn tùng");
            else if(dem == 6)  assertEquals(cd.getTen(), "abachap");
            else if(dem == 9)  assertEquals(cd.getTen(), "Phạm Hùng");
            else if(dem == 11) assertEquals(cd.getTen(), "Quang Sáng");
            else if(dem > 11) break;
        }

        ArrayList<TayDua584> listTayDua584T2 = dao.getDSTayDuaTheoDoiDua(20);
        ArrayList<TayDua584> myListEmpty = new ArrayList<>();
        assertEquals(listTayDua584T2, myListEmpty );
    }

    @Test
    public void testGetDSTayDuaTheoDoiDua() {
        TayDuaDAO584 dao = new TayDuaDAO584();
        ArrayList<TayDua584> listTayDua584 = dao.getDSTayDuaTheoDoiDua(2);
        int dem = 0;
        for (TayDua584 cd:   listTayDua584) {
            dem++;
            if(dem == 4) assertEquals(cd.getTen(), "tony tèo");
            else if(dem == 8) assertEquals(cd.getTen(), "Baham Quatar");
            else if(dem == 15) assertEquals(cd.getTen(), "Thanh Bình");
            else if(dem > 15) break;
        }
    }

    @Test
    public void testGetIdDdTheoIdTd() {
        TayDuaDAO584 dao = new TayDuaDAO584();
        int idDd = dao.getIdDdTheoIdTd(2);
        assertEquals(idDd, 1);
    }

}

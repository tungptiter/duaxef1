package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.TayDua584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.sql.Connection;
import java.util.ArrayList;

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
        for (TayDua584 cd:   listTayDua584) {
            assertEquals(cd.getTen(), "nguyễn tùng");
            break;
        }
    }

    @Test
    public void testGetDSTayDuaTheoDoiDua() {
        TayDuaDAO584 dao = new TayDuaDAO584();
        ArrayList<TayDua584> listTayDua584 = dao.getDSTayDuaTheoDoiDua(2);
        for (TayDua584 cd:   listTayDua584) {
            assertEquals(cd.getTen(), "phạm danh hùng");
            break;
        }
    }

}

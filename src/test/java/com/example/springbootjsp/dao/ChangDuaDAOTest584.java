package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.TayDuaChang584;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class ChangDuaDAOTest584 {
    @InjectMocks
    private ChangDuaDAO584 changDuaDAO584;

    @Mock
    Connection connection;

    @Test
    public void testGetDSChangDua() {

        ChangDuaDAO584 dao = new ChangDuaDAO584();
        ArrayList<ChangDua584> listChangDua584 = dao.getDSChangDua();
        for (ChangDua584 cd:   listChangDua584) {
            assertEquals(cd.getDiadiem(), "hà nội");
            break;
        }
    }

    @Test
    public void testGetChangDuaTheoId() {
        ChangDuaDAO584 dao = new ChangDuaDAO584();
        assertEquals(dao.getChangDuaTheoId(1), "hà nội");

    }
}

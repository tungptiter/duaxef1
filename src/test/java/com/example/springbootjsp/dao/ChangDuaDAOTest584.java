package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.TayDua584;
import com.example.springbootjsp.model.TayDuaChang584;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.Mockito.*;

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
        int dem = 0;
        for (ChangDua584 cd:   listChangDua584) {
            dem++;
            if(dem == 1) assertEquals(cd.getDiadiem(), "Hà nội");
            else if(dem == 2) assertEquals(cd.getDiadiem(), "Nghệ an");
            else if(dem == 5) assertEquals(cd.getDiadiem(), "Hà tĩnh");
            else if(dem > 5) break;
        }
    }

    @Test
    public void testGetChangDuaTheoId() {
        ChangDuaDAO584 dao = new ChangDuaDAO584();
        assertEquals(dao.getChangDuaTheoId(1), "Hà nội");
        assertEquals(dao.getChangDuaTheoId(9), "Lào cai");
        assertEquals(dao.getChangDuaTheoId(10), "Quảng Ninh");

        assertEquals(dao.getChangDuaTheoId(15), "");
    }


//    @Test
//    public void testGetDSChangDua2() throws  Exception {
//
//        Mockito.when(connection.prepareStatement( any() )) .thenReturn(statement);
//        when(ChangDuaDAO584.con.getAutoCommit()).then(ArrayList<ChangDua584>);
//        ChangDuaDAO584 dao = new ChangDuaDAO584();
//        ArrayList<ChangDua584> listChangDua584 = dao.getDSChangDua();
//        int dem = 0;
//        for (ChangDua584 cd:   listChangDua584) {
//            dem++;
//            if(dem == 1) assertEquals(cd.getDiadiem(), "Hà nội");
//            else if(dem == 2) assertEquals(cd.getDiadiem(), "Nghệ an");
//            else if(dem == 5) assertEquals(cd.getDiadiem(), "Hà tĩnh");
//            else if(dem > 5) break;
//        }
//    }
}


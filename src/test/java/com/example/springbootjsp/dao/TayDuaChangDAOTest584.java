package com.example.springbootjsp.dao;

import com.example.springbootjsp.model.ChangDua584;
import com.example.springbootjsp.model.TayDuaChang584;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.sql.Connection;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TayDuaChangDAOTest584 {
    @InjectMocks
    private TayDuaChang584DAO changDuaDAO584;

    @Mock
    Connection connection;

    @Test
    public void testGetDSChangDua() {
        TayDuaChang584 tdc = new TayDuaChang584(6,"6","s6",0,0,0, 1, 3);
        TayDuaChang584DAO dao = new TayDuaChang584DAO();
        boolean check = dao.luuDangKy(tdc);
        assertTrue(check);
    }
}

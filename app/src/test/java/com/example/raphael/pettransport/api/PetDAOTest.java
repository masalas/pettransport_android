package com.example.raphael.pettransport.api;

import org.junit.Before;
import org.junit.Test;

public class PetDAOTest {

    PetDAO dao;

    @Before
    public void setUp(){
        dao = new PetDAO();
    }

    @Test
    public void test() throws Exception {
        dao.getPets();
    }
}

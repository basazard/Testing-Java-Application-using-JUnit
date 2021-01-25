/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ARSY
 */
public class TblAdminTest {
    
    public TblAdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validasiLoginAdmin method, of class TblAdmin.
     */
    @Test
    public void testValidasiLoginAdmin() {
        System.out.println("Test validasi Login Admin");
        TblAdmin instance = new TblAdmin();
        instance.setUsername("admin");
        instance.setPassword("1234");
        String expResult = "DashboardAdmin";
        String result = instance.validasiLoginAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdAdmin method, of class TblAdmin.
     */
    @Test
    public void testGetIdAdmin() {
        System.out.println("getIdAdmin");
        TblAdmin instance = new TblAdmin();
        Integer expResult = null;
        Integer result = instance.getIdAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdAdmin method, of class TblAdmin.
     */
    @Test
    public void testSetIdAdmin() {
        System.out.println("setIdAdmin");
        Integer idAdmin = null;
        TblAdmin instance = new TblAdmin();
        instance.setIdAdmin(idAdmin);
        assertEquals(instance.getIdAdmin(), idAdmin);
    }

    /**
     * Test of getUsername method, of class TblAdmin.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        TblAdmin instance = new TblAdmin();
        String expResult = "admin";
        instance.setUsername("admin");
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class TblAdmin.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "admin";
        TblAdmin instance = new TblAdmin();
        instance.setUsername(username);
        assertEquals(instance.getUsername(), username);
    }

    /**
     * Test of getPassword method, of class TblAdmin.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        TblAdmin instance = new TblAdmin();
        String expResult = "1234";
        instance.setPassword("1234");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class TblAdmin.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        TblAdmin instance = new TblAdmin();
        instance.setPassword(password);
        assertEquals(instance.getPassword(), password);
    }
}

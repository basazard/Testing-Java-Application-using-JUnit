/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.TblUser;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.hamcrest.core.IsAnything;
import static org.hamcrest.core.IsNull.notNullValue;
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
public class DAOUserTest {
    
    public DAOUserTest() {
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
     * Test of getBy method, of class DAOUser.
     */
    @Test
    public void testGetBy() {
        System.out.println("getBy");
        String email = "";
        String password = "";
        DAOUser instance = new DAOUser();
        List<TblUser> expResult = instance.getBy(email, password);
        List<TblUser> result = instance.getBy(email, password);
        assertThat(result,IsAnything.anything());
        assertThat(result,is(notNullValue()));
    }

    /**
     * Test of AddUser method, of class DAOUser.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        TblUser user = null;
        DAOUser instance = new DAOUser();
        instance.AddUser(user);
    }

    /**
     * Test of ShowPelanggan method, of class DAOUser.
     */
//    @Test
//    public void testShowPelanggan() {
//        System.out.println("ShowPelanggan");
//        DAOUser instance = new DAOUser();
//        List<TblUser> expResult = instance.ShowPelanggan();
//        List<TblUser> result = instance.ShowPelanggan();
//        assertEquals(result, is(notNullValue()));
//    }

    /**
     * Test of getbyID method, of class DAOUser.
     */
//    @Test
//    public void testGetbyID() {
//        System.out.println("getbyID");
//        String idU = "10";
//        DAOUser instance = new DAOUser();
//        List<TblUser> expResult = instance.getbyID(idU);
//        List<TblUser> result = instance.getbyID(idU);
//        assertEquals(expResult, result);
//        assertThat(result,is(notNullValue()));
//    }

    /**
     * Test of getbyEmail method, of class DAOUser.
     */
//    @Test
//    public void testGetbyEmail() {
//        System.out.println("getbyEmail");
//        String emailUser = "arsy.fahrezi@gmail.com";
//        DAOUser instance = new DAOUser();
//        List<TblUser> expResult = instance.getbyEmail("arsy.fahrezi@gmail.com"); 
//        List<TblUser> result = instance.getbyEmail("arsy.fahrezi@gmail.com");
//        assertEquals(expResult, result);
//        assertThat(result, is(notNullValue()));
//    }

    /**
     * Test of deleteUser method, of class DAOUser.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        Integer idU = null;
        DAOUser instance = new DAOUser();
        instance.deleteUser(idU);
    }

    /**
     * Test of editUser method, of class DAOUser.
     */
    @Test
    public void testEditUser() {
        System.out.println("editUser");
        TblUser usr = null;
        DAOUser instance = new DAOUser();
        instance.editUser(usr);
    }
    
}

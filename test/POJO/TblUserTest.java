/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.util.Arrays;
import java.util.List;
import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author ARSY
 */
public class TblUserTest {
    
    int idUser;
    TblUser usr = new TblUser();
    
    public TblUserTest() {
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
    
    @Test
    public void testGetIDuser(){
        System.out.println("1. Get ID User");
        TblUser us = new TblUser();
        int exp = 10;
        us.setIdUser(10);
        Integer result = us.getIdUser();
        assertEquals(exp, result, 0.0);
    }
    
    @Test
    public void testSetIDuser(){
        System.out.println("2. Set ID User");
        Integer idUser = 10;
        TblUser us = new TblUser();
        us.setIdUser(idUser);
        assertEquals(us.getIdUser(), idUser);
    }
    
    @Test
    public void testGetEmailuser() {
        System.out.println("3. Get Email User");
        TblUser us = new TblUser();
        String exp = "user@email.com";
        us.setEmail("user@email.com");
        String result = us.getEmail();
        assertEquals(exp, result);
        assertThat(exp, allOf(endsWith("m"),startsWith("u") ));
    }
    
    @Test
    public void testSetEmailuser() {
        System.out.println("4. set Email user");
        String email = "user@gmail.com";
        TblUser instance = new TblUser();
        instance.setEmail(email);
        assertEquals(instance.getEmail(), email);
    }
    
    @Test
    public void testGetNamaPanjang() {
        System.out.println("5. get Nama Panjang");
        TblUser us = new TblUser();
        String expResult = "Muhammad Arsy Fahrezi";
        us.setNamaPanjang("Muhammad Arsy Fahrezi");
        String result = us.getNamaPanjang();
        assertEquals(expResult, result);
        assertThat(expResult, allOf(endsWith("rezi"),containsString("A"),startsWith("M") ));
    }

    /**
     * Test of setNamaPanjang method, of class TblUser.
     */
    @Test
    public void testSetNamaPanjang() {
        System.out.println("6. set Nama Panjang");
        String namaPanjang = "Rofi";
        TblUser instance = new TblUser();
        instance.setNamaPanjang(namaPanjang);
        assertEquals(instance.getNamaPanjang(), namaPanjang);
    }

    /**
     * Test of getNoTelp method, of class TblUser.
     */
    @Test
    public void testGetNoTelp() {
        System.out.println("7. get NoTelp");
        TblUser instance = new TblUser();
        String expResult = "089636043008";
        instance.setNoTelp("089636043008");
        String result = instance.getNoTelp();
        assertEquals(expResult, result);
        assertThat(expResult, allOf(endsWith("8"),containsString("636"),startsWith("0") ));
    }

    /**
     * Test of setNoTelp method, of class TblUser.
     */
    @Test
    public void testSetNoTelp() {
        System.out.println("8. set NoTelp");
        String noTelp = "5480033";
        TblUser instance = new TblUser();
        instance.setNoTelp(noTelp);
        assertEquals(instance.getNoTelp(), noTelp);
    }

    /**
     * Test of getAlamat method, of class TblUser.
     */
    @Test
    public void testGetAlamat() {
        System.out.println("9. get Alamat");
        TblUser instance = new TblUser();
        String expResult = "Kebon Jeruk";
        instance.setAlamat("Kebon Jeruk");
        String result = instance.getAlamat();
        assertEquals(expResult, result);
        assertThat(expResult, allOf(endsWith("k"),containsString("bon"),startsWith("K") ));
    }

    /**
     * Test of setAlamat method, of class TblUser.
     */
    @Test
    public void testSetAlamat() {
        System.out.println("10. set Alamat");
        String alamat = "Kebon Jeruk";
        TblUser instance = new TblUser();
        instance.setAlamat(alamat);
        assertEquals(instance.getAlamat(), alamat);
    }

    /**
     * Test of getPassword method, of class TblUser.
     */
    @Test
    public void testGetPassword() {
        System.out.println("11. get Password");
        TblUser instance = new TblUser();
        String expResult = "12345678";
        instance.setPassword("12345678");
        String result = instance.getPassword();
        assertEquals(expResult, result);
        assertThat(expResult, allOf(endsWith("8"),containsString("7"),startsWith("1") ));
    }

    /**
     * Test of setPassword method, of class TblUser.
     */
    @Test
    public void testSetPassword() {
        System.out.println("12. set Password");
        String password = "12345678";
        TblUser instance = new TblUser();
        instance.setPassword(password);
        assertEquals(instance.getPassword(), password);
    }
    
    @Test
    public void testValidasiLoginUser() {
        System.out.println("13. validasi Login User");
        TblUser instance = new TblUser();
        instance.setEmail("arsy.fahrezi@gmail.com");
        instance.setPassword("12345678");
        String expResult = "index";
        String result = instance.validasiLoginUser();
        assertEquals(expResult, result);
    }
    
//    @Ignore
//    @Test
//    public void updateUser() {
//        TblUser controller = new TblUser();
//        idUser = "10";
//        usr.setIdUser("10");
//        
//
//        Boolean update = controller.update_hotel(id, model);
//        Boolean expected = Boolean.TRUE;
//
//        try {
//            assertEquals(expected, update);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
    
    /**
     * Test of save_user method, of class TblUser.
     */
    @Test
    public void testSave_user() {
        System.out.println("save_user");
        TblUser instance = new TblUser();
        String expResult = "FormLoginUser";
        String result = instance.save_user();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllRecords method, of class TblUser.
     */
//    @Test
//    public void testGetAllRecords() {
//        System.out.println("getAllRecords");
//        TblUser instance = new TblUser();
//        List<TblUser> expResult = instance.getAllRecords();
//        List<TblUser> result = instance.getAllRecords();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of getByID method, of class TblUser.
     */
//    @Test
//    public void testGetByID() {
//        System.out.println("getByID");
//        TblUser instance = new TblUser();
//        String expResult = "";
//        String result = instance.getByID();
//        assertEquals(expResult, result);
//    }
    
//    @Test(expected = StackOverflowError.class)
//    public void testGetByID() {
//        System.out.println("Test Get by ID");
//        try{
//            testGetByID();
//            fail("Exception not thrown");
//        }catch (NullPointerException e){
//            assertEquals(e.getMessage(), "Operation Not Supported");
//        }
//    }

    /**
     * Test of getByEmail method, of class TblUser.
     */
//    @Test
//    public void testGetByEmail() {
//        System.out.println("getByEmail");
//        String email = "arsy.fahrezi@gmail.com";
//        TblUser instance = new TblUser();
//        String expResult = instance.getByEmail();
//        String result = instance.getByEmail();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of edit method, of class TblUser.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        TblUser instance = new TblUser();
        instance.edit();
    }
    /**
     * Test of delete method, of class TblUser.
     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        TblUser instance = new TblUser();
//        instance.delete();
//    }
}

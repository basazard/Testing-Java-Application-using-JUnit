/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.TblAdmin;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.hamcrest.core.IsAnything;
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
public class DAOAdminTest {
    
    public DAOAdminTest() {
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
     * Test of getBy method, of class DAOAdmin.
     */
    @Test
    public void testGetBy() {
        System.out.println("getBy");
        String uName = "";
        String aPass = "";
        DAOAdmin instance = new DAOAdmin();
        List<TblAdmin> expresult = instance.getBy(uName, aPass);
        List<TblAdmin> result = instance.getBy(uName, aPass);
        assertThat(result,IsAnything.anything());
        assertThat(result,is(notNullValue()));
    }
    
}

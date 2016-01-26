/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Swapnull
 */
public class CompanyListTest {
    
    public CompanyListTest() {
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
     * Test of findCompany method, of class CompanyList.
     */
    @Test
    public void testFindCompany() {
        System.out.println("findCompany");
        String companyName = "SHU";
        CompanyList instance = new CompanyList();
        Company expResult = new Company("SHU");
        instance.companies.add(expResult);
        
        Company result = instance.findCompany(companyName);
        assertEquals(expResult, result);
    }
    
}

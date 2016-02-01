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
public class ZoneListTest {
    
    public ZoneListTest() {
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
     * Test of findZone method, of class ZoneList.
     */
    @Test
    public void testFindZone() {
        System.out.println("findZone");
        String zoneID = "123";
        ZoneList instance = new ZoneList();
        Zone expResult = new Zone("123");
        instance.zones.add(expResult);
        Zone result = instance.findZone(zoneID);
        assertEquals(expResult, result);
    }
    
}

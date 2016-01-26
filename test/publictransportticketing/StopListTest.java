/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Vector;
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
public class StopListTest {
    
    public StopListTest() {
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
     * Test of findStop method, of class StopList.
     */
    @Test
    public void testFindStop() {
        System.out.println("findStop");
        String stopId = "100";
        StopList instance = new StopList();
        Stop expResult = new Stop("100", "Sheffield", new Location(1.2f, 1.3f), "Train", new Zone("1"));
        instance.allStops.add(expResult);
        Stop result = instance.findStop(stopId);
        assertEquals(expResult, result);
    }

    /**
     * Test of findStopByType method, of class StopList.
     */
    @Test
    public void testFindStopByType() {
        System.out.println("findStopByType");
        String type = "Train";
        
        StopList instance = new StopList();
        
        //define stops
        Stop stop1 = new Stop("100", "Sheffield", new Location(1.2f, 1.3f), "Train", new Zone("1"));
        Stop stop2 = new Stop("200", "Darnall", new Location(2.4f, 5.5f), "Bus", new Zone("3"));
        Stop stop3 = new Stop("300", "Sheffield", new Location(1.6f, 1.7f), "Train", new Zone("MangoCannon"));
        
        //add stops to test class
        instance.allStops.add(stop1);
        instance.allStops.add(stop2);
        instance.allStops.add(stop3);
        
        //add stops to expected result
        Vector<Stop> expResult = new Vector<Stop>();
        expResult.add(stop1);
        expResult.add(stop3);
        
        //run test
        Vector<Stop> result = instance.findStopByType(type);
        assertEquals(expResult, result);
    }
    
}

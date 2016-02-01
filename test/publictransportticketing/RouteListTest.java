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
public class RouteListTest {
    
    public RouteListTest() {
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
     * Test of findRoute method, of class RouteList.
     */
    @Test
    public void testFindRoute() {
        System.out.println("findRoute");
        String routeID = "123";
        RouteList instance = new RouteList();
        Route expResult = new Route("123", "SYTrain", new Location(1.2f, 1.3f), new Location(1.5f, 1.9f), new StopList());
        instance.routeList.add(expResult);
        
        //run test
        Route result = instance.findRoute(routeID);
        assertEquals(expResult, result);

    }
    
}

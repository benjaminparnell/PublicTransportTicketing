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
 * @author swapnull
 */
public class BaseFareListTest {
    
    public BaseFareListTest() {
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
     * Test of findFair method, of class BaseFareList.
     */
    @Test
    public void testFindFair() {
        System.out.println("findFair");
        String fareID = "fa123";
        BaseFareList instance = new BaseFareList();
        
        Fare expResult = new Fare(fareID, new TransportList(), new ZoneList());
        instance.fareList.add(expResult);
        
        Fare result = instance.findFair(fareID);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValidFares method, of class BaseFareList.
     */
    @Test
    public void testGetValidFares() {
        System.out.println("getValidFares");
        BaseFareList instance = new BaseFareList();

        //create journey to test against
        Stop start = new Stop("100", "Sheffield", new Location(1.2f, 1.3f), "Train", new Zone("1"));
        Stop dest = new Stop("200", "Darnall", new Location(2.4f, 5.5f), "Bus", new Zone("3"));
        Journey journey = new Journey(start, dest, new Transport("748", new TransportType("bus")));

        String id = "test123";
        
        //create transportList
        TransportList transport = new TransportList();
        
        //create zone lists
        ZoneList zones = new ZoneList();
        zones.zones.add(new Zone("1"));
        zones.zones.add(new Zone("2")); 
        zones.zones.add(new Zone("3"));
        zones.zones.add(new Zone("4"));  
        
        ZoneList zones2 = new ZoneList();
        zones.zones.add(new Zone("1"));
        zones.zones.add(new Zone("2")); 
        
        //create fares
        Fare fare = new Fare(id, transport, zones);
        Fare fare2 = new Fare(id, transport, zones2); 
        
        //add fares to list
        instance.fareList.add(fare); 
        instance.fareList.add(fare2); 
       
        Vector<Fare> expResult = new Vector<Fare>();
        expResult.add(fare);
        
        Vector<Fare> result = instance.getValidFares(journey);
        assertEquals(expResult, result);

    }

    /**
     * Test of addBaseFare method, of class BaseFareList.
     */
    @Test
    public void testAddBaseFare() {
        System.out.println("addBaseFare");
        String id = "test123";
        TransportList transport = new TransportList();
        ZoneList zones = new ZoneList();
        BaseFareList instance = new BaseFareList();
        Fare fare = new Fare(id, transport, zones);
        instance.addBaseFare(fare);
        
        assertEquals(instance.fareList.get(0).fareID, id);
    }
    
}

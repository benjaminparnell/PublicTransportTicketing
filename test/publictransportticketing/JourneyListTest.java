/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benp
 */
public class JourneyListTest {
    /**
     * Test of findJourney method, of class JourneyList.
     */
    @Test
    public void testFindJourney_string() {
        System.out.println("findJourney");
        String journeyID = "123";
        JourneyList instance = new JourneyList();
        Journey expResult = new Journey(new Location(1.2f, 1.3f), new Location(1.3f, 1.4f), new Transport("1", new TransportType("Train")));
        expResult.journeyID = journeyID;
        instance.addJourney(expResult);
        Journey result = instance.findJourney(journeyID);
        assertEquals(expResult, result);
    }

    /**
     * Test of findJourney method, of class JourneyList.
     */
    @Test
    public void testFindJourney_DateTime() {
        System.out.println("findJourney");
        DateTime date = new DateTime();
        JourneyList instance = new JourneyList();
        Journey expResult = new Journey(new Location(1.2f, 1.3f), new Location (1.2f, 1.3f), date.minusHours(1), date, new Transport("1", new TransportType("Train")));
        instance.addJourney(expResult);
        Journey result = instance.findJourney(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMostRecentJourney method, of class JourneyList.
     */
    @Test
    public void testGetMostRecentJourney() {
        System.out.println("getMostRecentJourney");
        JourneyList instance = new JourneyList();
        Journey expResult = new Journey(new Location(1.2f, 1.3f), new Location(1.3f, 1.4f), new Transport("2", new TransportType("Bus")));
        expResult.startTime = new DateTime();
        expResult.endTime = new DateTime();
        instance.addJourney(expResult);
        Journey result = instance.getMostRecentJourney();
        assertEquals(expResult, result);
    }

    /**
     * Test of addJourney method, of class JourneyList.
     */
    @Test
    public void testAddJourney_5args() {
        System.out.println("addJourney");
        Location start = null;
        Location destination = null;
        DateTime startTime = null;
        DateTime endTime = null;
        Transport transport = null;
        JourneyList instance = new JourneyList();
        instance.addJourney(start, destination, startTime, endTime, transport);
        assertEquals(instance.size(), 1);
    }

    /**
     * Test of addJourney method, of class JourneyList.
     */
    @Test
    public void testAddJourney_Journey() {
        System.out.println("addJourney");
        Journey journey = null;
        JourneyList instance = new JourneyList();
        instance.addJourney(journey);
        assertEquals(instance.size(), 1);
    }

    /**
     * Test of getTodaysJourneys method, of class JourneyList.
     */
    @Test
    public void testGetTodaysJourneys() {
        System.out.println("getTodaysJourneys");
        DateTime date = new DateTime();
        JourneyList instance = new JourneyList();
        Journey journey = new Journey(new Location(1.2f, 1.3f), new Location (1.2f, 1.3f), date.minusHours(1), date, new Transport("1", new TransportType("Train")));
        instance.addJourney(journey);
        JourneyList result = instance.getTodaysJourneys();
        assertEquals(result.size(), 1);
    }
    
}

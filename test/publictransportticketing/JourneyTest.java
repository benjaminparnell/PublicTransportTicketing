/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import org.joda.time.Duration;
import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benp
 */
public class JourneyTest {
    
    /**
     * Test of startJourney method, of class Journey.
     */
    @Test
    public void testStartJourney() {
        System.out.println("startJourney");
        Journey instance = new Journey(new Location(1.2f, 1.2f), new Location(2.2f, 2.2f), new Transport());
        instance.startJourney();
        assertTrue(instance.startTime instanceof DateTime);
    }

    /**
     * Test of getJourneyTime method, of class Journey.
     */
    @Test
    public void testGetJourneyTime() {
        System.out.println("getJourneyTime");
        DateTime start = new DateTime();
        DateTime end = new DateTime();
        Duration duration = new Duration(start, end);
        Journey instance = new Journey(new Location(1.2f, 1.2f), new Location(2.2f, 2.2f), start, end, new Transport());
        Duration result = instance.getJourneyTime();
        assertEquals(duration, result);
    }

    /**
     * Test of updateJourneyDestination method, of class Journey.
     */
    @Test
    public void testUpdateJourneyDestination() {
        System.out.println("updateJourneyDestination");
        Location destination = new Location(5.5f, 5.5f);
        Journey instance = new Journey(new Location(1.2f, 1.2f), new Location(2.2f, 2.2f), new Transport());;
        instance.updateJourneyDestination(destination);
        assertEquals(destination, instance.destination);
    }
    
}

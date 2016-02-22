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
        
        Stop start = new Stop("100", "Sheffield", new Location(1.2f, 1.3f), "Train", new Zone("1"));
        Stop dest = new Stop("200", "Darnall", new Location(2.4f, 5.5f), "Bus", new Zone("3"));
        Journey instance = new Journey(start, dest, new Transport("748", new TransportType("bus")));

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

        Stop startStop = new Stop("100", "Sheffield", new Location(1.2f, 1.3f), "Train", new Zone("1"));
        Stop destStop = new Stop("200", "Darnall", new Location(2.4f, 5.5f), "Bus", new Zone("3"));
        Journey instance = new Journey(startStop, destStop, start, end, new Transport("748", new TransportType("bus")));

        Duration result = instance.getJourneyTime();
        assertEquals(duration, result);
    }

    /**
     * Test of updateJourneyDestination method, of class Journey.
     */
    @Test
    public void testUpdateJourneyDestination() {
        System.out.println("updateJourneyDestination");
        Stop destination = new Stop("150", "Pontefract", new Location(0.2f, 0.3f), "Train", new Zone("1"));

        Stop start = new Stop("100", "Sheffield", new Location(1.2f, 1.3f), "Train", new Zone("1"));
        Stop dest = new Stop("200", "Darnall", new Location(2.4f, 5.5f), "Bus", new Zone("3"));
        Journey instance = new Journey(start, dest, new Transport("748", new TransportType("bus")));


        instance.updateJourneyDestination(destination);
        assertEquals(destination, instance.destination);
    }
    
}

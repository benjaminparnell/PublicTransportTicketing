/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class JourneyList {
    private Vector<Journey> journeyList;
    
    JourneyList(){
        this.journeyList = new Vector<Journey>();
    }
    
    /**
     * Find a journey by it's ID.
     * @param journeyID
     * @return journey
     */
    Journey findJourney(String journeyID){
        Journey foundJourney = null;
        for (Journey journey : this.journeyList) {
            if (journey.journeyID.equals(journeyID)) {
                foundJourney = journey;
            }
        }
        return foundJourney;
    }
    
    /**
     * Find a journey by the date.
     * @param date
     * @return journey
     */
    Journey findJourney(DateTime date){
        Journey foundJourney = null;
        for (Journey journey : this.journeyList) {
            if ((date.isBefore(journey.endTime) || date.equals(journey.endTime)) && (date.isAfter(journey.startTime) || date.equals(journey.endTime))) {
                foundJourney = journey;
            }
        }
        return foundJourney;

    }
    
    /**
     * Returns the most recent journey.
     * @return journey
     */
    Journey getMostRecentJourney(){
        Journey mostRecentJourney = null;
        for (Journey journey : this.journeyList) {
            if (mostRecentJourney != null && mostRecentJourney.endTime.isBefore(journey.endTime)) {
                mostRecentJourney = journey;
            } else if (mostRecentJourney == null) {
                mostRecentJourney = journey;
            }
        }
        return mostRecentJourney;

    }
    
    /**
     * Creates a journey and adds it to the list of journeys.
     * @param start
     * @param destination
     * @param startTime
     * @param endTime
     * @param transport 
     */
    void addJourney(Stop start, Stop destination, DateTime startTime, DateTime endTime, Transport transport){
        //This is the same class as Account.createJourney();
        Journey journey = new Journey(start, destination, startTime, endTime, transport);
        this.journeyList.add(journey);
    }
    
    /**
     * Adds a journey to the list of journeys.
     * @param journey 
     */
    void addJourney (Journey journey) {
        this.journeyList.add(journey);
    }
    
    /**
     * Gets the list of journeys that occurred today.
     * @return 
     */
    JourneyList getTodaysJourneys(){
        DateTime now = DateTime.now();
        DateTime todayStart = now.withTimeAtStartOfDay();
        DateTime tomorrowStart = now.plusDays(1).withTimeAtStartOfDay();
        Interval today = new Interval(todayStart, tomorrowStart);
        JourneyList todaysJourneys = new JourneyList();
        
        for (Journey journey : this.journeyList) {
            if (today.contains(journey.startTime) || today.contains(journey.endTime)) {
                todaysJourneys.addJourney(journey);
            }
        }
        
        return todaysJourneys;
    }
    
    /**
     * Returns the size of the journey list.
     * @return int
     */
    int size () {
        return this.journeyList.size();
    }
    
}

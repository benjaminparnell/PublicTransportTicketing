/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import org.joda.time.DateTime;
import org.joda.time.Duration;

/**
 *
 * @author Swapnull
 */
public class Journey {
    String journeyID;
    Location start; // should probably be of type Stop
    Location destination; // should probably be of type Stop
    DateTime startTime;
    DateTime endTime;
    Transport transport; //should probably be of type Transport
    
    Journey (Location start, Location destination, Transport transport) {
        this.start = start;
        this.destination = destination;
        this.transport = transport;
    }
    
    Journey (Location start, Location destination, DateTime startTime, DateTime endTime, Transport transport) {
        this.start = start;
        this.destination = destination;
        this.startTime = startTime;
        this.endTime = endTime;
        this.transport = transport;
    }
    
    void startJourney(){ 
        this.startTime = new DateTime();
    }
    
    Duration getJourneyTime(){
        if (this.startTime != null && this.endTime != null) {
            return new Duration(this.startTime, this.endTime);
        }
        return null;
    }
    
    void updateJourneyDestination(Location destination){
        this.destination = destination;
    }
}

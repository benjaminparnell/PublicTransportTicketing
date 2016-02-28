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
    Stop start;
    Stop destination;
    DateTime startTime;
    DateTime endTime;
    Transport transport; //should probably be of type Transport
    
    Journey (Stop start, Stop destination, Transport transport) {
        this.start = start;
        this.destination = destination;
        this.transport = transport;
    }
    
    Journey (Stop start, Stop destination, DateTime startTime, DateTime endTime, Transport transport) {
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
    
    void updateJourneyDestination(Stop destination){
        this.destination = destination;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Date;

/**
 *
 * @author Swapnull
 */
public class Journey {
    int journeyID;
    String start; // should probably be of type Stop
    String destination; // should probably be of type Stop
    Date startTime;
    Date endTime;
    String Transport; //should probably be of type Transport
    
    Journey(){
        
    }
    
    void startJourney(){ 
        this.startTime = new Date();
    }
    
    void getJourneyTime(){
        //TODO: Figure out what this should do && return
    }
    
    void updateJourneyDestination(String destination){
        //TODO: Figure out what this should do && return
        this.destination = destination;
    }
}

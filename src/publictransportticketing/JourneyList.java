/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class JourneyList {
    Vector allJourneys;
    
    JourneyList(){
        
    }
    
    Journey findJourney(int journeyID){
        //TODO: Figure out what this should do && return
        return new Journey();
    }
    
    Journey findJourney(Date date){
        //TODO: Figure out what this should do && return
        return new Journey();

    }
    
    Journey getMostRecentJourney(){
        //TODO: Figure out what this should do && return
        return new Journey();

    }
    
    void addJourney(String start, String destination, Date startTime, Date endTime, String Transport){
        //TODO: Figure out what this should do && return
        //This is the same class as Account.createJourney();
    }
    
    Vector getTodaysJourneys(){
        //TODO: Figure out what this should do && return
        return new Vector();
    } 
    
}

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
public class Fare {
    String ticketName;
    Vector transport; //should probably be type TransportList;
    Vector zones; // should probably be type ZoneList
    int stopCount;
    float price;
    Date startTime;
    Date endTime;
    String tokenType; //should be of type TokenType, which does not exist on uml.
    
    Fare(){
        
    }
    
    boolean checkFare(JourneyList journeyList){
        //TODO: Figure out what this should return
        return false;
    }
}

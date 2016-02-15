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
public class BaseFareList {
    Vector<Fare> fareList;
    
    BaseFareList(){
        fareList = new Vector<Fare>();
    }
    
    Fare findFair(String fareID){
        Fare fare = null;
        for(int i = 0; i < this.fareList.size(); i++){
            fare = this.fareList.get(i);
            if(fare.fareID.equalsIgnoreCase(fareID)){
                return fare;
            }
        }
        return null; 
    }
    
    Vector<Fare> getValidFares(Journey journey){
        Fare fare = null;
        Vector<Fare> validFares = new Vector<Fare>();
        
        for(int i = 0; i < this.fareList.size(); i++){
            fare = this.fareList.get(i);
            if(fare.zones.checkIfExists(journey.start.zone) && fare.zones.checkIfExists(journey.start.zone)){
                // Start zone and Destination Zone both exist in the fares zone range
                validFares.add(fare);
            }
        }
        return validFares;
    }
    
    void addBaseFare(TransportList transport, ZoneList zones){
        fareList.add(new Fare("1", transport, zones));
    }
}

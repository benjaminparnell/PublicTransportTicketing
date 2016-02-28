/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class BaseFareList {
    public Vector<Fare> fareList;
    
   public  BaseFareList(){
        fareList = new Vector<Fare>();
    }
    
    public Fare findFair(String fareID){
        Fare fare;
        for(int i = 0; i < this.fareList.size(); i++){
            fare = this.fareList.get(i);
            if(fare.fareID.equalsIgnoreCase(fareID)){
                return fare;
            }
        }
        return null; 
    }
    
    public Vector<Fare> getValidFares(Journey journey){
        Fare fare;
        Vector<Fare> validFares = new Vector<Fare>();
        
        for(int i = 0; i < this.fareList.size(); i++){
            fare = this.fareList.get(i);
            if((fare.zones.findZone(journey.start.zone.zoneName) != null) && (fare.zones.findZone(journey.destination.zone.zoneName) != null)){
                // Start zone and Destination Zone both exist in the fares zone range
                validFares.add(fare);
            }
        }
        return validFares;
    }
    
    void addBaseFare(String id, TransportList transport, ZoneList zones){
        fareList.add(new Fare(id, transport, zones));
    }
}

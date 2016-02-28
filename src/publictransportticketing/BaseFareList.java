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
    
   /**
    * Trys to find a Fare in fareList that has the fareID of fareID.
    * @param fareID
    * @return Fare
    */
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
    
    /**
     * Turns the params into a Fare object and adds them to the internal fareList.
     * @param id
     * @param transport
     * @param zones 
     */
    void addBaseFare(String id, TransportList transport, ZoneList zones){
        fareList.add(new Fare(id, transport, zones));
    }
}

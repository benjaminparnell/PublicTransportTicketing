/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Arrays;
import java.util.Collections;
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
     * Pass through to java.util.Vector
     * @param id
     * @param transport
     * @param zones 
     * @return boolean
     */
    public boolean addBaseFare(Fare fare){
        return fareList.add(fare);
    }
    
    public Vector<Vector<Object>> getTableRows() {
        Vector<Vector<Object>> rows = new Vector<Vector<Object>>();
        
        for (Fare fare : this.fareList) {
            Vector<Object> row = new Vector<Object>();
            row.add(fare.fareID);
            row.add(fare.zones.zones.size());
            row.add(Integer.toString(fare.stopCount));
            row.add(Float.toString(fare.price));
            row.add(fare.startTime);
            row.add(fare.endTime);
            row.add(fare.tokenType);
            rows.add(row);
        }
        
        return rows;
    }
}

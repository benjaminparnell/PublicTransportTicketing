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
public class StopList {
    Vector<Stop> allStops;
    
    public StopList(){  
        this.allStops = new Vector<Stop>();
    }
    
    Stop findStop(String stopId){
        Stop stop;
        for(int i = 0; i < this.allStops.size(); i++){
            stop = this.allStops.get(i);
            if(stop.stopId.equalsIgnoreCase(stopId)){
                return stop;
            }
        }
        return null;
    }
    
    Vector<Stop> findStopByType(String type){
        Stop stop;
        Vector<Stop> stops = new Vector<Stop>();
        for(int i = 0; i < this.allStops.size(); i++){
            stop = this.allStops.get(i);
            if(stop.stopType.equalsIgnoreCase(type)){
                stops.add(stop);
            }
        }
        return stops;
   }
    
    
}

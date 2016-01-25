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
    }
    
    Stop findStop(String stopId){
        //TODO: Figure out what this should do and return
        Stop stop = null;
        for(int i = 0; i < allStops.size(); i++){
            stop = allStops.get(i);
            if(stop.stopId.equalsIgnoreCase(stopId)){
                break;
            }
        }
        return stop;
    }
    
    Vector<Stop> findStopByType(){
        //TODO: Figure out what this should do and return
        return allStops;
    }
    
    
}

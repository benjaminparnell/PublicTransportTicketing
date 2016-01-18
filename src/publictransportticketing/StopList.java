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
public class StopList extends Vector {
    StopList allStops;
    
    Stop findStop(){
        //TODO: Figure out what this should do and return
        return new Stop("1", "stop", new Location((float) 1.1676, (float) 2.2), "stop type",new Zone("zone"));
    }
    
    StopList findStopByType(){
        //TODO: Figure out what this should do and return
        return this.allStops;
    }
    
    
}

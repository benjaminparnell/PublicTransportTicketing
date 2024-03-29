/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

/**
 *
 * @author Swapnull
 */
public class Route {
    String routeID;
    String routeType;
    Location routeDestination;
    Location finalDestination;
    StopList stopsOnRoute;
    
    public Route(String routeID, String routeType, Location routeDestination, Location finalDestination, StopList stopsOnRoute){
        this.routeID = routeID;
        this.routeType = routeType;
        this.routeDestination = routeDestination;
        this.finalDestination = finalDestination;
        this.stopsOnRoute = stopsOnRoute;
    }
    
    Stop getLastStop(){
        return this.stopsOnRoute.allStops.get((stopsOnRoute.allStops.size() - 1));
    }
}

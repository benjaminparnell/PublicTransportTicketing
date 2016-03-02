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
    
    /**
     * Creates a route.
     * @param routeID
     * @param routeType
     * @param routeDestination
     * @param finalDestination
     * @param stopsOnRoute 
     */
    public Route(String routeID, String routeType, Location routeDestination, Location finalDestination, StopList stopsOnRoute){
        this.routeID = routeID;
        this.routeType = routeType;
        this.routeDestination = routeDestination;
        this.finalDestination = finalDestination;
        this.stopsOnRoute = stopsOnRoute;
    }
    
    /**
     * Returns the last stop of the route.
     * @return 
     */
    Stop getLastStop(){
        return this.stopsOnRoute.allStops.get((stopsOnRoute.allStops.size() - 1));
    }
}

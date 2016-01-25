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
public class RouteList{
    Vector<Route> routeList;
    
    Route findRoute(int routeID){
        Route route = null;
        
        for(int i = 0; i < routeList.size(); i++){
            route = routeList.get(i);
            if(route.routeID == routeID){
                break;
            }
        }
        return route;
    }
}

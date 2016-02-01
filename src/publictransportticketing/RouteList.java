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
    
    RouteList(){
        this.routeList = new Vector<Route>();
    }
    
    Route findRoute(String routeID){
        Route route = null;
        
        for(int i = 0; i < this.routeList.size(); i++){
            route = this.routeList.get(i);
            if(route.routeID.equalsIgnoreCase(routeID)){
                return route;
            }
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class BaseFareList extends Vector {
    BaseFareList fareList;
    
    Fare findFair(String fareName){
        //TODO: Figure out what this should do and return
        return new Fare();
    }
    
    Fare findFair(Fare fare){
        //TODO: Figure out what this should do and return
        return new Fare();
    }
    
    Fare getValidFare(Journey journey){
        //TODO: Figure out what this should do and return
        return new Fare();
    }
    
    void addBaseFare(Transport transport, int numberOfStops, Date time, ZoneList zones, String tokenType){
        //TODO: Figure out what this should do and return
    }
}

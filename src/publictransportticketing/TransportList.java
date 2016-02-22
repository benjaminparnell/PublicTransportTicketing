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
public class TransportList {
    Vector<TransportType> transportType;
    
    Transport findTransport(String name){
        //TODO: Figure out what this should do and return
        return new Transport("test", new TransportType("bus"));
    }
    
    Transport findTransportByID(String ID){
        //TODO: Figure out what this should do and return
        return new Transport("test", new TransportType("train"));
    }
}

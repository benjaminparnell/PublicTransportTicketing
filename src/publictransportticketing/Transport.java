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
public class Transport {
    String transportID;
    TransportType typeName;
    
    /**
     * Creates a new instance of Transport.
     * @param transportID
     * @param typeName 
     */
    Transport(String transportID, TransportType typeName){
        this.transportID = transportID;
        this.typeName = typeName;
    }
}

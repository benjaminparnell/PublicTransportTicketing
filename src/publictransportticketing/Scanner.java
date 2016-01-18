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
public class Scanner {
    int scannerID;
    Location location;
    Route currentRoute;
    String scannerType;
    
    void scanToken(){
    //TODO: Figure out what this should do and return    
    }
    
    void getJourneyStart(){
        //TODO: Figure out what this should do and return
    }
    
    void getJourneyDestination(){
        //TODO: Figure out what this should do and return
    }
    
    void getTimestamp(){
        //TODO: Figure out what this should do and return
    }
    
    Location getScannerLocation(){
        return this.location;
    }
    
    Route getRoute(){
        return this.currentRoute;
    }
    
}

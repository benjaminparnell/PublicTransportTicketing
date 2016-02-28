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
    String scannerID;
    Location location;
    // Route currentRoute; Information stored on the token, no need for it here
    String scannerType; // should contain "static" or "portable". 
    Token token; //added this otherwise the class is pointless
    
    Scanner(String scannerID, Location location, String scannerType){
        this.scannerID = scannerID;
        this.location = location;
        this.scannerType = scannerType;
    }
    
    void scanToken(Token token){
        this.token = token;
    }
    
    /*
    None of these should be here. They are all details which are stored on the token. 
    
    void getJourneyStart(){
        //TODO: Figure out what this should do and return
    }
    
    void getJourneyDestination(){
        //TODO: Figure out what this should do and return
    }
    
    void getTimestamp(){
        //TODO: Figure out what this should do and return
    }*/ 
    
    Location getScannerLocation(){
        return this.location;
    }
    
    /*
    Route getRoute(){
        return this.currentRoute;
    }*/
    
}

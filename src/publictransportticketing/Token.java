/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import org.joda.time.DateTime;

/**
 *
 * @author Swapnull
 */
public class Token {
    String tokenID; // added as there was no identifier yet it is used in TokenList.
    String tokenType; // should be of type TokenType;
    Fare currentFare;
    String accountID;
    DateTime currentTokenStartTime;
    DateTime currentTokenExpiryTime;
    boolean isValid;
    Journey currentJourney;
    
    Token(String tokenID, String tokenType, String accountID){
        this.tokenID = tokenID;
        this.tokenType = tokenType;
        this.accountID = accountID;
        this.isValid = false;
    }
    
    void getTokenDetails(){
        //TODO: Figure out what this should return
    }
    
    String getAccountID(){
        return this.accountID;
    }
    
    boolean getValid(){
        return this.isValid;
    }
    
    Journey getCurrentJourney(){
        return this.currentJourney;
    }
    
    Fare getCurrentFare(){
        return this.currentFare;
    }
    
    void setCurrentJourney(Journey journey){
        this.currentJourney = journey;
    }
    
}

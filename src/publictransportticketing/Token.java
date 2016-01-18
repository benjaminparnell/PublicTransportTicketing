/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Date;

/**
 *
 * @author Swapnull
 */
public class Token {
    int tokenID; // added as there was no identifier yet it is used in TokenList.
    String tokenType; // should be of type TokenType;
    Fare currentFare;
    int accountID;
    Date currentTokenStartTime;
    Date currentTokenExpieryTime;
    boolean isValid;
    Journey currentJourney;
    
    Token(){
        
    }
    
    void getTokenDetails(){
        //TODO: Figure out what this should return
    }
    
    int getAccountID(){
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

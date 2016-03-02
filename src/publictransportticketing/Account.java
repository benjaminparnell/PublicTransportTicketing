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
public class Account {
    String accountID;
    String accountName;
    String profileName;
    String occupation;
    float currentBalance;
    String accountActivationDate;
    String accountDeactivationDate;
    String address;
    DateTime DOB;
    User person;
    JourneyList journeyList;
    TokenList tokenList;
    
    Account(){
        this.currentBalance = 0.0f;
        this.journeyList = new JourneyList();
        this.tokenList = new TokenList();
    }
    
    /**
     * Returns the account balance.
     * @return float
     */
    float getCurrentBalance(){
        return this.currentBalance;
    }
    
    /**
     * Checks for the validity of the token.
     * @param token
     * @return 
     */
    boolean validateToken(Token token){
        return tokenList.isValid(token);
    }
    
    void updateToken(){
        //TODO: Figure out what this should do && return
    }
    
    /**
     * Checks if there is enough balance in the account.
     * @param price
     * @return float
     */
    float checkBalance(float price){
        return (this.currentBalance - price);
    }
    
    /**
     * Update the current balance.
     * @param amount 
     */
    void updateBalance(float amount) {
        this.currentBalance += amount;
    }
    
    /**
     * Create a journey and add it to the account's journey list.
     * @param start
     * @param destination
     * @param startTime
     * @param endTime
     * @param transport
     * @return journey
     */
    Journey createJourney(Stop start, Stop destination, DateTime startTime, DateTime endTime, Transport transport){
        Journey journey = new Journey(start, destination, startTime, endTime, transport);
        
        this.journeyList.addJourney(journey);
        return journey;
    }
    
}

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
public class Account {
    String accountID;
    String accountName;
    String profileName;
    String occupation;
    float currentBalance;
    String accountActivationDate;
    String accountDeactivationDate;
    String address;
    Date DOB;
    User person;
    JourneyList journeyList;
    TokenList tokenList;
    
    Account(){
        this.currentBalance = 0.0f;
        this.journeyList = new JourneyList();
    }
    
    void getAccount(int accountID){
        //TODO: Figure out what this should return
    }
    
    float getCurrentBalance(){
        return Math.round(this.currentBalance * 100) /100;
    }
    
    boolean validateToken(Token token){
        return tokenList.isValid(token);
    }
    
    void updateToken(){
        //TODO: Figure out what this should do && return
    }
    
    float checkBalance(float price){
        return Math.round((this.currentBalance - price) * 100) / 100;
    }
    
    Journey createJourney(String start, String destination, Date startTime, Date endTime, String Transport){
        //TODO: Figure out what this should do && return
        //Not sure if start, destination and transport should be types, they do not seem to link on UML.
        return new Journey();
    }
    
}

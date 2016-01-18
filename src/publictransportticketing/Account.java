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
    int accountID;
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
    
    Account(){
        //not actually in design but probably needed 
    }
    
    void getAccount(int accountID){
        //TODO: Figure out what this should return
    }
    
    float getCurrentBalance(){
        return Math.round(this.currentBalance * 100) /100;
    }
    
    void validateToken(Token token){
        //TODO: Figure out what this should do && return
    }
    
    void updateToken(){
        //TODO: Figure out what this should do && return
    }
    
    float checkBalance(int price){
        return Math.round((this.currentBalance - price) * 100) / 100;
    }
    
    Journey createJourney(String start, String destination, Date startTime, Date endTime, String Transport){
        //TODO: Figure out what this should do && return
        //Not sure if start, destination and transport should be types, they do not seem to link on UML.
        return new Journey();
    }
    
}

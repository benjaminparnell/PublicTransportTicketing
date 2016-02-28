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
public class Server {
    UserInterface userInterface;
    RouteList allRoutes;
    AccountList allAccounts;
    
    Server() {
        allRoutes = new RouteList();
        allAccounts = new AccountList();
    }
    
    void validateDetails(){
        
    }
    
    User getUser(String userID, String password){
        //TODO: Figure out what this should do and return
        return new User("100", "Martyn Rushton", "Personal");
    }
    
    Account getUserAccountDetails(){
      //TODO: Figure out what this should do and return
      return new Account();  
    }
    
    void calculateJourney(Token token, String start, String destination, Transport transport, Scanner scanner){
        //TODO: Figure out what this should do and return
    }
    
    void validateToken(Account account, Token token){
        //TODO: Figure out what this should do and return
    }
    
    Account findAccount(String accountId) {
        return this.allAccounts.findAccount(accountId);
    }
}

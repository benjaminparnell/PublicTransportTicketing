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
public class User {
    String userID;
    String name;
    String userType; //not sure if this should be a type?
       
    User(String name, String userType){
        // not in design but added because probably needed
        this.name = name;
        this.userType = userType;
    }
    
    void validateUser(String userID){
        //TODO: Figure out what this should do && return
    }
}

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
    String password;
       
    User(String userID, String name, String userType, String password){
        this.userID = userID;
        this.name = name;
        this.userType = userType;
        this.password = password;
    }
    
    public Boolean validateLogin(String password){
        return this.password.equals(password);
    }
}

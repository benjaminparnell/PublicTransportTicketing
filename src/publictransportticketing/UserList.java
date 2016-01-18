/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author Swapnull
 */
public class UserList extends Vector {
    //changed to extend vector instead of having Vector users;
    
    UserList users; 
    
    UserList(){
        
    }
    
    User findUser(String userID){
        //TODO: Figure out what this should return
        return new User("Martyn Rushton", "Personal");
    }
    
    UserList findUserByName(String name){
        //returning UserList due to possibility of multiple users.
        //TODO: Figure out what this should return
        return this.users;
    }
    
    UserList findUserByType(String type){
        //returning UserList due to possibility of multiple users
        //TODO: Figure out what this should return.
        return this.users;
    }
    
    
    
}

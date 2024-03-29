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
public class UserList {
    //changed to extend vector instead of having Vector users;
    
    public Vector<User> users; 
    
    public UserList(Vector<User> users) {
        this.users = users;
    }
    
    public UserList(){
       this.users = new Vector<User>();
    }
    
    public User findUser(String userID){
        User user;
        for(int i = 0; i < this.users.size(); i++){
            user = this.users.get(i);
            if(user.userID.equalsIgnoreCase(userID)){
                return user;
            }
        }
        return null; 
    }
    
    public Vector<User> findUserByName(String name){
        User user;
        Vector<User> l_users = new Vector<User>();
        
        for(int i = 0; i < this.users.size(); i++){
            user = this.users.get(i);
            if(user.name.toLowerCase().contains(name.toLowerCase())){
                l_users.add(user);
            }
        }
        
        return l_users;
    }
    
    public Vector<User> findUserByType(String type){
        Vector<User> l_users = new Vector<User>();
        User user;
        
        for(int i = 0; i < this.users.size(); i++){
            user = this.users.get(i);
            if(user.userType.toLowerCase().contains(type.toLowerCase())){
                l_users.add(user);
            }
        }
        
        return l_users;
    }
    
    
    
}

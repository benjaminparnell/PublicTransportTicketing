package publictransportticketing;

/**
 *
 * @author Swapnull
 */
public class Server {
    UserInterface userInterface;
    RouteList allRoutes;
    public UserList users;
    
    public Server (UserList users) {
        this.users = users;
    }
    
    void validateDetails(){
        
    }
    
    User getUser(String userID, String password) throws UserNotFoundException, WrongPasswordException {
        User user = this.users.findUser(userID);
        
        if (user == null) {
            throw new UserNotFoundException("No user could be found with that id.");
        }
        
        if (user.validateLogin(password) == false) {
            throw new WrongPasswordException("Looks like that password was incorrect. Please try again.");
        }
        
        return user;
    }
    
    Account getUserAccountDetails(){
      //TODO: Figure out what this should do and return
      return new Account();  
    }
    
    public RouteList getAllRoutes() {
        return this.allRoutes;
    }
    
    void calculateJourney(Token token, String start, String destination, Transport transport, Scanner scanner){
        //TODO: Figure out what this should do and return
    }
    
    void validateToken(Account account, Token token){
        //TODO: Figure out what this should do and return
    }
    
}

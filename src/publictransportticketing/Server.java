package publictransportticketing;

/**
 *
 * @author Swapnull
 */
public class Server {
    public UserInterface userInterface;
    public RouteList allRoutes;
    public BaseFareList ListOfFares;
    public UserList users;
    public AccountList allAccounts;
    
    public Server (UserList users) {
        this.users = users;
        this.ListOfFares = new BaseFareList();
        this.allRoutes = new RouteList();
        this.allAccounts = new AccountList();
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
    
    Boolean validateToken(Account account, Token token){
        return account.validateToken(token);
    }
    
    Account findAccount(String accountId) {
        return this.allAccounts.findAccount(accountId);
    }
}

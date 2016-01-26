/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Swapnull
 */
public class UserListTest {
    
    public UserListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findUser method, of class UserList.
     */
    @Test
    public void testFindUser() {
        System.out.println("findUser");
        String userID = "100";
        UserList instance = new UserList();
        User expResult = new User("100", "Martyn Rushton", "Personal");
        instance.users.add(expResult);
        
        //run
        User result = instance.findUser(userID);
        assertEquals(expResult, result);

    }

    /**
     * Test of findUserByName method, of class UserList.
     */
    @Test
    public void testFindUserByName() {
        System.out.println("findUserByName");
        String name = "david";
        UserList instance = new UserList();
        Vector<User> expResult = new Vector<User>();
        
        //create users
        User user1 = new User("100", "David Smith", "Personal");
        User user2 = new User("200", "John Smith", "Business");
        User user3 = new User("300", "John Davidson", "Student");
        
        //add to instance
        instance.users.add(user1);
        instance.users.add(user2);
        instance.users.add(user3);
                
        //add to expResult
        expResult.add(user1);
        expResult.add(user3);
        
        // run test
        Vector<User> result = instance.findUserByName(name);
        assertEquals(expResult, result);

    }

    /**
     * Test of findUserByType method, of class UserList.
     */
    @Test
    public void testFindUserByType() {
        

        System.out.println("findUserByType");
        String type = "Personal";
        UserList instance = new UserList();
        Vector<User> expResult = new Vector<User>();
        
        //create users
        User user1 = new User("100", "David Smith", "Personal");
        User user2 = new User("200", "John Smith", "Business");
        User user3 = new User("300", "John Davidson", "Student");
        User user4 = new User("400", "Mark Jacobson", "Personal");

        
        //add to instance
        instance.users.add(user1);
        instance.users.add(user2);
        instance.users.add(user3);
        instance.users.add(user4);
                
        //add to expResult
        expResult.add(user1);
        expResult.add(user4);
        
        Vector<User> result = instance.findUserByType(type);
        assertEquals(expResult, result);

    }
    
}

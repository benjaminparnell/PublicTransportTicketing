/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rowellheria
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAccount method, of class Account.
     */
//    @Test
//    public void testGetAccount() {
//        System.out.println("getAccount");
//        int accountID = 0;
//        Account instance = new Account();
//        instance.getAccount(accountID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getCurrentBalance method, of class Account.
     */
    @Test
    public void testGetCurrentBalance() {
        System.out.println("getCurrentBalance");
        
        Account instance = new Account();
        instance.currentBalance = 20.0f;
        
        float expResult = 20.0F;
        float result = instance.getCurrentBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of validateToken method, of class Account.
     */
    @Test
    public void testValidateToken() {
        System.out.println("validateToken");
        
        Token token = new Token("token_id_test", "bus", "abcd123");
        token.isValid = true;
        
        Token tokenInValid = new Token("token_id_test_inv", "bus", "abcd123");
        tokenInValid.isValid = false;
        
        TokenList tokenList = new TokenList();
        tokenList.addToken(token);
        tokenList.addToken(tokenInValid);
        
        Account instance = new Account();
        instance.tokenList = tokenList;
        
        boolean expResult = true;
        boolean result = instance.validateToken(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateToken method, of class Account.
     */
//    @Test
//    public void testUpdateToken() {
//        System.out.println("updateToken");
//        Account instance = new Account();
//        instance.updateToken();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of checkBalance method, of class Account.
     */
    @Test
    public void testCheckBalance() {
        System.out.println("checkBalance");
        float price = 0.0f;
        
        Account instance = new Account();
        
        float expResult = 0.0F;
        float result = instance.checkBalance(price);
        assertEquals(expResult, result, 0.0);
    }
    
}

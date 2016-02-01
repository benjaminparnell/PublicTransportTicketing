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
public class TokenListTest {
    
    public TokenListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of findToken method, of class TokenList.
     */
    @Test
    public void testFindToken() {
        System.out.println("findToken");
        String tokenID = "sample_id";
        TokenList instance = new TokenList();
        
        Token expResult = new Token();
        expResult.tokenID = tokenID;
        
        instance.addToken(expResult);
        
        Token result = instance.findToken(tokenID);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValid method, of class TokenList.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String tokenID = "sample_id";
        TokenList instance = new TokenList();
        
        Token token = new Token();
        token.tokenID = tokenID;
        token.isValid = true;
        
        instance.addToken(token);
        
        boolean expResult = true;
        boolean result = instance.isValid(token);
        assertEquals(expResult, result);
    }

    /**
     * Test of addToken method, of class TokenList.
     */
    @Test
    public void testAddToken() {
        System.out.println("addToken");
        String tokenID = "sample_id";
        TokenList instance = new TokenList();
        
        Token expResult = new Token();
        expResult.tokenID = tokenID;
        expResult.isValid = true;
        
        instance.addToken(expResult);
        
        Token result = instance.findToken(tokenID);
        assertEquals(expResult, result);
    }
    
}

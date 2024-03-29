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
public class TokenList {
    //extended vector instead of having 'tokens' as a vector.
    Vector<Token> tokens;
    int tokenID;
    
    public TokenList () {
        this.tokens = new Vector<Token>();
    }
    
    Token findToken(String tokenID){
        for (Token tokenCheck : tokens) {
            if (tokenCheck.tokenID.equals(tokenID)) {
                return tokenCheck;
            }
        }
        
        return null;
    }
    
    boolean isValid(Token token){
        boolean validity = false;
        
        for (Token tokenCheck : tokens) {
            if (tokenCheck.tokenID.equals(token.tokenID)) {
                validity = tokenCheck.getValid();
            }
        }
        
        return validity;
    }
    
    void addToken(Token token) {
        this.tokens.add(token);
    }
}

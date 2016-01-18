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
public class TokenList extends Vector {
    //extended vector instead of having 'tokens' as a vector.
    TokenList tokens;
    int tokenID;
    
    Token findToken(int tokenID){
        //TODO: Figure out what this should return
        return new Token(); 
    }
    
    boolean isValid(Token token){
        return token.getValid();
    }
    
    
}

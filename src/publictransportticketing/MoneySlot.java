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
public class MoneySlot {
    float amount;
    
    MoneySlot() {
        amount = 0.0f;
    }
    
    void readInAmount(float inserted){
        amount += inserted;
    }
    
    float checkAmount(){
        return this.amount;
    }
    
    float dispenseChange(){
        return this.amount;
    }
}

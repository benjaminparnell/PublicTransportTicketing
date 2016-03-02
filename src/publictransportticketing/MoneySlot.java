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
        this.amount = 0.0f;
    }
    
    /**
     * 
     * @param inserted 
     */
    void readInAmount(float inserted){
        this.amount += inserted;
    }
    
    /**
     * Returns the current amount accumulated by the slot.
     * @return 
     */
    float checkAmount(){
        return this.amount;
    }
    
    /**
     * Dispenses change and resets the amount to zero.
     */
    void dispenseChange(){
        this.amount = 0.0f;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketing;

import java.util.Vector;

/**
 *
 * @author rowellheria
 */
public class AccountList {
    private Vector<Account> accountList;
    
    public AccountList() {
        this.accountList = new Vector<Account>();
    }
    
    Account findAccount(String accountId) {
        for (Account accountSearch : this.accountList) {
            if (accountSearch.accountID.equalsIgnoreCase(accountId)) {
                return accountSearch;
            }
        }
        return null;
    }
    
    public void addAccount(Account account) {
        this.accountList.add(account);
    }
}

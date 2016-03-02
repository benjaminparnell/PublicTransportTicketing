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
public class CompanyList {
    Vector<Company> companies;
    
    public CompanyList(){
        this.companies = new Vector<Company>(); 
    }
    
    /**
     * Finds a company by it's name.
     * @param companyName
     * @return company || null
     */
    Company findCompany(String companyName){
        for (Company company : this.companies) {
            if(company.companyName.equalsIgnoreCase(companyName)){
                return company;
            }
        }
        
        return null;
    }
}

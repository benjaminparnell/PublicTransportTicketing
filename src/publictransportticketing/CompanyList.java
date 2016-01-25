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
    
    Company findCompany(String companyName){
        Company company = null;
        for(int i=0; i < companies.size(); i++){
            company = companies.get(i);
            if(company.companyName.equalsIgnoreCase(companyName)){
                break;
            }
        }
        return company;
    }
}

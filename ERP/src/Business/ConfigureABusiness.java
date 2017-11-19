/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Role.AdminRole;

import Business.UserAccount.UserAccount;

/**
 *
 * @author krunal
 */
public class ConfigureABusiness {
    
    public static EcoSystem Configure(){
        
        EcoSystem ecosystem = new EcoSystem();
        
        Network usa = ecosystem.createAndAddNetwork(); 
        usa.setName("United States of America");
        Enterprise neu = usa.getEnterpriseDirectory().createAndAddEnterprise("Northeastern University", Enterprise.EnterpriseType.University);
        
        
        
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount("admin", "123", employee, new AdminRole());
        
        return ecosystem; 
    }
    
    
    
    
    
    
}

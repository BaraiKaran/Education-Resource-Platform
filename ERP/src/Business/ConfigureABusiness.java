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
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.CollegeAdminRole;
import Business.Role.SystemAdminRole;

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
        
        Organization neucoe = neu.getOrganizationDirectory().createOrganization(Organization.Type.College, "College of Engineering");
        Organization neuccis = neu.getOrganizationDirectory().createOrganization(Organization.Type.College, "College of Computer Science");
        Employee emp1 = neucoe.getEmployeeDirectory().createEmployee("COEEMP1");
        Employee emp2 = neuccis.getEmployeeDirectory().createEmployee("CCISEMP1");
        
        Employee emp3 = neucoe.getEmployeeDirectory().createEmployee("CollgeAdmin");
        UserAccount ua1 = neucoe.getUserAccountDirectory().createUserAccount("ca", "ca", emp3, new CollegeAdminRole());
        
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount("admin", "123", employee, new SystemAdminRole());
        
        
        Employee neuemp = neu.getEmployeeDirectory().createEmployee("NEU Admin");
        UserAccount neuua = neu.getUserAccountDirectory().createUserAccount("a", "a", neuemp, new AdminRole());
        
        return ecosystem; 
    }
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakas
 */
public class CollegeOrganization extends Organization{
    
    public CollegeOrganization(){
        super(Organization.Type.College.getValue());
    }

@Override
public ArrayList<Role> getSupportedRole(){
    ArrayList<Role> roles = new ArrayList<>();
    return roles;
}

}

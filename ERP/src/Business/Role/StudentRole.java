/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.StudentRole.StudentWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aakas
 */
public class StudentRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new StudentWorkAreaJPanel(userProcessContainer, organization, account);
    }


    @Override
    public String toString() {
        return "Student";
    }

}

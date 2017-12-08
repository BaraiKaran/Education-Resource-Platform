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
import Interface.TARole.TAWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aakas
 */
public class TARole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new TAWorkAreaJPanel(userProcessContainer, organization, account);
    }

    @Override
    public String toString() {
        return "Teaching Assistant";
    }

    private Boolean taHours;
    private String startTime;
    private String endTime;
    private String date;
    private long timeDuration;

    public long getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(long timeDuration) {
        this.timeDuration = timeDuration;
    }

    public Boolean getTaHours() {
        return taHours;
    }

    public void setTaHours(Boolean taHours) {
        this.taHours = taHours;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}

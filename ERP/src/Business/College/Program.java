/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.College;

import Business.Employee.Employee;
import Business.Role.StudentRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author krunal
 */
public class Program {
 
    private String name;
    private int id;
    private static int count = 1;
    private ArrayList<UserAccount> students;
    
    
    
    public Program(String name){
        this.name = name;
        this.id = count;
        students = new ArrayList<UserAccount>();
        count++;
    }
    
    public Boolean subscribeProgram(UserAccount ua){
        for(UserAccount u : students){
            if(u.getId() == ua.getId())
                return false;
        }
        students.add(ua);
        return true;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

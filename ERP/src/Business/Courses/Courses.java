/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Courses;

import Business.College.Program;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class Courses {

    private String crnNumber;
    private String courseName;
    private Program program;
    private int totalSeats;
    private String approvalStatus;
    private UserAccount professor;
    private ArrayList<UserAccount> students;
    private ArrayList<UserAccount> teachingAssistant;

    public Courses(String crn, String name, String status, int seats) {
        this.courseName = name;
        this.crnNumber = crn;
        this.approvalStatus = status;
        this.totalSeats = seats;
        students = new ArrayList<UserAccount>();
        teachingAssistant = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<UserAccount> students) {
        this.students = students;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public UserAccount getProfessor() {
        return professor;
    }

    public void setProfessor(UserAccount professor) {
        this.professor = professor;
    }

    public String getCrnNumber() {
        return crnNumber;
    }

    public Program getProgram() {
        return program;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public void setCrnNumber(String crnNumber) {
        this.crnNumber = crnNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return this.courseName;
    }

    public Boolean RegisterCourse(UserAccount ua) {
        for (UserAccount u : students) {
            if (u.getId() == ua.getId()) {
                return false;
            }
        }
        students.add(ua);
        return true;
    }

    public Boolean AssignTA(UserAccount ua) {
        for (UserAccount u : teachingAssistant) {
            if (u.getId() == ua.getId()) {
                return false;
            }
        }
        teachingAssistant.add(ua);
        return true;
    }

}

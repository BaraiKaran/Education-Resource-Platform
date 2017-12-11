/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Marks;

import Business.Assignment.Assignment;
import Business.Courses.Courses;
import Business.UserAccount.UserAccount;

/**
 *
 * @author karan
 */
public class Marks {

    private int marks;
    private Assignment assignment;
    private UserAccount Student;
    private Courses course;
    private UserAccount TA;

    public UserAccount getStudent() {
        return Student;
    }

    public void setStudent(UserAccount Student) {
        this.Student = Student;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public UserAccount getTA() {
        return TA;
    }

    public void setTA(UserAccount TA) {
        this.TA = TA;
    }

    
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

}

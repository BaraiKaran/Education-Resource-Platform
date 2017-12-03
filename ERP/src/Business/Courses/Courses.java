/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Courses;

import Business.College.Program;

/**
 *
 * @author karan
 */
public class Courses {

    private String crnNumber;
    private String courseName;
    private Program program;

    public Courses(String crn, String name) {
        this.courseName = name;
        this.crnNumber = crn;
    }

    public String getCrnNumber() {
        return crnNumber;
    }

    public Program getProgram() {
        return program;
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

}

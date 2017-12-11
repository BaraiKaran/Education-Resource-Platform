/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Assignment;

import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class AssignmentDirectory {

    private ArrayList<Assignment> assignmentDirectory;

    public AssignmentDirectory() {
        assignmentDirectory = new ArrayList<>();
    }

    public ArrayList<Assignment> getAssignmentDirectory() {
        return assignmentDirectory;
    }

    public void setAssignmentDirectory(ArrayList<Assignment> assignmentDirectory) {
        this.assignmentDirectory = assignmentDirectory;
    }

    public void removeCourse(Assignment a) {
        assignmentDirectory.remove(a);
    }

    public ArrayList<Assignment> getCourseList() {
        return assignmentDirectory;
    }

    public ArrayList<Assignment> getAssignmentList() {
        return assignmentDirectory;
    }
}

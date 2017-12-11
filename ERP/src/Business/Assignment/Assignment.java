/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Assignment;

import Business.Feeds.FeedsDirectory;

/**
 *
 * @author karan
 */
public class Assignment {

    private int assignmentId;
    private String problemStatement;
    private FeedsDirectory feeds;
    private static int count = 1;

    public Assignment() {
        feeds = new FeedsDirectory();
        assignmentId = count;
        count++;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getProblemStatement() {
        return problemStatement;
    }

    public void setProblemStatement(String problemStatement) {
        this.problemStatement = problemStatement;
    }

}

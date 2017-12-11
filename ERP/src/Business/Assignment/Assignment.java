/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Assignment;

import Business.Feeds.FeedsDirectory;
import Business.TimeSlots.TimeSlotsDirectory;

/**
 *
 * @author karan
 */
public class Assignment {

    private int assignmentId;
    private String title;
    private String problemStatement;
    private FeedsDirectory feeds;
    private static int count = 1;
    private TimeSlotsDirectory slots;
    
    
    public Assignment(String name , String problem) {
        feeds = new FeedsDirectory();
        assignmentId = count;
        title = name;
        problemStatement = problem;
         slots = new TimeSlotsDirectory();
         
        count++;
    }

     public TimeSlotsDirectory getSlots() {
        return slots;
    }

    public void setSlots(TimeSlotsDirectory slots) {
        this.slots = slots;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FeedsDirectory getFeeds() {
        return feeds;
    }

    public void setFeeds(FeedsDirectory feeds) {
        this.feeds = feeds;
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
    
    @Override
    public String toString(){
        return this.title;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Marks;

import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class MarksDirectory {

    private ArrayList<Marks> marks;

    public ArrayList<Marks> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Marks> marks) {
        this.marks = marks;
    }

    public MarksDirectory() {
        marks = new ArrayList<>();
    }

    public ArrayList<Marks> getMarksList() {
        return marks;
    }

}

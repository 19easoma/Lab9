/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem2;

/**
 *
 * @author antho
 */
public class UndergraduateStudent extends Student {
    private int year;

    public UndergraduateStudent(int year, String StudentID, String firstName, String lastName) {
        super(StudentID, firstName, lastName);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}

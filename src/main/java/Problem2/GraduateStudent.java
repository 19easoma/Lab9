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
public class GraduateStudent extends Student {
    private String type;

    public GraduateStudent(String type, String StudentID, String firstName, String lastName) {
        super(StudentID, firstName, lastName);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}

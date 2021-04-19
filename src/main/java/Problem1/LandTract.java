/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/**
 *
 * @author antho
 */
public class LandTract {
    private double length;
    private double width;
    
    public LandTract(double len, double wid) {
        this.length = len; 
        this.width = wid;
    }
    
    public LandTract(LandTract landTract) {
        this.length = landTract.getLength();
        this.width = landTract.getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "LandTract{" + "length=" + length + ", width=" + width + '}';
    }
    
    public boolean equals(LandTract obj) {
        if (this.length == obj.getLength() && this.width == obj.getWidth()) {
            return true;
        } else {
            return false;
        }
    }
}

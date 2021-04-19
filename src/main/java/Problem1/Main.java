/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

import java.util.Scanner;

/**
 *
 * @author antho
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the length for the first tract of land:");
        double tract1Length = keyboard.nextInt();
        
        System.out.println("Enter the width for the first tract of land:");
        double tract1Width = keyboard.nextInt();
        
        System.out.println("Enter the length for the second tract of land:");
        double tract2Length = keyboard.nextInt();
        
        System.out.println("Enter the width for the second tract of land:");
        double tract2Width = keyboard.nextInt();
        
        LandTract landTract1 = new LandTract(tract1Length, tract1Width);
        LandTract landTract2 = new LandTract(tract2Length, tract2Width);
        
        System.out.println("The area for the first tract is " + landTract1.getArea());
        System.out.println("The area for the second tract is " + landTract2.getArea());
        
        if (landTract1.equals(landTract2)) {
            System.out.println("The two land tracts are equal");
        } else {
            System.out.println("The two land tracts are not equal");
        }
    }
}

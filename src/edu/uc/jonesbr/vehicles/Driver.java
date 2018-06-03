/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uc.jonesbr.vehicles;

import javax.swing.JOptionPane;

/**
 * This represents a driver of a vehicle.
 * @author ucint
 */
public class Driver {
    
    public final static String PLANT_PLACES_DOMAIN_NAME = "http://www.plantplaces.com";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        promptUser();
    }
    
    /**
     * Prompt the user for information about trips and MPG
     */
    public static void promptUser() {
        String milesPerGallon = JOptionPane.showInputDialog("How many miles per gallon does the vehicle get?");
        int mpg = Integer.parseInt(milesPerGallon);
        double gallonsOfGas = 10;

        String journey = JOptionPane.showInputDialog("How far do you want to go?");
        int distance = Integer.parseInt(journey);
        
        double gallonsConsumed = distance / mpg;
        gallonsOfGas = gallonsOfGas - gallonsConsumed;
        if (gallonsOfGas >= 0) { 
            System.out.println("Gas Consumed: " + gallonsConsumed + " Gallons remaining: " + gallonsOfGas);
        } else {
            System.out.println("You ran out of gas!  You should start walking to a gas station.");
        }
    }
    
    
}

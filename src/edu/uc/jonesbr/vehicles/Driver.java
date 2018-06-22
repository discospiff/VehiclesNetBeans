/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uc.jonesbr.vehicles;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * This represents a driver of a vehicle.
 * @author ucint
 */
public class Driver {

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
        
        // create a variable of type Vehicle.
        Vehicle myVehicle = new Vehicle();
        // create an object of type Vehicle.  This object is different from myVehicle, and will have its own independent values.
        Vehicle yourVehicle = new Vehicle();
        
        // initialize the values of yourVehicle
        yourVehicle.setGallonsOfGas(8);
        yourVehicle.setMilesPerGallon(20);
        yourVehicle.setOdometer(30000);
        // print the current state of the vehicle
        System.out.println("My Vehicle:");
        System.out.println(myVehicle.toString());
        
        System.out.println("Your Vehicle:");
        System.out.println(yourVehicle.toString());

        // prompt user
        String strGallonsOfGas = JOptionPane.showInputDialog("Enter gallons of gas");
        
        // convert the String return to a double.
        double dblGallonsOfGas = Double.parseDouble(strGallonsOfGas);
        
        myVehicle.setGallonsOfGas(dblGallonsOfGas);
        
        final int intMilesPerGallon = promptForInteger("Enter miles per gallon", 0, 100);
        
        myVehicle.setMilesPerGallon(intMilesPerGallon);
        
        int intOdometer = promptForInteger("Enter odometer", 0, 1000000);
        
        myVehicle.setOdometer(intOdometer);
        
        final String strDistanceTravelled = JOptionPane.showInputDialog("Enter distance to travel");
        final int intDistance = Integer.parseInt(strDistanceTravelled);

        // print the current state of the vehicle
        System.out.println("My Vehicle");
        System.out.println(myVehicle.toString());
        
        // move the vehicle.
        myVehicle.go(intDistance);
        
        // print the current state of the vehicle
        System.out.println("Your Vehicle:");
        System.out.println(yourVehicle.toString());
        
    }
    

    /**
     * Prompt and return an integer; validate that it is within a given range.
     * 
     * @param message The message to show when prompting the user
     * @param low The lowest possible acceptable value for this integer.
     * @param high The highest possible acceptable value for this integer.
     * @return the validated integer
     * @throws NumberFormatException when non-numeric data are entered.
     * @throws HeadlessException 
     */
    public static int promptForInteger(String message, int low, int high) throws NumberFormatException, HeadlessException {
        // prompt for input
        String strInput = JOptionPane.showInputDialog(message);
        
        int intInput = Integer.parseInt(strInput);

        while (!(intInput >= low && intInput <= high)) {
            String errorMessage = "The number you have entered is not in the valid range.  Low: " + low + " High: " + high + ". Please try again.";
            strInput = JOptionPane.showInputDialog(errorMessage);
            intInput = Integer.parseInt(strInput);
        }
            
        // return the validated number.
        return intInput;
    }
}

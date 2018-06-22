/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uc.jonesbr.vehicles;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * This represents a driver of a vehicle.
 * @author ucint
 */
public class Driver {

    static int[][] trips = new int[100][2];
    static int tripCounter = 0;
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
        // create an object of type Vehicle, and store it in the variable myVehicle
        Vehicle myVehicle;
        int createAnother;
        
        // this array list will contain all of the vehicles that we create.
        ArrayList<Vehicle> allVehicles = new ArrayList<>();
            
        do {
            myVehicle  = new Vehicle();
            // prompt user
            String strGallonsOfGas = JOptionPane.showInputDialog("Enter gallons of gas");

            // convert the string return to a double
            double dblGallonsOfGas = Double.parseDouble(strGallonsOfGas);

            // set the attributes in myVehicle object.
            myVehicle.setGallonsOfGas(dblGallonsOfGas);

            final int intMilesPerGallon = promptForInteger("Enter miles per gallon", 0, 100);

            myVehicle.setMilesPerGallon(intMilesPerGallon);

            int intOdometer = promptForInteger("Enter odometer", 0, 1000000);

            myVehicle.setOdometer(intOdometer);

            // once I have created a vehicle, store it in our collection.
            allVehicles.add(myVehicle);
            
            // prompt the user to create another vehicle.
            createAnother = JOptionPane.showConfirmDialog(null, "Do you want to create another vehicle?", "Create another vehicle?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
        // if the user chooses yes, prompt for another vehicle.  Otherwise, do not loop again.    
        } while (createAnother == JOptionPane.YES_OPTION);        
   
        promptForTrips();
        
        for (Vehicle thisVehicle : allVehicles) {
            for (int i = 0; i < tripCounter; i++) {
                // print the current state of the vehicle.
                System.out.println("Before: " + thisVehicle.toString());

                if (thisVehicle.getGallonsOfGas() <= 0) {
                    System.out.println("Out of gas!");
                    break;
                }
                // move the vehicle
                thisVehicle.go(trips[i][0]);

                // print the current state of the vehicle.
                System.out.println("After: ");
                System.out.println(thisVehicle.toString());
                
               double reimbursementTotal = (trips[i][1] * trips[i][0])/100.0;
               System.out.println("Reimbursement Total: " + reimbursementTotal + " At " + trips[i][1] + " cents per mile.");                

            }
        }
    }
    
    /**
     * 
     * @throws NumberFormatException
     * @throws HeadlessException 
     */
    private static void promptForTrips() throws NumberFormatException, HeadlessException {

        int createAnother;

        do {
            // prompt the user for a trip distance.
            final String strDistanceTravelled = JOptionPane.showInputDialog("Enter distance to travel");
            final int intDistance = Integer.parseInt(strDistanceTravelled);

            // store that trip distance into an array.
            trips[tripCounter][0] = intDistance;
 
            String strReimbursementRate = JOptionPane.showInputDialog("Enter reimbursement rate, per mile.");
            trips[tripCounter][1] = Integer.parseInt(strReimbursementRate);

            // add one to the trip counter to increase our total number of trips entered.
            tripCounter++;

            createAnother = JOptionPane.showConfirmDialog(null, "Do you want to create another trip?", "Create another trip?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            // if the user chooses yes, prompt for another vehicle.  Otherwise, do not loop again.    
        } while (createAnother == JOptionPane.YES_OPTION);

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

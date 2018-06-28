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
        
        Vehicle.setLicensePlateFee(15.0);
        
        // initialize the values of yourVehicle
        yourVehicle.setGallonsOfGas(8);
        yourVehicle.setMilesPerGallon(20);
        yourVehicle.setOdometer(30000);
        yourVehicle.setLicensePlateFee(20.0);
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
        
        String strMilesPerGallon = JOptionPane.showInputDialog("Enter miles per gallon");
        int intMilesPerGallon = Integer.parseInt(strMilesPerGallon);
        
        myVehicle.setMilesPerGallon(intMilesPerGallon);
        
        final String strOdometer = JOptionPane.showInputDialog("Enter odometer");
        final int intOdometer = Integer.parseInt(strOdometer);
        
        myVehicle.setOdometer(intOdometer);
        myVehicle.setLicensePlateFee(30.0);
        
        final String strDistanceTravelled = JOptionPane.showInputDialog("Enter distance to travel");
        final int intDistance = Integer.parseInt(strDistanceTravelled);

        // print the current state of the vehicle
        System.out.println("My Vehicle");
        System.out.println(myVehicle.toString());
        
        // move the vehicle.
        myVehicle.go(intDistance);
        myVehicle.go(intDistance, "Get Grocercies");
        
        // print the current state of the vehicle
        System.out.println("Your Vehicle:");
        System.out.println(yourVehicle.toString());
        
    }
    

}

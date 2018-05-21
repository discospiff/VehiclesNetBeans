/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uc.jonesbr.vehicles;

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
        int mpg = 25;
        double gallonsOfGas = 10;
        int distance = 500;
        
        double gallonsConsumed = distance / mpg;
        gallonsOfGas = gallonsOfGas - gallonsConsumed;
        if (gallonsOfGas >= 0) {
            System.out.println("Gas Consumed: " + gallonsConsumed + " Gallons remaining: " + gallonsOfGas);
        } else {
            System.out.println("You ran out of gas!  You should start walking to a gas station.");
        }
    }
    
    
}

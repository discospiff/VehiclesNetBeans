/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uc.jonesbr.vehicles;

/**
 *
 * @author ucint
 */
public class Prius extends Vehicle {
    private int milliampHours;
    private int milesPerMah;

    @Override
    public void go(int distance) {
        System.out.println("In prius, running in internal combustion mode.");
        super.go(distance); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    /**
     * @return the milliampHours
     */
    public int getMilliampHours() {
        return milliampHours;
    }

    /**
     * @param milliampHours the milliampHours to set
     */
    public void setMilliampHours(int milliampHours) {
        this.milliampHours = milliampHours;
    }

    /**
     * @return the milesPerMah
     */
    public int getMilesPerMah() {
        return milesPerMah;
    }

    /**
     * @param milesPerMah the milesPerMah to set
     */
    public void setMilesPerMah(int milesPerMah) {
        this.milesPerMah = milesPerMah;
    }
    
    @Override
    public String toString() {
        String state = super.toString(); //To change body of generated methods, choose Tools | Templates.
            String priusState = "Prius milliamp hours: " +  milliampHours + " miles per MAH : " + milesPerMah + " ";
        return priusState + state; 
    }
    
}
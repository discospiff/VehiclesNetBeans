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
    private int batteryLevel;
    private int milesPerMah;
    private int rechargeFactor = 20; // amount in which the battery increases, per mile driven under interal combustion.
    private int batteryThreshhold = 10;

    @Override
    public void go(int distance) {
        if ( batteryLevel < batteryThreshhold) {
            super.go(distance); //To change body of generated methods, choose Tools | Templates.
            // compute recharge
            int increasedBatteryCharge = distance/rechargeFactor;
            batteryLevel += increasedBatteryCharge;
        } else {
            // decrease the battery charge by the amount consumed.
            int decreasedBatteryCharge = distance/milesPerMah;
            batteryLevel -= decreasedBatteryCharge;
            
            // increase the odometer to refect the distance traveled.
            // preferred
            // setOdometer(getOdometer() + distance);
            
            // use protected access to directly access the odometer variable from the superclass.
            odometer = odometer + distance;
            
        }
     
    }

    
    
    /**
     * @return the milliampHours
     */
    public int getMilliampHours() {
        return batteryLevel;
    }

    /**
     * @param milliampHours the milliampHours to set
     */
    public void setMilliampHours(int milliampHours) {
        this.batteryLevel = milliampHours;
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
            String priusState = "Prius milliamp hours: " +  batteryLevel + " miles per MAH : " + milesPerMah + " ";
        return priusState + state; 
    }
    
}
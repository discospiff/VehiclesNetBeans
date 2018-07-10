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
public interface Mobility {

    /**
     * @return the gallonsOfGas
     */
    double getGallonsOfGas();

    /**
     * @return the milesPerGallon
     */
    int getMilesPerGallon();

    /**
     * @return the odometer
     */
    int getOdometer();

    void go(int distance);

    /**
     * @param gallonsOfGas the gallonsOfGas to set
     */
    void setGallonsOfGas(double gallonsOfGas);

    /**
     * @param milesPerGallon the milesPerGallon to set
     */
    void setMilesPerGallon(int milesPerGallon);

    /**
     * @param odometer the odometer to set
     */
    void setOdometer(int odometer);
    
}

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
public class Cavalier extends Vehicle {
    
    private boolean convertible;

    /**
     * @return the convertible
     */
    public boolean isConvertible() {
        return convertible;
    }

    /**
     * @param convertible the convertible to set
     */
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    
    @Override
    public String toString() {
        String state = super.toString(); 
        String cavalierState = "Cavalier Convertible " + convertible + " ";
        return cavalierState + state;
    }
    
}
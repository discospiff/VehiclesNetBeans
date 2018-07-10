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
public interface LowEmissionVehicle {
    
    /**
     * Apply a rebate for driving a low emission vehicle.
     * @param amount 
     */
    void applyTaxRebate(int amount);
}

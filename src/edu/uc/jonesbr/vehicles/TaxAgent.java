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
public class TaxAgent {
    
    /**
     * For qualifying vehicles, apply a tax credit
     * @param lev 
     */
    public static void applyForTaxCredit(LowEmissionVehicle lev) {
        lev.applyTaxRebate(1000);
    }
    
}

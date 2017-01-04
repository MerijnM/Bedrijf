/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.oop1.bedrijf.models;


/**
 *
 * @author Merijn Molenaar
 */
public class Manager {
    
    private double bonus;
    private double maandsalaris;

    /**
     *
     * @param maandsalaris
     * @param naam
     */
    public Manager(double maandsalaris, String naam) {
        
        this.maandsalaris =  maandsalaris;
      
    }
    
    /**
     *
     * @param bonus
     */
    public void KenBonusToe(double bonus) {
        this.bonus = bonus;
        
    }
    
    /**
     *
     * @return
     */
    public double BerekenInkomsten() {
        
        double inkomsten = this.bonus + this.maandsalaris;
        
       return inkomsten; 
    }
    
    
}

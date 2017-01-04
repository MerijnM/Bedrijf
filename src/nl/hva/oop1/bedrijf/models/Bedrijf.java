/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.oop1.bedrijf.models;

import java.util.ArrayList;

/**
 *
 * @author Merijn Molenaar
 */
public class Bedrijf {
    
    private String naam;
    private ArrayList medewerkers;

    /**
     *
     * @param naam
     */
    public Bedrijf(String naam) {
        this.naam = naam;
    }
    
    public void printInkomsten() {
        
        
    }
    
    /**
     *
     * @return
     */
    public int aantalManagers() {
        
        return 2;
    }
    
    
    
    /**
     *
     * @param persoon
     */
    public void neemInDienst(String persoon) {
        
       
        
        
        
        this.medewerkers.add(persoon);
        
        
    }
    
    @Override
    public String toString() {
        
        
      return "Bedrijf " + this.naam + " heeft " + this.medewerkers.size() + " medewerkers";
    }
    
    
    
    
}

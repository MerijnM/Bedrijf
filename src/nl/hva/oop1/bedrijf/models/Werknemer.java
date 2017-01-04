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
public class Werknemer {
    
    private int laatstePersoneelsnummer;
   
    private double maandSalaris;
    private int personeelsnummer;

    /**
     *
     * @param maandsalaris
     * @param naam
     */
    public Werknemer(double maandsalaris, String naam) {
        
       this.maandSalaris = maandsalaris;
       
       naam.toString();
     
       
      
        
    }
    
    /**
     *
     * @return
     */
    public double BerekenInkomsten() {
        
        
      return this.maandSalaris;
    }
     
    
     
     
    
    
    
    
}

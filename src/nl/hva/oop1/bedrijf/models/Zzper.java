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
public class Zzper {

    private double uurtarief;
    private int urenGewerkt;

    /**
     *
     * @param uurtarief
     * @param naam
     */
    public Zzper(int uurtarief, String naam) {

        this.uurtarief = uurtarief;
    }

    /**
     *
     * @return
     */
    public double BerekenInkomsten() {

        double inkomsten = this.uurtarief * this.urenGewerkt;

        return inkomsten;

    }

    /**
     *
     * @param uren
     */
    public void huurin(int uren) {

        this.urenGewerkt = uren;

    }

}

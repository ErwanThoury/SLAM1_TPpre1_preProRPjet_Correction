/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.slam1_tppre1_preprorpjet;

/**
 *
 * @author erwan
 */
public class Sort {
    private String nom;
    private int degatMin;
    private int degatMax;
    private int portee;
    private String element;
    private double critique;

    public Sort(String nom, int degatMin, int degatMax, int portee, String element, double critique) {
        this.nom = nom;
        this.degatMin = degatMin;
        this.degatMax = degatMax;
        this.portee = portee;
        this.element = element;
        this.critique = critique;
    }

    public void affSort()
    {
        System.out.println("Nom du sort : " + this.nom);
        System.out.println("Element : " + this.element);
        System.out.println("Dégât : " + this.degatMin + " - " + this.degatMax);
        System.out.println("Portée : " + this.portee);
        System.out.println("Critique : " + (int)(this.critique*100) + "%");  
    }
    
    public void affDegatSort(int feu, int ter, int eau, int air)
    {
        if(this.element == "feu")
            System.out.println(this.nom + " : " 
                    + calculDegat(feu, this.degatMin) + " - " 
                    + calculDegat(feu, this.degatMax)
                    + " (CC : "
                    + calculDegat(feu, this.degatMin)*2 + " - "
                    + calculDegat(feu, this.degatMax)*2 + ")");
        if(this.element == "terre")
            System.out.println(this.nom + " : " 
                    + calculDegat(ter, this.degatMin) + " - " 
                    + calculDegat(ter, this.degatMax)
                    + " (CC : "
                    + calculDegat(ter, this.degatMin)*2 + " - "
                    + calculDegat(ter, this.degatMax)*2 + ")");              
        if(this.element == "agilité")
            System.out.println(this.nom + " : " 
                    + calculDegat(air, this.degatMin) + " - " 
                    + calculDegat(air, this.degatMax)
                    + " (CC : "
                    + calculDegat(air, this.degatMin)*2 + " - "
                    + calculDegat(air, this.degatMax)*2 + ")");        
        if(this.element == "eau")
            System.out.println(this.nom + " : " 
                    + calculDegat(eau, this.degatMin) + " - " 
                    + calculDegat(eau, this.degatMax)
                    + " (CC : "
                    + calculDegat(eau, this.degatMin)*2 + " - "
                    + calculDegat(eau, this.degatMax)*2 + ")");
    }
    public int calculDegat(int stats, int degat)
    {
        double retour = (double)degat + (double)degat * ((double)stats/100.0);
        return (int)retour;
    }
}

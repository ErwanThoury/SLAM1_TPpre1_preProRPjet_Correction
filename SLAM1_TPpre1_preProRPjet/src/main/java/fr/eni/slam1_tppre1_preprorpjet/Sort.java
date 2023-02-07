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
    private int niveau;
    private int degatMin;
    private int degatMax;
    private int portee;
    private String element;
    private double critique;

    public Sort(String nom, int niveau, int degatMin, int degatMax, int portee, String element, double critique) {
        this.nom = nom;
        this.niveau = niveau;
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
    
}

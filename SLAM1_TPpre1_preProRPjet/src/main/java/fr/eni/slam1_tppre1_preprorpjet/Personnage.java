/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.slam1_tppre1_preprorpjet;

/**
 *
 * @author erwan
 */
public class Personnage {
    private String nom;
    private String classe;
    private int niveau;
    private int pv;
    private int sagesse;
    private int force;
    private int intelligence;
    private int agilite;
    private int chance;
    private int pointDeCompetence;
    private Sort sortUn;
    private Sort sortDeux;
    private Sort sortTrois;
    public Personnage(String unNom, String uneClasse, int unNiveau, Sort unSortUn, Sort unSortDeux, Sort unSortTrois)
    {
        this.nom = unNom;
        this.classe = uneClasse;
        this.niveau = unNiveau;
        this.sortUn = unSortUn;
        this.sortDeux = unSortDeux;
        this.sortTrois = unSortTrois;
        this.pv = 50;
        this.sagesse = 0;
        this.force = 0;
        this.intelligence = 0;
        this.agilite = 0;
        this.chance = 0;
        this.pointDeCompetence = (this.niveau-1)*5;
    }

    public void remettreZeroStats()
    {
        this.pointDeCompetence = (this.niveau-1)*5;
        this.pv = 50;
        this.sagesse = 0;
        this.force = 0;
        this.intelligence = 0;
        this.agilite = 0;
        this.chance = 0;
    }
    public void affStats()
    {
        System.out.println("Voici les statistiques du disciple " + this.classe + " : " + this.nom + ".");
        affPv();
        affSages();
        affIntel();
        affForce();
        affChanc();
        affAgili();
    }   
    public void affPv()
    {
        System.out.println("Vous avez " + this.pv + " pv.");
    }
    public void affSages()
    {
        System.out.println("Vous avez " + this.sagesse + " en sagesse.");
    }
    public void affIntel()
    {
        System.out.println("Vous avez " + this.intelligence + "  en intelligence.");
    }
    public void affForce()
    {
        System.out.println("Vous avez " + this.force + " en force.");
    }
    public void affChanc()
    {
        System.out.println("Vous avez " + this.chance + " en chance.");
    }
    public void affAgili()
    {
        System.out.println("Vous avez " + this.agilite + " en agilité.");
    }    
    
    public void affSorts()
    {
        System.out.println("-----------------------------------------------------");
        System.out.println("Sort 1");
        this.sortUn.affSort();
        System.out.println("-----------------------------------------------------");
        System.out.println("Sort 2");
        this.sortDeux.affSort();
        System.out.println("-----------------------------------------------------");
        System.out.println("Sort 3");
        this.sortTrois.affSort();
    }
}

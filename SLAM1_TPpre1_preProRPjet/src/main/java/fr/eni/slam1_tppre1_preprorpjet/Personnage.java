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
    
    public void affSortsCombat()
    {
        System.out.println("-----------------------------------------------------");
        this.sortUn.affDegatSort(this.intelligence, this.force, this.chance, this.agilite);
        System.out.println("-----------------------------------------------------");
        this.sortDeux.affDegatSort(this.intelligence, this.force, this.chance, this.agilite);
        System.out.println("-----------------------------------------------------");
        this.sortTrois.affDegatSort(this.intelligence, this.force, this.chance, this.agilite);    
    }
    
    public void augmenterStats(int nbAugmenter, int choixStats)
    {
        if(nbAugmenter <= this.pointDeCompetence)
        {
            this.pointDeCompetence = this.pointDeCompetence - nbAugmenter;
            if(choixStats == 1)
                this.setPv(this.pv + nbAugmenter);
            if(choixStats == 2)
                this.setSagesse(this.sagesse + nbAugmenter);
            if(choixStats == 3)
                this.setIntelligence(this.intelligence + nbAugmenter);
            if(choixStats == 4)
                this.setForce(this.force + nbAugmenter);
            if(choixStats == 5)
                this.setChance(this.chance + nbAugmenter);
            if(choixStats == 6)
                this.setAgilite(this.agilite + nbAugmenter);
        }
        else
        {
            System.out.println("Pas assez de point de compétence !");
        }
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getSagesse() {
        return sagesse;
    }

    public void setSagesse(int sagesse) {
        this.sagesse = sagesse;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getPointDeCompetence() {
        return pointDeCompetence;
    }

    public void setPointDeCompetence(int pointDeCompetence) {
        this.pointDeCompetence = pointDeCompetence;
    }

    public Sort getSortUn() {
        return sortUn;
    }

    public void setSortUn(Sort sortUn) {
        this.sortUn = sortUn;
    }

    public Sort getSortDeux() {
        return sortDeux;
    }

    public void setSortDeux(Sort sortDeux) {
        this.sortDeux = sortDeux;
    }

    public Sort getSortTrois() {
        return sortTrois;
    }

    public void setSortTrois(Sort sortTrois) {
        this.sortTrois = sortTrois;
    }
    
}

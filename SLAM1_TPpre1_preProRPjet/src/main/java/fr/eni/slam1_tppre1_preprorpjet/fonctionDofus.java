/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.slam1_tppre1_preprorpjet;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class fonctionDofus {
    Scanner s = new Scanner(System.in);

    public fonctionDofus() {
    }
    
    public Personnage introduction()
    {
        String classe;
        System.out.println("Bienvenue jeune âme ! Bienvenue dans le monde des Douze.\n"
                + "Un  monde paisible sous la protection des douze Dieux, une terre de légende où règne la magie des Dofus, six oeufs de dragon, symboles de puissance et porteurs d'espoir.\n"
                + "Jusqu'à ce jour terrible, où ils furent dérobés !\n"
                + "Depuis, l'harmonie est perturbée, éléments et monstres se déchaînent.\n"
                + "Le temps est venue ! Ta destinée te mène à Incarnam.\n"
                + "Découvre le monde, trouve de précieux alliés, retrouve les Dofus, deviens un héros et entre dans la légende !");
        int choixPerso = repet(2, "Tu es un disciple: \n1 - Steamer \n2 - Sadida");
        Sort sortUn;
        Sort sortDeux;
        Sort sortTrois;
        if(choixPerso == 1)
        {
            classe = "Steamer";
            sortUn = new Sort("Vapor", 20, 22, 4, "feu", 0.25); 
            sortDeux = new Sort("Ancrage", 14, 16, 6, "terre", 0.05); 
            sortTrois = new Sort("Torpille", 18, 21, 4, "agilité", 0.15); 
        }
        else
        {
            classe = "Sadida";
            sortUn = new Sort("Ronce", 12, 14, 6, "terre", 0.05); 
            sortDeux = new Sort("Larme", 13, 15, 4, "eau", 0.25); 
            sortTrois = new Sort("Herbe Folle", 20, 23, 6, "feu", 0.15); 
        }
        int choixNiveau = repet(200, "Quel niveau as-tu atteint ? (1 - 200)");
        System.out.println("Quel est votre nom disciple " + classe + " ?");
        String nomDuJoueur = s.next();

        Personnage joueur = new Personnage(nomDuJoueur, classe, choixNiveau, sortUn, sortDeux, sortTrois);
        return joueur;
    }
    public int repet(int max, String repet)
    {
        int r = 0;
        while(r < 1 | r > max)
        {
            try
            {
                System.out.println(repet);              
                r = Integer.parseInt(s.next()); 
                
            }
            catch(Exception e)
            {
            
            }
        }
        return r;
    }
    
    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
}

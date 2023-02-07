/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.slam1_tppre1_preprorpjet;

/**
 *
 * @author erwan
 */
public class SLAM1_TPpre1_preProRPjet {
    static fonctionDofus f = new fonctionDofus();
    
    public static void main(String[] args) {
        String[] s = {};
        Personnage joueur = f.introduction();
        String affMenu = "-----------------------------------------------------\n"
                + "Que voulez-vous faire ?\n"
                + "1 - Afficher les statistiques.\n"
                + "2 - Modifier les statistiques.\n"
                + "3 - Remettre les statistiques à zéro.\n"
                + "4 - Afficher les sorts.\n"
                + "5 - Afficher les sorts en combat.\n"
                + "6 - Recommencer.\n"
                + "7 - Quitter le menu statistiques/sorts.\n"
                + "-----------------------------------------------------";
        String affMenuStats = "1 - Afficher les statistiques.\n"
                + "2 - Modifier les statistiques.\n"
                + "3 - Remettre les statistiques à zéro.\n"
                + "4 - (retour)";
        String affMenuSorts = "1 - Afficher les sorts.\n"
                + "2 - Afficher les sorts en combat.\n"
                + "3 - (retour)";
        String affStats = "-----------------------------------------------------\n"
                + "Quelle statistique voulez-vous augmenter ?\n"
                + "1 - Vitalité\n"
                + "2 - Sagesse\n"
                + "3 - Intelligence\n"
                + "4 - Force\n"
                + "5 - Chance\n"
                + "6 - Agilité\n"
                + "-----------------------------------------------------";
        String affPoint = "-----------------------------------------------------\n"
                + "Combien voulez-vous investir (1 - ";

        int choixMenu;
        int choixMontant;
        do
        {
            choixMenu = f.repet(7, affMenu);
            if(choixMenu == 1)
                joueur.affStats();            
            if(choixMenu == 2)
            {
                if(joueur.getPointDeCompetence() > 0)
                {
                    System.out.println("Vous avez " + joueur.getPointDeCompetence() + " point(s) restant(s).");
                    choixMontant = f.repet(joueur.getPointDeCompetence(),
                            affPoint + joueur.getPointDeCompetence() + ") ?");
                    joueur.augmenterStats(choixMontant, f.repet(6,affStats));
                }
                else
                {
                    System.out.println("Vous n'avez plus de point !");
                }
            }
            if(choixMenu == 3)
                joueur.remettreZeroStats();
            if(choixMenu == 4)
                joueur.affSorts();
            if(choixMenu == 5)
                joueur.affSortsCombat(); 
            
            if(choixMenu == 6)
            {
                main(s);  
                break;
            }
            if(choixMenu == 7)
                System.out.println("Vous quittez Dofus.");
             
        } while(choixMenu != 7);
    }
}

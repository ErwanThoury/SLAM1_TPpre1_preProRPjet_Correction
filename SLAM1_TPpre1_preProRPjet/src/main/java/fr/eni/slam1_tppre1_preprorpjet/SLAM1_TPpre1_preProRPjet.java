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
                + "3 - Afficher les sorts.\n"
                + "4 - Modifier les sorts.\n"
                + "5 - Recommencer.\n"
                + "6 - Quitter le menu statistiques/sorts.\n"
                + "-----------------------------------------------------";
        int choixMenu;
        do
        {
            
            choixMenu = f.repet(6, affMenu);
            
            if(choixMenu == 1)
                joueur.affStats();            
            if(choixMenu == 2)
            {
                System.out.println("ModifStatistiques");
            }
            
            if(choixMenu == 3)
                joueur.affSorts();
            if(choixMenu == 4)
            {
                System.out.println("ModifSorts");
            }  
            
            if(choixMenu == 5)
            {
                main(s);  
                break;
            }
            if(choixMenu == 6)
                System.out.println("Vous quittez Dofus.");
             
        } while(choixMenu != 6);
    }
}

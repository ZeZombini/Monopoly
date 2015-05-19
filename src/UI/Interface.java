package UI;

import Jeu.Monopoly;
import java.util.Scanner;

public class Interface {
	public Monopoly monopoly;

    public Interface(Monopoly monopoly) {
        setMonopoly(monopoly);
    }
       
    public Monopoly getMonopoly() {
        return monopoly;
    }
    public void setMonopoly(Monopoly monopoly) {
        this.monopoly = monopoly;
    }
    
    public void initialiserPartie (){
        Scanner sc = new Scanner(System.in);
        int nbrJoueur = 0;
        String nomJoueur;
        while(nbrJoueur<2 | nbrJoueur>6){
            System.out.println("Veuillez indiquer le nombre de joueur : ");
            nbrJoueur = sc.nextInt();
        }
        for(int i=0; i<nbrJoueur; i++){
            System.out.println("Veuillez saisir le nom du joueur n°"+(i+1)+" : ");
            nomJoueur = sc.nextLine();
            monopoly.nouveauJoueur(nomJoueur);
        }
        
    }
}
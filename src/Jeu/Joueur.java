package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
	private Monopoly monopoly;
	private ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
	private ArrayList<Gare> gares = new ArrayList<Gare>();
	private Carreau positionCourante;
	private ArrayList<ProprieteAConstruire> proprietesAConstruire = new ArrayList<ProprieteAConstruire>();

        public Joueur(String nomJoueur,Carreau positionCourante, Monopoly monopoly) {
            setNomJoueur(nomJoueur);
            setPositionCourante(positionCourante);
            setMonopoly(monopoly);
        }

        public String getNomJoueur() {
            return nomJoueur;
        }
        public void setNomJoueur(String nomJoueur) {
            this.nomJoueur = nomJoueur;
        }
        
        public int getCash() {
            return cash;
        }
        public void setCash(int cash) {
            this.cash = cash;
        }

        public Monopoly getMonopoly() {
            return monopoly;
        }
        public void setMonopoly(Monopoly monopoly) {
            this.monopoly = monopoly;
        }

        public ArrayList<Compagnie> getCompagnies() {
            return compagnies;
        }
        public void setCompagnies(ArrayList<Compagnie> compagnies) {
            this.compagnies = compagnies;
        }

        public ArrayList<Gare> getGares() {
            return gares;
        }
        public void setGares(ArrayList<Gare> gares) {
            this.gares = gares;
        }

        public Carreau getPositionCourante() {
            return positionCourante;
        }
        public void setPositionCourante(Carreau positionCourante) {
            this.positionCourante = positionCourante;
        }

        public ArrayList<ProprieteAConstruire> getProprietesAConstruire() {
            return proprietesAConstruire;
        }
        public void setProprietesAConstruire(ArrayList<ProprieteAConstruire> proprietesAConstruire) {
            this.proprietesAConstruire = proprietesAConstruire;
        }
        
        
}
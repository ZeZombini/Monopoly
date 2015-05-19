package Jeu;

import java.util.ArrayList;

public class Joueur {
	private String _nomJoueur;
	private int _cash = 1500;
	private Monopoly _monopoly;
	private ArrayList<Compagnie> _compagnies = new ArrayList<Compagnie>();
	private ArrayList<Gare> _gares = new ArrayList<Gare>();
	private Carreau _positionCourante;
	private ArrayList<ProprieteAConstruire> _proprietesAConstruire = new ArrayList<ProprieteAConstruire>();
}
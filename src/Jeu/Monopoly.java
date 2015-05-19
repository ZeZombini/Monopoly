package Jeu;

import UI.Interface;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Monopoly {
	private int nbMaisons = 32;
	private int nbHotels = 12;
	private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	public  Interface inter;
        private ArrayList<Groupe> groupes = new ArrayList();
        private HashMap<Integer, Carreau> carreaux;
        
        
        public Monopoly(String dataFilename){
		buildGamePlateau(dataFilename);
	}
	
	private void buildGamePlateau(String dataFilename)
	{
		try{
			ArrayList<String[]> data = readDataFile(dataFilename, ",");
			
			//TODO: create cases instead of displaying
			for(int i=0; i<data.size(); ++i){
				String caseType = data.get(i)[0];
				if(caseType.compareTo("P") == 0){
                                    // Recupération des différentes variables
                                        int num = Integer.parseInt(data.get(i)[1]);
                                        String nomC = data.get(i)[2];
                                        Groupe grp = getGroupe(data.get(i)[3]);
                                        int prix = Integer.parseInt(data.get(i)[4]);
                                        int nu = Integer.parseInt(data.get(i)[5]);
                                        int mais1 = Integer.parseInt(data.get(i)[6]);
                                        int mais2 = Integer.parseInt(data.get(i)[7]);
                                        int mais3 = Integer.parseInt(data.get(i)[8]);
                                        int mais4 = Integer.parseInt(data.get(i)[9]);
                                        int hotel = Integer.parseInt(data.get(i)[10]);
                                        ArrayList<Integer> loyer;
                                        loyer.add(nu);
                                        loyer.add(mais1);
                                        loyer.add(mais2);
                                        loyer.add(mais3);
                                        loyer.add(mais4);
                                        loyer.add(hotel);
                                        
                                        ProprieteAConstruire c = new ProprieteAConstruire(num,nomC,this,grp,prix,);
                                        carreaux.put(num,c);
				}
				else if(caseType.compareTo("G") == 0){
					System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
				}
				else if(caseType.compareTo("C") == 0){
					System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
				}
				else if(caseType.compareTo("CT") == 0){
					System.out.println("Case Tirage :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
				}
				else if(caseType.compareTo("CA") == 0){
					System.out.println("Case Argent :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
				}
				else if(caseType.compareTo("CM") == 0){
					System.out.println("Case Mouvement :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
				}
				else
					System.err.println("[buildGamePleateau()] : Invalid Data type");
			}
			
		} 
		catch(FileNotFoundException e){
			System.err.println("[buildGamePlateau()] : File is not found!");
		}
		catch(IOException e){
			System.err.println("[buildGamePlateau()] : Error while reading file!");
		}
	}
        
        private void initGroupe(){
            Groupe bleuFonce = new groupe(CouleurPropriete.bleuFonce, 200, 200);
            Groupe orange    = new groupe(CouleurPropriete.orange, 100, 100);
            Groupe mauve     = new groupe(CouleurPropriete.mauve, 50, 50);
            Groupe violet    = new groupe(CouleurPropriete.violet, 100, 100);
            Groupe bleuCiel  = new groupe(CouleurPropriete.bleuCiel, 50, 50);
            Groupe jaune     = new groupe(CouleurPropriete.jaune, 150, 150);
            Groupe vert      = new groupe(CouleurPropriete.vert, 200, 200);
            Groupe rouge     = new groupe(CouleurPropriete.rouge, 150, 150);
            
            groupes.add(bleuFonce);
            groupes.add(orange);
            groupes.add(mauve);
            groupes.add(violet);
            groupes.add(bleuCiel);
            groupes.add(jaune);
            groupes.add(vert);
            groupes.add(rouge);
        }
        
        private Groupe getGroupe(String couleur){
            for (Groupe grp : groupes){
                if (grp.getCouleur().toString() == couleur){
                  return grp;
                }
            }


        }
	
	private ArrayList<String[]> readDataFile(String filename, String token) throws FileNotFoundException, IOException
	{
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		BufferedReader reader  = new BufferedReader(new FileReader(filename));
		String line = null;
		while((line = reader.readLine()) != null){
			data.add(line.split(token));
		}
		reader.close();
		
		return data;
	}
}

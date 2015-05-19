package Jeu;

public abstract class CarreauPropriete extends Carreau {
	private int prixAchat;
	private Joueur proprietaire;
        
        public CarreauPropriete (int numero, String nomCarreau, int prixAchat){
            super(numero, nomCarreau);
            setPrixAchat(prixAchat);
        }

        public int getPrixAchat() {
            return prixAchat;
        }

        public void setPrixAchat(int _prixAchat) {
            this.prixAchat = _prixAchat;
        }

        public Joueur getProprietaire() {
            return proprietaire;
        }

        public void setProprietaire(Joueur _proprietaire) {
            this.proprietaire = _proprietaire;
        }
        
}
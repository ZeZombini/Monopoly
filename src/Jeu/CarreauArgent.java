package Jeu;

public class CarreauArgent extends CarreauAction {
	private int montant;

    public CarreauArgent(int numero, String nomCarreau, int montant) {
        super(numero, nomCarreau);
        setMontant(montant);
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }  
}
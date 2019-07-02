package Diginamic.DesignPattern.composite;

/**
 * represente un employe
 * 
 * @author Kevin.s
 *
 */
public class Employe implements IElement {

	/** salaire : Double */
	private Double salaire;
	/** nom : String */
	private String nom;
	/** prenom : String */
	private String prenom;

	/**
	 * Constructeur
	 * 
	 * @param salaire
	 */
	public Employe(Double salaire) {
		this.salaire = salaire;
	}

	/**
	 * retourne le salaire de l’employe
	 */
	public Double calculerSalaire() {
		return salaire;
	}

}

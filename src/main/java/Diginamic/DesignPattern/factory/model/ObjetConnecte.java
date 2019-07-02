package Diginamic.DesignPattern.factory.model;

/**
 * represente un objet connecté
 * 
 * @author Kevin.s
 *
 */
public abstract class ObjetConnecte implements Chargeable {

	/** limiteVolts : int */
	protected int limiteVolts;

	/**
	 * Constructeur
	 * 
	 */
	public ObjetConnecte() {
	}

	/**
	 * Getter
	 * 
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/**
	 * Setters
	 * 
	 * @param limiteVolts
	 *            the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}

package Diginamic.DesignPattern.factory.model;

/**
 * represente une enceinte connectée
 * 
 * @author Kevin.s
 *
 */
public class EnceinteConnectee extends ObjetConnecte {

	/**
	 * Constructeur
	 * 
	 */
	public EnceinteConnectee() {
		this.limiteVolts = 30;
	}

	/**
	 * permet de recharger un objet
	 * 
	 * @param volts
	 */
	public void recharger(int volts) {
		if (volts > limiteVolts) {
			System.out.println("l’enceinte est grillé");
		} else if (volts == limiteVolts) {
			System.out.println("l’enceinte est en charge");
		} else {
			System.out.println("tension insuffisante");
		}

	}

}

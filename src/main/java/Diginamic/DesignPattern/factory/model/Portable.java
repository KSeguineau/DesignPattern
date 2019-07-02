package Diginamic.DesignPattern.factory.model;

/**
 * represente un portable
 * 
 * @author Kevin.s
 *
 */
public class Portable extends ObjetConnecte {

	/**
	 * Constructeur
	 * 
	 */
	public Portable() {
		this.limiteVolts = 10;
	}

	/**
	 * permet de recharger un objet
	 * 
	 * @param volts
	 */
	public void recharger(int volts) {
		if (volts > limiteVolts) {
			System.out.println("le portable est grillé");
		} else if (volts == limiteVolts) {
			System.out.println("le portable est en charge");
		} else {
			System.out.println("tension insuffisante");
		}
	}

}

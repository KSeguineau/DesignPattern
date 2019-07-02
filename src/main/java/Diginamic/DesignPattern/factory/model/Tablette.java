package Diginamic.DesignPattern.factory.model;

/**
 * represente une tablette
 * 
 * @author Kevin.s
 *
 */
public class Tablette extends ObjetConnecte {

	/**
	 * Constructeur
	 * 
	 */
	public Tablette() {
		this.limiteVolts = 20;
	}

	/**
	 * permet de recharger un objet
	 * 
	 * @param volts
	 */
	public void recharger(int volts) {
		if (volts > limiteVolts) {
			System.out.println("la tablette est grillé");
		} else if (volts == limiteVolts) {
			System.out.println("la tablette est en charge");
		} else {
			System.out.println("tension insuffisante");
		}
	}

}

package Diginamic.DesignPattern.adapter;

import Diginamic.DesignPattern.factory.model.Chargeable;
import Diginamic.DesignPattern.factory.model.ObjetConnecte;

/**
 * permet d’adater un chargeable pour être chargé par un chargeur
 * 
 * @author Kevin.s
 *
 */
public class ObjetConnecteAdapter implements Chargeable {

	/** obj : ObjetConnecte */
	private ObjetConnecte obj;

	/**
	 * Constructeur
	 * 
	 * @param obj
	 */
	public ObjetConnecteAdapter(ObjetConnecte obj) {
		this.obj = obj;
	}

	/**
	 * adapte la puissance reçu pour ne pas grillé l’appareil
	 */
	public void recharger(int volts) {
		if (volts > obj.getLimiteVolts()) {
			volts = obj.getLimiteVolts();
		}

		obj.recharger(volts);
	}

	/**
	 * inutile ici, juste pour pouvoir faire le tp de 2 façons différentes
	 */
	public void setLimiteVolts(int limiteVolts) {

	}

	/**
	 * inutile ici, juste pour pouvoir faire le tp de 2 façons différentes
	 */
	public int getLimiteVolts() {
		return 0;
	}
}

package Diginamic.DesignPattern.adapter;

import Diginamic.DesignPattern.factory.model.Chargeable;

/**
 * permet d’adapter un chargeur pour charger un objet chargeable
 * 
 * @author Kevin.s
 *
 */
public class ChargeurAdapter {

	/** chargeur : Chargeur */
	private Chargeur chargeur;

	/**
	 * Constructeur
	 * 
	 * @param chargeur
	 */
	public ChargeurAdapter(Chargeur chargeur) {
		this.chargeur = chargeur;
	}

	/**
	 * adapt la puissance du chargeur à l’objet chargeable
	 * 
	 * @param chargeable
	 */
	public void brancher(Chargeable chargeable) {
		if (chargeur.getVolts() >= chargeable.getLimiteVolts()) {
			chargeur.setVolts(chargeable.getLimiteVolts());
		}
		chargeur.brancher(chargeable);

	}
}

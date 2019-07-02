package Diginamic.DesignPattern.adapter;

import Diginamic.DesignPattern.factory.model.Chargeable;

/**
 * represente un chargeur
 * 
 * @author Kevin.s
 *
 */
public class Chargeur {

	/** volts : int */
	private int volts = 220;

	/**
	 * Constructeur
	 * 
	 */
	public Chargeur() {
	}

	/**
	 * permet de charger un objet chargeable
	 * 
	 * @param chargeable
	 */
	public void brancher(Chargeable chargeable) {
		chargeable.recharger(volts);
	}

	/**
	 * Getter
	 * 
	 * @return the volts
	 */
	public int getVolts() {
		return volts;
	}

	/**
	 * Setters
	 * 
	 * @param volts
	 *            the volts to set
	 */
	public void setVolts(int volts) {
		this.volts = volts;
	}

}

package Diginamic.DesignPattern.factory.model;

/**
 * represente un objet chargeable
 * 
 * @author Kevin.s
 *
 */
public interface Chargeable {

	/**
	 * permet de recharger un objet
	 * 
	 * @param volts
	 */
	public void recharger(int volts);

	/**
	 * setter
	 * 
	 * @param limiteVolts
	 */
	public void setLimiteVolts(int limiteVolts);

	/**
	 * getter
	 * 
	 * @return int
	 */
	public int getLimiteVolts();

}

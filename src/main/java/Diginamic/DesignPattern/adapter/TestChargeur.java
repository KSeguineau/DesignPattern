package Diginamic.DesignPattern.adapter;

import Diginamic.DesignPattern.factory.factory.ObjetConnectéFactory;
import Diginamic.DesignPattern.factory.model.ObjetConnecte;
import Diginamic.DesignPattern.factory.model.ObjetConnecteEnum;

/**
 * point d’entrée
 * 
 * @author Kevin.s
 *
 */
public class TestChargeur {

	/**
	 * Constructeur
	 * 
	 */
	public TestChargeur() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjetConnectéFactory factory = new ObjetConnectéFactory();
		ObjetConnecte portable = factory.getObjet(ObjetConnecteEnum.TELEPHONE);
		Chargeur chargeur1 = new Chargeur();
		ChargeurAdapter chargeurAdapt = new ChargeurAdapter(chargeur1);
		chargeurAdapt.brancher(portable);

		Chargeur chargeur2 = new Chargeur();
		ObjetConnecteAdapter objAdapt = new ObjetConnecteAdapter(portable);
		chargeur2.brancher(objAdapt);
	}

}

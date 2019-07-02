package Diginamic.DesignPattern.factory;

import Diginamic.DesignPattern.factory.factory.ObjetConnectéFactory;
import Diginamic.DesignPattern.factory.model.ObjetConnecte;
import Diginamic.DesignPattern.factory.model.ObjetConnecteEnum;

/**
 * point d’entrée
 * 
 * @author Kevin.s
 *
 */
public class TestFactory {

	/**
	 * Constructeur
	 * 
	 */
	public TestFactory() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjetConnectéFactory factory = new ObjetConnectéFactory();
		ObjetConnecte portable = factory.getObjet(ObjetConnecteEnum.TELEPHONE);
		ObjetConnecte tablette = factory.getObjet(ObjetConnecteEnum.TABLETTE);
		ObjetConnecte enceinte = factory.getObjet(ObjetConnecteEnum.ENCEINTE);

		portable.recharger(10);
		tablette.recharger(10);
		enceinte.recharger(220);

	}

}

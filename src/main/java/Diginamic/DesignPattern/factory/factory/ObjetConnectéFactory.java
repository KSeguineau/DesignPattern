package Diginamic.DesignPattern.factory.factory;

import Diginamic.DesignPattern.factory.model.EnceinteConnectee;
import Diginamic.DesignPattern.factory.model.ObjetConnecte;
import Diginamic.DesignPattern.factory.model.ObjetConnecteEnum;
import Diginamic.DesignPattern.factory.model.Portable;
import Diginamic.DesignPattern.factory.model.Tablette;

/**
 * represente une factory d’objet connectés
 * 
 * @author Kevin.s
 *
 */
public class ObjetConnectéFactory {

	/**
	 * Constructeur
	 * 
	 */
	public ObjetConnectéFactory() {

	}

	/**
	 * factory
	 * 
	 * @param monObj
	 * @return
	 */
	public ObjetConnecte getObjet(ObjetConnecteEnum monObj) {
		switch (monObj) {
		case TELEPHONE:
			return new Portable();
		case TABLETTE:
			return new Tablette();
		case ENCEINTE:
			return new EnceinteConnectee();
		default:
			return null;
		}
	}
}

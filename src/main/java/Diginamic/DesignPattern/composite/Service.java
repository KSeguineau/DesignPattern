package Diginamic.DesignPattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * represente un service
 * 
 * @author Kevin.s
 *
 */
public class Service implements IElement {

	/** list : List<IElement> */
	private List<IElement> list = new ArrayList<IElement>();

	/**
	 * Constructeur
	 * 
	 */
	public Service() {
	}

	/**
	 * retourne le salaire du service
	 */
	public Double calculerSalaire() {
		Double tot = 0.0;
		for (IElement elem : list) {
			tot += elem.calculerSalaire();
		}
		return tot;
	}

	/**
	 * permet d’ajouter un IElement dans la list
	 * 
	 * @param element
	 */
	public void addIElement(IElement element) {
		list.add(element);
	}
}

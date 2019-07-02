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

		return list.stream().map(e -> e.calculerSalaire()).reduce((a, b) -> a + b).get();
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

package Diginamic.DesignPattern.composite;

/**
 * point d’entrée
 * 
 * @author Kevin.s
 *
 */
public class TestComposite {

	/**
	 * Constructeur
	 * 
	 */
	public TestComposite() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Service dsin = new Service();
		Employe directeur = new Employe(10000.0);
		Employe architecte = new Employe(8000.0);
		dsin.addIElement(directeur);
		dsin.addIElement(architecte);

		Service bigData = new Service();
		Employe chef = new Employe(7500.0);
		Employe Concepteur = new Employe(3500.0);
		bigData.addIElement(chef);
		bigData.addIElement(Concepteur);

		Service javaDev = new Service();
		Employe chef2 = new Employe(7500.0);
		Employe leadDev = new Employe(3500.0);
		javaDev.addIElement(chef2);
		javaDev.addIElement(leadDev);

		dsin.addIElement(bigData);
		dsin.addIElement(javaDev);

		System.out.println(dsin.calculerSalaire());

	}

}

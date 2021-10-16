package core.view;

public class Lecture {

	public static void menu() {
		viewer("\n+++++++++Main Menu+++++++++++++");
		viewer("-1  .Expression");
		viewer("-2  .Polygone");
		viewer("\n--Rentrer le choix :... ");

	}
	
	public static void displayPolygon() {
		viewer("\n+++++++++Polygon Menu+++++++++++++");
		viewer("-1  .Rectangle");
		viewer("-2  .Carre");
		viewer("-3  .Triangle");
		viewer("\n--Rentrer le choix :... ");

	}
	
	public static void displayOperator() {
		viewer("\n+++++++++Shape Menu+++++++++++++");
		viewer("-1  .Calculer le perimettre");
		viewer("-2  .Calculer la surface");
		viewer("\n--Rentrer le choix :... ");
	}

		
	
	/** 
	 * @param objet
	 */
	public static void viewer(String objet) {
		System.out.println(objet);
	}
	

}

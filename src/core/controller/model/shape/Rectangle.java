package core.controller.model.shape;

public class Rectangle {
	
	
	/** 
	 * @param longueur
	 * @param largeur
	 * @return double
	 */
	public static double perimeter (double longueur, double largeur ) {
		return (longueur+largeur)*2;
	}

	
	/** 
	 * @param longueur
	 * @param largeur
	 * @return double
	 */
	public static double surface (double longueur, double largeur) {
		return longueur*largeur;	
	}
	

}

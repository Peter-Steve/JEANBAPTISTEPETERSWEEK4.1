package core.controller.model.shape;

public class Triangle {

	
	/** 
	 * @param cote1
	 * @param cote2
	 * @param cote3
	 * @return double
	 */
	public static double perimeter (double cote1, double cote2, double cote3 ) {
		return cote1+cote2+cote3;
	}
	
	
	/** 
	 * @param base
	 * @param hauteur
	 * @return double
	 */
	public static double surface (double base, double hauteur) {
		return (base*hauteur)/2;	
	}
}
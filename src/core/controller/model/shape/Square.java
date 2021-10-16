package core.controller.model.shape;

public class Square {

	
	/** 
	 * @param cote
	 * @return double
	 */
	public static double perimeter (double cote ) {
		return cote*4;
	}
	

	
	/** 
	 * @param cote
	 * @return double
	 */
	public static double surface (double cote) {
		return cote*cote;	
	}

}

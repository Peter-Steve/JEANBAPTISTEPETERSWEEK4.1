package core.view;

import java.util.Scanner;

public class Lire {
	
	Scanner sc;
	
	public Lire() {
		sc = new Scanner(System.in);
	}
	
	
	/** 
	 * @return int
	 */
	public int lireInt() {
		return sc.nextInt();
		
	}
	
	
	/** 
	 * @return double
	 */
	public double lireDouble() {
		return sc.nextDouble();
	}
	
	
	/** 
	 * @return String
	 */
	public String lireExpression() {
		return sc.next();
	}
	
	public void nextLine() {
		sc.nextLine();
	}

}

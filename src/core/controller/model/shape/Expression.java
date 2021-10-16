package core.controller.model.shape;


public class Expression {
	
	private String val;
	private String values;
	
	public static Expression expressionIn = new Expression("0");

	private Expression(String values) {
		this.values = values;
		this.val = values.replace(",",".");
		this.val = this.val.replace("*","x");
	}
	
	
	/** 
	 * @return String
	 */
	public String getValues() {
		return this.values;
	}
	
	
	/** 
	 * @param values
	 */
	public void setValues(String values) {
		this.values = values;
		this.val = values.replace(",",".");
		this.val = this.val.replace("*","x");
	}
	
	
	/** 
	 * @param end
	 * @return int
	 */
	private int lastIndex(int end) {
		
		String temp;
		
		for(int i = end; i>=0;i--) {
			temp = this.val.substring(i,i+1);
			if(temp.equals("+") || temp.equals("-") || temp.equals("x") || temp.equals("/")) {
				
				return i;
				
			}
		}
		
		return -1;
		
	}
	
	
	/** 
	 * @param start
	 * @return int
	 */
	private int firstIndex(int start) {
			
			String temp;
			
			for(int i = start; i<this.val.length();i++) {
				temp = this.val.substring(i,i+1);
				if(temp.equals("+") || temp.equals("-") || temp.equals("x") || temp.equals("/")) {
					
					return i;
					
				}
			}
			
			return -1;
		
	}
	
	
	/** 
	 * @return int
	 */
	private int numberFirst(){
		if(this.val.indexOf("/")==-1) {
			
			return this.val.indexOf("x");	
			
		}
		else if(this.val.indexOf("x")==-1) {
			
			return this.val.indexOf("/");
			
		}
		else {
			return Math.min(this.val.indexOf("/"), this.val.indexOf("x"));
		}
	}

	private void priority() {
		
		String values1="";
		String values2="";
		int valueFirst=0;
		int valueSecond=0;
		double correctResul=0;
		
		int operatingNumber = numberFirst();
		
		while(operatingNumber >0) {
			
			valueFirst = lastIndex(operatingNumber-1);
			
			if(valueFirst!=-1) {
				values1 = this.val.substring(0, valueFirst+1);
			}
			else {
				values1="";
			}
			
			valueSecond = firstIndex(operatingNumber+1);
			
			if(valueSecond!=-1) {
				values2 = this.val.substring(valueSecond,this.val.length());
			}
			else {
				values2="";
				valueSecond = this.val.length();
			}
			
			if(this.val.substring(operatingNumber, operatingNumber+1).equals("x")) {
				correctResul = Double.parseDouble(this.val.substring(valueFirst+1,operatingNumber)) * Double.parseDouble(this.val.substring(operatingNumber+1,valueSecond));
			}
			else {
				correctResul = Double.parseDouble(this.val.substring(valueFirst+1,operatingNumber)) / Double.parseDouble(this.val.substring(operatingNumber+1,valueSecond));
			}
			
			this.val = values1+correctResul+values2;
			
			operatingNumber = numberFirst();
		}
		
	}
	
	
	/** 
	 * @param i
	 * @return double
	 */
	private double correctResul(int i) {
		
		if(lastIndex(i-1)==-1) {
			return Double.parseDouble(this.val.substring(0,i));
		}
		
		if(this.val.substring(lastIndex(i-1),lastIndex(i-1)+1).equals("+")) {
			return correctResul(lastIndex(i-1)) + Double.parseDouble(this.val.substring(lastIndex(i-1)+1,i));
		}
		else {
			return correctResul(lastIndex(i-1)) - Double.parseDouble(this.val.substring(lastIndex(i-1)+1,i));
		}
		
	}
	

	
	/** 
	 * @return double
	 */
	public double correctResul() {
		priority();
		return correctResul(this.val.length());
	}
}

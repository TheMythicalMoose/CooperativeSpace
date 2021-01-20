package application;

// DEPRICATED, PHASE OUT CLASS
public class Trade {

	private Resource input; // input resource
	private Resource output; // output resource 
	
	// Conversion rate
	private double conversion;
	
	// Constructor
	public Trade(Resource input, double conversion, Resource output) {
		this.input = input;
		this.conversion = conversion;
		this.output = output;
	}
	
	// Simple to string
	public String toString() {
		String ret = "";
		ret = ret + input.toString() + " --> " + conversion + " " + output.toString();
		return ret;
	}
	
	// Execute trade
	public void trade(double amount) {
		if (Inventory.getAmount(input) >= amount) {
			Inventory.withdraw(input, amount);
			Inventory.deposit(output, amount*conversion);
		}
		
		
	}
	
	
}

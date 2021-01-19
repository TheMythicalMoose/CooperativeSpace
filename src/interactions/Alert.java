package interactions;

public class Alert {

	static int x = 5;
	private static Alert instance = null;
	
	private Alert() {
		
	}
	
	public static Alert getInstance() {
		if (instance == null)
			instance = new Alert();
		x = 5;
		return instance;
	}
	
	public void Alert(int time, String message) {
		
	}
	
	public void draw() {
		// Draw stuff
	}
	
	
	
}

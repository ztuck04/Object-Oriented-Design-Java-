
public class Bicycle {

	// Fields
	int cadence;
	int speed;
	int gear;
	
	// Constructors
	public Bicycle() {
		cadence = 0;
		speed = 0;
		gear = 0;
	}
	
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		cadence = startCadence;
		speed = startSpeed;
		gear = startGear;
	}
	
	// Methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}
	
	public void setGear(int newValue) {
		gear = newValue;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	/**
	 * Increases the gear of a bicycle by 1.
	 */
	public void gearUp() { 
		gear++;
	}
	
	/**
	 * Decreases the gear of a bicycle by 1.
	 * 
	 * Clamps the gear value to 0 if it would be negative.
	 */
	public void gearDown() {
		gear--;
		if (gear < 0) {
			gear = 0;
		}
	}
	
	public void printState() {
		String state = """
				 Cadence = %d
				 Speed = %d
				 Gear = %d
				""";
		System.out.println(state.formatted(cadence,speed,gear));
	}
}

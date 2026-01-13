
public class LousyBikeMechanic {

	void repairBike(Bicycle brokenBike) {
		brokenBike.gear = -100;
		brokenBike = new Bicycle(100, 100, 100);
	}
	
	void printBikes(Bicycle...bicycles) {
		if (bicycles == null || bicycles.length == 0) {
			System.out.println("Nothing to check");
		}
		else {
			for (int i = 0; i < bicycles.length; i++) {
				System.out.println("Bicycle %d: Gear=%d".formatted(i, bicycles[i].gear));
			}
		}
	}
}

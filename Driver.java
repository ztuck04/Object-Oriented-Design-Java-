import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int x = 40;
		addX(12, x);
		System.out.println("x=%d".formatted(x));
		
		LousyBikeMechanic lbm = new LousyBikeMechanic();
		Bicycle myBike = new Bicycle(20, 20, 20);
		
		myBike.printState();
		lbm.repairBike(myBike);
		myBike.printState();
		
		int[] xs = {1, 20, 300};
		addXs(3, xs);
		addXsVarArgs(3);
		addXsVarArgs(3, xs);
		addXsVarArgs(3, 4, 5, 6);
		
		lbm.printBikes();
		lbm.printBikes(myBike);
		lbm.printBikes(myBike, new Bicycle());
		lbm.printBikes(null);
	}
	
	public static void addX(int val, int x) {
		System.out.println("%d + %d = %d".formatted(val, x, val+x));
		x = 20;
		System.out.println("%d + %d = %d".formatted(val, x, val+x));
	}
	
	public static void addXs(int val, int[] xs) {
		int sum = val;
		for (int x : xs) {
			sum += x;
		}
		System.out.println("%d + %s = %d".formatted(val, Arrays.toString(xs), sum));
	}
	
	public static void addXsVarArgs(int val, int...xs) {
		int sum = val;
		for (int x : xs) {
			sum += x;
		}
		System.out.println("%d + %s = %d".formatted(val, Arrays.toString(xs), sum));
	}
}

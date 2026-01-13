
public class Biker {
	Bicycle bike; 
	String name;
	
	
	public Biker(String name, Bicycle bike){
	this.name = name;
	this.bike = bike;
	}
	
	public void shiftUp(){
	bike.gear = bike.gear + 1;
	}
	public void shiftDown(){
	if (bike.gear != 0)
	bike.gear = bike.gear - 1;
	}
	public void slowDown(int amount){
	bike.applyBreak(amount);
	}
	public void speedUp(int amount){
	bike.speedUp(amount);
	}

}

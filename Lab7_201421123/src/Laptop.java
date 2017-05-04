
public class Laptop extends Product implements DataStorage, Networked{


	private double totalCapacity;
	private double usedCapacity;

	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	}

	public double getFreeCapacity() {
		System.out.println("Laptop getFreeCapacity");
		return 20000;
	}

	public void format() {

		System.out.println("format: 32");
		System.out.println("Laptop format");
	}

	public boolean isConnected() {
		return true;
	}

	public double maxSpeed() {
		System.out.println("Laptop MaxSpeed");
		return 300;
	}

	@Override
	public String getName() {
		return "Apple Laptop";
	}
	
}

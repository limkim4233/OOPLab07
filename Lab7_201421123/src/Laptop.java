
public class Laptop extends Product {

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
		System.out.println("getFreeCapacity");
		return 0;
	}

	public void format() {
		System.out.println("format");
	}

	public boolean isConnected() {
		System.out.println("isConnected");
		return false;
	}

	public double maxSpeed() {
		System.out.println("maxSpeed");
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}

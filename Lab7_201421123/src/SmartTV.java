

public class SmartTV extends Product implements Networked{
	
		

	private int channel;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public String getName() {
		return "SmartTV";
	}
	@Override
	public double maxSpeed(){
		System.out.println("MaxSpeed");
		return 24;
	}

	public boolean isConnected()
	{
		System.out.println("Connected");
		return true;
	}
}






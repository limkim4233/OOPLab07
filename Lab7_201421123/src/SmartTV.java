
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
		System.out.println("Interface MaxSpeed");
		return 24;
	}
	@Override
	public boolean isConnected()
	{
		System.out.println("Interface Connected");
		return true;
	}

}



public class SmartTV extends Product{
		
	private int channel;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public String getName() {
		return null;
	}
	
	public double maxSpeed(){
		return 24;
	}
	
	public boolean isConnected()
	{
		return true;
	}

}


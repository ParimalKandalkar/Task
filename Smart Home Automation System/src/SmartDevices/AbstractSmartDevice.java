package SmartDevices;

public abstract class AbstractSmartDevice {
	private String deviceId;
	private String deviceName;
	
	public AbstractSmartDevice(String deviceId , String deviceName) {
		
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		}

	public String getDeviceId() {
		return deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

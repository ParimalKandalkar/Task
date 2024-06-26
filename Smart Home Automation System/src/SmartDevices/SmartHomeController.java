package SmartDevices;

import java.util.ArrayList;
import java.util.List;

		public class SmartHomeController {
	
	    private List<AbstractSmartDevice> devices;

	    public SmartHomeController() {
	        this.devices = new ArrayList<>();
	    }

	    public void addDevice(AbstractSmartDevice device) {
	        devices.add(device);
	    }

	    public void turnAllOn() {
	        for (AbstractSmartDevice device : devices) {
	            device.turnOn();
	        }
	    }

	    public void turnAllOff() {
	        for (AbstractSmartDevice device : devices) {
	            device.turnOff();
	        }
	    }

	    public void controlDevice(String deviceId, String action) {
	        for (AbstractSmartDevice device : devices) {
	            if (device.getDeviceId().equals(deviceId)) {
	                switch (action) {
	                    case "turnOn":
	                        device.turnOn();
	                        break;
	                    case "turnOff":
	                        device.turnOff();
	                        break;
	                }
	            }
	        }
	    }
}

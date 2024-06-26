package SmartDevices;

public class SmartDeviceMain {

	public static void main(String[] args) {
		SmartHomeController smartHomeController = new SmartHomeController();
		UserInterface userInterface = new UserInterface(smartHomeController);
		
		userInterface.displayMenu();

	}

}

package SmartDevices;

import java.util.Scanner;

public class UserInterface {
    private SmartHomeController controller;

    public UserInterface(SmartHomeController controller) {
        this.controller = controller;
    }

	public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Smart Home Controller");
            System.out.println("1. Add Device");
            System.out.println("2. Turn All Devices On");
            System.out.println("3. Turn All Devices Off");
            System.out.println("4. Control Device");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addDeviceMenu(scanner);
                    break;
                case 2:
                    controller.turnAllOn();
                    break;
                case 3:
                    controller.turnAllOff();
                    break;
                case 4:
                    controlDeviceMenu(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addDeviceMenu(Scanner scanner) {
        System.out.println("Add Device");
        System.out.println("1. Smart Light");
        System.out.println("2. Smart Thermostat");
        System.out.println("3. Smart Camera");
        System.out.print("Select device type: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter device ID: ");
        String deviceId = scanner.nextLine();

        System.out.print("Enter device name: ");
        String deviceName = scanner.nextLine();

        switch (choice) {
            case 1:
                controller.addDevice(new SmartLight_1(deviceId, deviceName));
                break;
            case 2:
                controller.addDevice(new SmartThermostat_2(deviceId, deviceName));
                break;
            case 3:
                controller.addDevice(new SmartCamera_3(deviceId, deviceName));
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private void controlDeviceMenu(Scanner scanner) {
        System.out.print("Enter device ID: ");
        String deviceId = scanner.nextLine();

        System.out.println("Actions: turnOn, turnOff");
        System.out.print("Enter action: ");
        String action = scanner.nextLine();

        controller.controlDevice(deviceId, action);
    }
}


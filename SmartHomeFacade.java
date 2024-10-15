import java.util.Scanner;

class SmartHomeFacade {
    private LightingSystem lightingSystem;
    private ClimateControl climateControl;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade() {
        lightingSystem = new LightingSystem();
        climateControl = new ClimateControl();
        securitySystem = new SecuritySystem();
        entertainmentSystem = new EntertainmentSystem();
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        lightingSystem.turnOnLights();
        climateControl.setTemperature(22);
        securitySystem.disarmSystem();
        entertainmentSystem.playMusic("Welcome Home Playlist");
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        lightingSystem.turnOffLights();
        climateControl.turnOffClimateControl();
        securitySystem.armSystem();
        entertainmentSystem.stopMusic();
    }

    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("\nEnter command (arrive, leave, exit): ");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "arrive":
                    arriveHome();
                    break;
                case "leave":
                    leaveHome();
                    break;
                case "exit":
                    System.out.println("Exiting Smart Home System...");
                    break;
                default:
                    System.out.println("Invalid command! Please enter 'arrive', 'leave', or 'exit'.");
            }
        }

        scanner.close();
    }
}

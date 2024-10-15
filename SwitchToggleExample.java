import java.util.Scanner;

public class SwitchToggleExample {
    private boolean switchState;

    public SwitchToggleExample(boolean initialState) {
        this.switchState = initialState;
    }
    public void toggleSwitch() {
        switchState = !switchState;
    }
    public boolean isSwitchOn() {
        return switchState;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial switch state (true/false): ");
        boolean initialState = scanner.nextBoolean();


        SwitchToggleExample mySwitch = new SwitchToggleExample(initialState);

        System.out.println("Initial switch state: " + mySwitch.isSwitchOn());

        System.out.print("Do you want to toggle the switch? (y/n): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("y")) {

            mySwitch.toggleSwitch();
            System.out.println("Switch state after toggling: " + mySwitch.isSwitchOn());
        } else {
            System.out.println("Switch state remains unchanged: " + mySwitch.isSwitchOn());
        }

        scanner.close();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a light
        Light light = new Light();

        // Create command objects
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create the remote control
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton(); // Output: The light is ON

        // Turn the light off
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton(); // Output: The light is OFF
    }
}

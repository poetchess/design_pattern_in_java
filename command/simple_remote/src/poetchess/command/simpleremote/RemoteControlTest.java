package poetchess.command.simpleremote;

/**
 * Created by poetchess on 17-11-26.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonPressed();

        remote.setCommand(lightOff);
        remote.buttonPressed();

        remote.setCommand(garageOpen);
        remote.buttonPressed();

        remote.setCommand(garageClose);
        remote.buttonPressed();
    }
}

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

        remote.setCommand(lightOn);
        remote.buttonPressed();

        remote.setCommand(lightOff);
        remote.buttonPressed();
    }
}

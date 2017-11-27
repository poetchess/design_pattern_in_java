package poetchess.command.remotecontrol;

/**
 * Created by poetchess on 17-11-27.
 */
public class RemoteControlTestDrive {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");
        CeilingFan fan = new CeilingFan("living room");
        Hottub hottub = new Hottub();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightoffCommand livingRoomLightOff = new LightoffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightoffCommand kitchenLightOff = new LightoffCommand(kitchenLight);

        CeilingFanOnCommand fanOn = new CeilingFanOnCommand(fan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, fanOn, fanOff);
        remote.setCommand(3, hottubOn, hottubOff);

        System.out.println(remote);

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);

        remote.onButtonPressed(2);
        remote.offButtonPressed(2);

        remote.onButtonPressed(3);
        remote.offButtonPressed(3);

        // NoCommand, nothing happens.
        remote.onButtonPressed(4);
        remote.offButtonPressed(4);
    }
}

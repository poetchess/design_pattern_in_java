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

        CeilingFanHighCommand fanHigh = new CeilingFanHighCommand(fan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, fanHigh, fanOff);
        remote.setCommand(3, hottubOn, hottubOff);
        System.out.println(remote);

        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        System.out.println(remote);
        remote.undoButtonPressed();

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        System.out.println(remote);
        remote.undoButtonPressed();

        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
        System.out.println(remote);
        remote.undoButtonPressed();

        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
        System.out.println(remote);
        remote.undoButtonPressed();

        // NoCommand, nothing happens.
        remote.onButtonPressed(4);
        remote.offButtonPressed(4);
        System.out.println(remote);

        // Check the macro command
        // Check the macro command
        Command[] partyOn = {livingRoomLightOn, kitchenLightOff, fanHigh};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOn, fanOff};
        Command partyOnMacro = new MacroCommand(partyOn);
        Command partyOffMacro = new MacroCommand(partyOff);
        remote.setCommand(4, partyOnMacro, partyOffMacro);
        System.out.println("Pushing Macro on:");
        remote.onButtonPressed(4);
        System.out.println("Pushing Macro off:");
        remote.offButtonPressed(4);
        System.out.println(remote);
        System.out.println("Undo Macro:");
        remote.undoButtonPressed();
    }
}

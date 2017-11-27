package poetchess.command.remotecontrol;

/**
 * Created by poetchess on 17-11-27.
 */
public class RemoteControl {
    private static final int NumOfSlots = 7;
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[NumOfSlots];
        offCommands = new Command[NumOfSlots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < NumOfSlots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "\t\t" + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}

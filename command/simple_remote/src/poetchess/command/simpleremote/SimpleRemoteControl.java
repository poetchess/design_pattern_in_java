package poetchess.command.simpleremote;

/**
 * Created by poetchess on 17-11-26.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}

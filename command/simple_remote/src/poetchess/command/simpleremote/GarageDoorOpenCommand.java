package poetchess.command.simpleremote;

/**
 * Created by poetchess on 17-11-27.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.open();
    }
}

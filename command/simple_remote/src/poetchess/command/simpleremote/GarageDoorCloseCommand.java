package poetchess.command.simpleremote;

/**
 * Created by poetchess on 17-11-27.
 */
public class GarageDoorCloseCommand implements Command {
    GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.close();
    }
}

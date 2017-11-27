package poetchess.command.remotecontrol;

/**
 * Created by poetchess on 17-11-27.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }
}

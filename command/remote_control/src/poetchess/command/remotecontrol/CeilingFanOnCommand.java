package poetchess.command.remotecontrol;

/**
 * Created by poetchess on 17-11-27.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
    }
}

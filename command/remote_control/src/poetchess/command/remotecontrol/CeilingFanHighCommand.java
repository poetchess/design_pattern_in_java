package poetchess.command.remotecontrol;

/**
 * Created by poetchess on 17-11-27.
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan fan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            fan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            fan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            fan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            fan.off();
        }
    }
}

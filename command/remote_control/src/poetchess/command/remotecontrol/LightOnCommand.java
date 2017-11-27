package poetchess.command.remotecontrol;

/**
 * Created by poetchess on 17-11-27.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}

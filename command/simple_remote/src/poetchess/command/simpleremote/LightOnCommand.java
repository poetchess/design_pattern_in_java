package poetchess.command.simpleremote;

/**
 * Created by poetchess on 17-11-26.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

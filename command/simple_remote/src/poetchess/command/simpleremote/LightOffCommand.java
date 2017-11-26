package poetchess.command.simpleremote;

/**
 * Created by poetchess on 17-11-26.
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

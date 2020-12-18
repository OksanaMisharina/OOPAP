package LAB4.light;

import LAB4.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public void redo() {
        light.off();
    }
}

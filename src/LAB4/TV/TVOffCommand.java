package LAB4.TV;

import LAB4.Command;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }

    @Override
    public void redo() {
        tv.off();
    }
}

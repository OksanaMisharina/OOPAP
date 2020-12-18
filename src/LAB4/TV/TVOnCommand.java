package LAB4.TV;

import LAB4.Command;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {

        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

    @Override
    public void redo() {
        tv.on();
    }
}

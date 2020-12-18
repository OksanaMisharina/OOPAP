package LAB4.conditioner;

import LAB4.Command;

public class ConditionerOffCommand implements Command {

    Conditioner conditioner;

    public ConditionerOffCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void execute() {
        conditioner.off();
    }

    @Override
    public void undo() {
        conditioner.on();
        conditioner.temperature();
    }

    @Override
    public void redo() {
        conditioner.off();
    }
}

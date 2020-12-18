package LAB4.conditioner;

import LAB4.Command;

public class ConditionerOnCommand implements Command {
    Conditioner conditioner;

    public ConditionerOnCommand(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    @Override
    public void execute() {
        conditioner.on();
        conditioner.temperature();
    }

    @Override
    public void undo() {
        conditioner.off();
    }

    @Override
    public void redo() {
        conditioner.on();
        conditioner.temperature();
    }
}

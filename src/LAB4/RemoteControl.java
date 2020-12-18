package LAB4;

import LAB4.Command;
import LAB4.NoCommand;

import java.util.Stack;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    Stack<Command> undoCommand;
    Command redo;

    public RemoteControl() {
        this.onCommands = new Command[3];
        this.offCommands = new Command[3];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 3; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        this.undoCommand = new Stack<>();
        redo = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {

        if(!undoCommand.empty()) {

            undoCommand.peek().undo();
            redo = undoCommand.pop();
        }
    }

    public void redoButtonWasPushed(){
        undoCommand.push(redo);
        redo.redo();
    }


    @Override
    public String toString() {
        String str = new String("");
        str += "\n--------RemoteControl--------\n";

        for (int i = 0; i < onCommands.length; i++) {
            str += "[slot " + i + "] " + onCommands[i].getClass().getName().substring(onCommands[i].getClass().getName().lastIndexOf('.')) +
                    " " + offCommands[i].getClass().getName().substring(offCommands[i].getClass().getName().lastIndexOf('.')) + "\n";
        }
        return str;
    }
}

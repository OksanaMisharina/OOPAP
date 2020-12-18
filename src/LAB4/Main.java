package LAB4;

import LAB4.TV.*;
import LAB4.conditioner.*;
import LAB4.light.*;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Conditioner conditioner = new Conditioner(26);
        ConditionerOnCommand conditionerOn = new ConditionerOnCommand(conditioner);
        ConditionerOffCommand conditionerOff = new ConditionerOffCommand(conditioner);

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        TV tv = new TV();
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);

        remoteControl.setCommand(0, conditionerOn, conditionerOff);
        remoteControl.setCommand(1, lightOn, lightOff);
        remoteControl.setCommand(2, tvOn, tvOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.redoButtonWasPushed();
    }
}

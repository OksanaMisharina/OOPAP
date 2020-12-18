package LAB4.light;

import LAB4.OnOff;

public class Light implements OnOff {
    @Override
    public void on() {
        System.out.println("Light is on");
    }

    @Override
    public void off() {
        System.out.println("light is off");
    }
}

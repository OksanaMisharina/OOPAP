package LAB4.conditioner;

import LAB4.OnOff;

public class Conditioner implements OnOff {
    private int temper;

    public Conditioner(int temper) {
        this.temper = temper;
    }

    @Override
    public void on() {
        System.out.println("Conditioner is on");
    }

    @Override
    public void off() {
        System.out.println("Conditioner is off");
    }

    public void temperature(){
        System.out.println("Temperature " + temper);
    }
}

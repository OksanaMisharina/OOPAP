package LAB2;

public class TalkativeMonster extends Monster {

    @Override
    protected void name() {
        System.out.println("I'm a talkative monster");
    }

    @Override
    protected void cook() {
        System.out.println("I'm cooking");
    }

    protected void talk() {
        System.out.println("I'm talking");
    }
}

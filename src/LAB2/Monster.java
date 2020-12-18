package LAB2;

public abstract class Monster {

    final  void monsterDay(){
        name();
        catchVictim();
        cook();
        eat();
        sleep();
        lookInWindow();
        talk();
    }

    protected abstract void name();

    protected void sleep(){
        System.out.println("I'm sleeping");
    };

    protected void eat(){
        System.out.println("I'm eating");
    };

    protected void catchVictim(){

        System.out.println("I'm hunting");
    };

    protected abstract void cook();

    protected void talk(){

    }

    protected void lookInWindow(){

    };
}

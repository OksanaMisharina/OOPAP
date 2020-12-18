package LAB2;

public class SilentMonster extends Monster {
    String day;

    public SilentMonster(String day) {
        this.day = day;
    }

    protected void lookInWindow(){
        System.out.println("I'm looking out the window");
    }


    @Override
    protected void name() {
        System.out.println("I'm silent monster");
    }

    @Override
    protected void cook() {
        if(day == "Saturday" || day =="Sunday"){
            System.out.println("I'm frying");
        }
        else{
            System.out.println("I'm cooking");
        }


    }

}

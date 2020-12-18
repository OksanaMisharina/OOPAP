package LAB3;

public class ArmyFactory {
    Army army;

    public ArmyFactory(String str) {
        if (str.equals("ork"))
            this.army = new OrkArmyFactory();

        if (str.equals("elf"))
            this.army = new ElfArmyFactory();
    }

    public void myArmy() {
        army.warlord().saidName();
        army.general().saidName();
        army.soldiery().saidName();
    }
}

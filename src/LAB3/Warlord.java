package LAB3;

public abstract class Warlord {
    protected String name;
    public void saidName() {
        System.out.println(name);
    }
}

class OrkWarlord extends Warlord{
    public OrkWarlord() {
        this.name = "Ork Warlord";
    }
}

class  ElfWarlord extends Warlord{

    public ElfWarlord() {
        this.name = "Elf Warlord";
    }
}
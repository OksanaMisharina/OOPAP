package LAB3;

public abstract class General {
    protected String name;
    public void saidName() {
        System.out.println(name);
    }
}

class OrkGenerel extends General{
    public OrkGenerel() {
        this.name = "Ork General";
    }
}

class  ElfGeneral extends General{
    public ElfGeneral() {
        this.name = "Elf General";
    }
}

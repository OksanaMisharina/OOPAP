package LAB3;

public abstract class Soldiery {
    protected String name;
    public void saidName() {
        System.out.println(name);
    }
}
class OrkSoldiery extends Soldiery{
    public OrkSoldiery() {
        this.name = "Ork Soldiery";
    }
}

class  ElfSoldiery extends Soldiery{
    public ElfSoldiery() {
        this.name = "Elf Soldiery";
    }
}
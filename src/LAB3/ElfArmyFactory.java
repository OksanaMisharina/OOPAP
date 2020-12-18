package LAB3;

public class ElfArmyFactory extends Army{

    public Warlord warlord(){
        return new ElfWarlord();
    }

    public General general(){
        return new ElfGeneral();
    }

    public Soldiery soldiery(){
        return new ElfSoldiery();
    }
}

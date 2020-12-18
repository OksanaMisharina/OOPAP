package LAB2;

public class Main {
    public static void main(String[] args) {
        String day = "Saturday";
        Monster monster = new SilentMonster(day);

        monster.monsterDay();
        System.out.println();

        monster = new TalkativeMonster();
        monster.monsterDay();
    }
}


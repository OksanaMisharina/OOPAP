package lAB1;

public class Red implements Colourable {

    @Override
    public void printColor() {
        System.err.println("Красный цвет");
    }
}

class Blue implements Colourable{

    @Override
    public void printColor() {
        System.out.println("Синий цвет");
    }
}

class Yellow implements Colourable{

    @Override
    public void printColor() {
        System.out.println("Желтый цвет");
    }
}

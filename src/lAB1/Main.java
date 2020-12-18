package lAB1;


public class Main {
    public static void main(String[] args) {
        Context context = new Context(new Red());
        context.executeOperation();

        context.setColourable(new Blue());
        context.executeOperation();

        context.setColourable(new Yellow());
        context.executeOperation();

    }
}

package lAB1;

public class Context {
    Colourable colourable;

    public Context(Colourable colourable) {
        this.colourable = colourable;
    }

    public void setColourable(Colourable colourable){
        this.colourable = colourable;
    }

    public void executeOperation(){
        this.colourable.printColor();
    }
}

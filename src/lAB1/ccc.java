package lAB1;


import java.util.HashSet;

public class ccc {
    @Override
    public String toString() {
        return "ccc{" +
                "a=" + a +
                '}';
    }

    public ccc() {
        a= new HashSet<>();
    }

    HashSet<Integer> a;

    public HashSet<Integer> getA() {
        return a;
    }

    public void setA(HashSet<Integer> a) {
        this.a = a;
    }
}
class vvv{

    void setBooks(ccc author, int book){
        author.getA().add(book);

    }
}

//can we make multiple abstract method in abstract class : 
abstract class Mahindra {
    abstract void tyre();

    abstract void mirror();

    abstract void seat();
}

class Thar extends Mahindra {
    void tyre() {
        System.out.println("mahindra type ");
    }

    void mirror() {
        System.out.println("mahindra mirror");
    }

    void seat() {
        System.out.println("mahindra seat");
    }
}

public class MultipleAbstractMethod {
    public static void main(String[] args) {
        Thar t = new Thar();
        t.tyre();
        t.mirror();
        t.seat();
    }
}

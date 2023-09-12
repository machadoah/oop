import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.setI(5);
        a.showI();

        System.out.println("-----------------------");

        B b = new B();
        b.setI(10);
        b.setJ(8);
        b.showI();
        b.showJ();
        b.soma();

        System.out.println("-----------------------");

        A a2 = new B();
        a2.setI(77);
        a2.showI();

        System.out.println("-----------------------");

        A a3 = b;

        List<A> as = new ArrayList<>();


    }
}

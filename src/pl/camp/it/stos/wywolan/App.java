package pl.camp.it.stos.wywolan;

public class App {
    public static void main(String[] args) {
        a(0);
        //r();
    }

    public static void a(int z) {
        b(z);
    }

    public static void b(int z) {
        c(z);
    }

    public static void c(int z) {
        d(z);
    }

    public static void d(int z) {
        /*double x = 5 / z;
        System.out.println(x);*/
        a(z);
    }

    public static void r() {
        r();
    }
}

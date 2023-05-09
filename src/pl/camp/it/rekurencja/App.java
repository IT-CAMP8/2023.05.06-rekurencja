package pl.camp.it.rekurencja;

public class App {
    public static void main(String[] args) {
        System.out.println(silnia(5));
        System.out.println(fibbonacci(10));
        System.out.println(power(5, 10));
        try {
            silnia(0);
            //fibbonacci(-5);
            //(4, -10);
        } catch (IncorrectParameterException e) {
            System.out.println("O kurde, polecial blad, ale w sumie to nic sie nie stalo !!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("cos");
        } catch (ArithmeticException e) {
            System.out.println("Robimy cos jeszcze innego !!");
        } catch (Exception e) {
            System.out.println("POLECIAL TAKI I TAKI BLAD !!! BARDZO WAZNE DO NAPRAWY !!!");
        } finally {
            System.out.println("ZAWSZE !!");
        }

        //???
        //??

        //??

        System.out.println("Koniec programu !!");
    }

    public static int silnia(int x) {
        if(x < 1) {
            throw new IncorrectParameterException("Liczba nie moze byc mniejsza od 1 !!");
            //throw new NullPointerException();
        }
        if(x == 1) {
            return 1;
        }
        return x * silnia(x - 1);
    }

    public static int fibbonacci(int number) {
        if(number < 1) {
            throw new IncorrectParameterException("Element ciagu nie moze byc mniejszy od 1 !!");
        }
        if(number == 1) {
            return 0;
        }
        if(number == 2) {
            return 1;
        }
        return fibbonacci(number - 1) + fibbonacci(number - 2);
    }

    public static int power(int p, int w) {
        if(w < 1) {
            throw new IncorrectParameterException("Wykladnik nie moze byc mniejszy od 1 !!");
        }
        if(w == 1) {
            return p;
        }
        return p * power(p, w-1);
    }
}

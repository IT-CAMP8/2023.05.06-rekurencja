package pl.camp.it.rekurencja;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        try {
            start();
        } catch (IncorrectArgumentException e) {
            System.out.println("Cos sie zepsulo !!");
        } catch (NumberFormatException e) {
            System.out.println("To nie jest liczba !!!");
        }

        //start();
    }

    public static void start() throws IncorrectArgumentException {
        Scanner scanner = new Scanner(System.in);
        int liczba = Integer.parseInt(scanner.nextLine());
        System.out.println(silnia(liczba));
    }

    public static int silnia(int x) throws IncorrectArgumentException {
        if (x < 1) {
            throw new IncorrectArgumentException();
        }
        if (x == 1) {
            return 1;
        }
        return x * silnia(x - 1);
    }
}

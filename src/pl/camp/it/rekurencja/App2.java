package pl.camp.it.rekurencja;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l;
        while(true) {
            try {
                String liczba = scanner.nextLine();
                l = Integer.parseInt(liczba);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wpisz poprawna liczbe !!");
            }
        }
        System.out.println(l);
    }
}

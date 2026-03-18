package a03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la primera hora (h m s):");
        HoraExacta h1 = new HoraExacta(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(h1.toString());

        System.out.println("Dime la segunda hora (h m s):");
        HoraExacta h2 = new HoraExacta(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(h2.toString());

        if (h1.equals(h2)) {
            System.out.println("Las horas son iguales");
        } else {
            System.out.println("Las horas son distintas");
        }
    }
}

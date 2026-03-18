package a02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la hora, minutos y segundos:");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        HoraExacta hora = new HoraExacta(h, m, s);
        System.out.println(hora.toString());

        System.out.println("Dime qué segundos quieres que tenga:");
        hora.setSegundos(sc.nextInt());

        System.out.println("Dime qué minutos quieres que tenga:");
        hora.setMinutos(sc.nextInt());

        System.out.println("Dime qué horas quieres que tenga:");
        hora.setHora(sc.nextInt());

        System.out.println("Después de los cambios: " + hora.toString());

        hora.inc();
        System.out.println("Hora tras incrementar un segundo: " + hora.toString());
    }
}

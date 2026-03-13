package a01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la hora y minutos:");
        Hora h = new Hora(sc.nextInt(), sc.nextInt());
        System.out.println(h.toString());

        System.out.println("Dime que minutos quieres que tenga");
        h.setMinutos(sc.nextInt());

        System.out.println("Dime que horas quieres que tenga");
        h.setHora(sc.nextInt());

        System.out.println(h.toString());
    }
}

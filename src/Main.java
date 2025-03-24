import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite širinu:");
        double sirina = input.nextDouble();
        System.out.println("Unesite dužinu:");
        double duzina = input.nextDouble();

        System.out.println("površina pravokutnika je "+sirina*duzina);


        input.close();

    }
}
import java.util.Scanner;

public class Temp {

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite temperaturu");
        double temp = input.nextDouble();
        double kelvin = (temp*(1.8))+32;
        double farh = temp + 273.15;


        System.out.println("Temperatura u kelvinima je "+ kelvin);
        System.out.println("Temperatura u farh je " + farh);


    input.close();
    }
}

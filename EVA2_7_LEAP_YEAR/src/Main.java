import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, resi4,resi100, resi400;

        System.out.println("Introduce el año: ");
        year = input.nextByte();

        resi4 = year % 4; //resuduo de dividir el año entre 4
        resi100 = year % 100; //residuo de dividir el año entre 100
        resi400 = year % 400; //residuo de dividir el año entre 400

        if((resi4 == 0) && ((resi100 != 0) || (resi400 == 0)))
            System.out.println("El año " + year + " es bisiesto");
        else
            System.out.println("El año " + year + " no es bisiesto");


    }
}
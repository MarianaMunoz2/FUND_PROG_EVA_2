import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int talla;
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE TU TALLA");
        talla = input.nextInt();
        if((talla == 48))
            System.out.println("Tu talla es xlarge");
        else if ((talla == 44))
            System.out.println("Tu talla es large");
        else if ((talla == 42))
            System.out.println("Tu talla es medium");
        else if ((talla == 29))
            System.out.println("Tu talla es small");
        else
            System.out.println("Tu talla es un valor DESCONOCIDO");

    }
}
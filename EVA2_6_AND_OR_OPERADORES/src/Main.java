import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int califa;

        System.out.println("Introduce la calificación: ");
        califa = input.nextInt();

        //validar una califa es mayor o igual 0 y la califa es menor o igual a 100

        if((califa >= 0) && (califa <=100)){ //valor válido
            System.out.println("La calificación " +  califa + " es válida");
            if(califa >= 70)
                System.out.println("APROBADO");
            else
                System.out.println("NO ACREDITADO");
        }else{
            System.out.println("La calificación " + califa + " no es válida");
        }



    }
}
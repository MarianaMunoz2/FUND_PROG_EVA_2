import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE TU CALIFICACIÓN:");
        califa = input.nextInt();
        if((califa >= 90) && (califa <= 100))
            System.out.println("TU CALIFICACIÓN ES: A");
        else if ((califa >= 80) && (califa <= 89))
            System.out.println("TU CALIFICACIÓN ES: B");
        else if ((califa >= 70) && (califa <= 79))
            System.out.println("TU CALIFICACIÓN ES: C");
        else if ((califa >= 60) && (califa <= 69))
            System.out.println("TU CALIFICACIÓN ES: D");
        else if (califa <= 59)
            System.out.println("TU CALIFICACIÓN ES: F," + " MÁS SUERTE A LA PRÓXIMA");
    }
}
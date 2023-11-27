import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        do {
            System.out.println("Adivina el número: ");
            num = in.nextInt();
        }while (num != 100);
        System.out.println("ADIVINASTE!");
    }
}

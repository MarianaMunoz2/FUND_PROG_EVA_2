import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valor = 100;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Introduce el numero que piensas es el correcto");
            int num = input.nextInt();
            if(num == valor)
                System.out.println("Adivinaste!");
                break;
        }
    }
}
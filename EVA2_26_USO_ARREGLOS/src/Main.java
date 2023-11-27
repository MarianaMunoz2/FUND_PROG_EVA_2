import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] platillos = new String[10];

        platillos[0] = "Tacos";
        platillos[1] = "KeniaOs";
        platillos[2] = "KimLoaiza";
        platillos[3] = "BryanSK";
        platillos[4] = "EddySK";
        platillos[5] = "JDPantoja";
        platillos[6] = "Bellakath";
        platillos[7] = "DaniFlow";
        platillos[8] = "DannaPaola";
        platillos[9] = "AlexPonce";
        double[] precio = {20, 50, 60, 25, 80, 90, 55, 30, 100, 400};

        System.out.println("----------MENU----------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + " - " + platillos[i] + ": $" + precio[i]);
        }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Que quieres ordenar?");
        opc = input.nextInt();
        System.out.println("Cuantas ordenes quieres?");
        cant = input.nextInt();
        System.out.println("El costo de tu pedido es: $" + (cant * precio[opc]));
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Capturar calificaciones de un grupo y generar el promedio:
        int sumaCalifas = 0;
        int noCalifas;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de calificaciones: ");
        noCalifas = input.nextInt();

        for (int i = 1; i <= noCalifas; i++) {
            System.out.println("Introduce la calificación: ");
            int califa = input.nextInt();
            //sumatoria de calificaciones
            //acumuladores
            sumaCalifas = sumaCalifas + califa;
        }
        //el promedio es sumaCalifas/noCalifas, pero ambos son enteros
        double mean = sumaCalifas / noCalifas * 1.0;
    }
}
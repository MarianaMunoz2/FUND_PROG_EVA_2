import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crear un arreglo de 15 elementos
        int[] arreglo = new int[15];
        //Llenarlo con valores aleatorios entre 0 y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Que numero buscas?");
        num = input.nextInt();
        //Busqueda secuencial por fuerza bruta
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == num) { //valor encontrado
                System.out.println("Valor encontrado en la posicion " + i);
                break;
            }
        }
    }
}
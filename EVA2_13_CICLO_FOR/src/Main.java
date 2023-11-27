
public class Main {
    public static void main(String[] args) {
        //for significa desde

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("----------");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        //imprimir los numeros pares de 0 a 100, incluyendo 0 y 100
        System.out.println("----------");
        for (int i = 0; i <= 100; i+= 2) {
            System.out.print(i + " - ");


        }

    }
}
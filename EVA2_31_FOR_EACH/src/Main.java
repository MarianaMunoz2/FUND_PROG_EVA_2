public class Main {
    public static void main(String[] args) {
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int) (Math.random()*100);
        }

        for (int valor:
                arreglo) {
            System.out.print("[" + valor + "]");
        }
        String cadenas[] = new String[5];
        cadenas[0] = "hola";
        cadenas[1] = ";";
        cadenas[2] = "mundo";
        cadenas[3] = " ";
        cadenas[4] = "!!";

        for (String cade:
                cadenas) {
            System.out.print(cade);
        }
    }
}
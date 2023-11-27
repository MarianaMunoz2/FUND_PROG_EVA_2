
public class Main {
    public static void main(String[] args) {

        int[] arreglo = new int[10];
        //Como se usa, el acceso es por indices
        //El primer elemento del arreglo esta en la posicion 0
        //Ultimo elemento es N - 1, N es el tamano del acceso
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        System.out.println(arreglo[3]);
        ///
        String[] arregloCade = new String[5];
        arregloCade[0] = "Hola";
        arregloCade[1] = " ";
        arregloCade[2] = "Mundo";
        arregloCade[3] = " ";
        arregloCade[4] = "Cruel!";
        System.out.println(arregloCade[0]);
        System.out.println(arregloCade[1]);
        System.out.println(arregloCade[2]);
        System.out.println(arregloCade[3]);
        System.out.println(arregloCade[4]);


    }
}
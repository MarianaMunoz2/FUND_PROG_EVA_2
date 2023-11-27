public class Main {
    public static void main(String[] args) {
        //fila, columna
        int[][] matriz = new int[3][];

        matriz[0] = new int[10];
        matriz[1] = new int[5];
        matriz[2] = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*100);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}
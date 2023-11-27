public class Main {
    public static void main(String[] args) {

        double var1, var2, resu;

        var1 = 20;
        var2 = 2;

        //operador +
        //suma
        //concatenar es unir cadenas de texto

        resu = var1 + var2;
        System.out.println("SUMA: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var1 = " + var2);
        System.out.println("Var1 + var2 = " + resu);
        //resta
        resu = var1 - var2;
        System.out.println();//salto de linea (enter)
        System.out.println("RESTA: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var1 = " + var2);
        System.out.println("Var1 - var2 = " + resu);
        //multiplicacion
        //operador *
        resu = var1 * var2;
        System.out.println();//salto de linea (enter)
        System.out.println("MULTIPLICA: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var1 = " + var2);
        System.out.println("Var1 X var2 = " + resu);
        //division
        //operador /
        resu = var1 / var2;
        System.out.println();//salto de linea (enter)
        System.out.println("DIVIDE: ");
        System.out.println("Var1 = " + var1);
        System.out.println("Var1 = " + var2);
        System.out.println("Var1 / var2 = " + resu);

        //Precedencia de operaciones:
        int a = 5, b = 3, c = 2;
        int resultado = (a * b) + (a - c) * (b - a);//(15)+(3)*(-2)
        System.out.println("resultado precedencia: " + resultado);

        
    }
}
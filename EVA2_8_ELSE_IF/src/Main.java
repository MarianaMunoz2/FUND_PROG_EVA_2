import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CAPTURAR EL MES EN FORMATO NUMÉRICO (ENTERO)
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE EL MES");
        mes = input.nextInt();
        //if((mes >= 1) && (mes <= 12)){ //if(mes > 0) && (mes < 13))
            if(mes == 1)
                System.out.println("ENERO");
            else if (mes == 2)
                System.out.println("FEBRERO");
            else if (mes == 3)
                System.out.println("MARZO");
            else if (mes == 4)
                System.out.println("ABRIL");
            else if (mes == 5)
                System.out.println("MAYO");
            else if (mes == 6)
                System.out.println("JUNIO");
            else if (mes == 7)
                System.out.println("JULIO");
            else if (mes == 8)
                System.out.println("AGOSTO");
            else if (mes == 9)
                System.out.println("SEPTIEMBRE");
            else if (mes == 10)
                System.out.println("OCTUBRE");
            else if (mes == 11)
                System.out.println("NOVIEMBRE");
            else if (mes == 12)
                System.out.println("DICIEMBRE");
            else
                System.out.println("EL NÚMERO NO ES UN MES VÁLIDO");
    }
}
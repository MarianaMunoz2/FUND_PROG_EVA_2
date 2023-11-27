import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las iniciales de tu carrera: ");
        String carrera = sc.nextLine();

        switch (carrera){
            case "isc":
                System.out.println("Ingenieria en Sistemas Computacionales");
                break;
            case "inf":
                System.out.println("Ingeniería Informática");
                break;
            case "ind":
                System.out.println("Ingenieria Industrial");
                break;
            case "idi":
                System.out.println("Ingeniería en Diseño Industrial");
                break;
            case "la":
                System.out.println("Licenciatura en Administración");
                break;
            case "ige":
                System.out.println("Ingeniería en Gestión de Empresas");
                break;
            case "arq":
                System.out.println("Arquitectura");
                break;
            default:
                System.out.println("Carrera no válida");
        }
    }
}

import java.util.Scanner;

public class Main {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String usr, passw;

        do {
            System.out.println("Usuario: ");
            usr = in.nextLine();
            System.out.println("Contraseña: ");
            passw = in.nextLine();
        }while (!usr.equals(NOMBRE_USUARIO) || !passw.equals(PASSWORD));
        System.out.println("Bienvenido bro");
    }
}
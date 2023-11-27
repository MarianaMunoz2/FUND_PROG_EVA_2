public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i == 10)
                break;
            System.out.print(i + ", ");
        }
        for (int i = 0; i < 15; i++) {
            if (i == 10)
                continue;
            System.out.println(i + ", ");
        }
    }
}
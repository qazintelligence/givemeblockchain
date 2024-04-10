import java.util.Scanner;

public class five {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        reverse(sc, N);

        sc.close();
    }

    public static void reverse(Scanner scanner, int n) {
        if (n > 0) {
            int element = scanner.nextInt();
            reverse(scanner, n - 1);
            System.out.print(element + " ");
        }
    }
}


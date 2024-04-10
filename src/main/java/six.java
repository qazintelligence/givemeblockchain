import java.util.Scanner;

public class six {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        printReversedSequence(sc, N);
        sc.close();
    }

    public static void printReversedSequence(Scanner sc, int n) {
        if (n > 0) {
            String str = sc.nextLine();
            printReversedSequence(sc, n - 1);
            System.out.println(str);
        }
    }
}


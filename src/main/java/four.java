import java.util.Scanner;
public class four {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(sum(b,n));

    }

    public static int sum(int b, int n){
        int summ = 1;
        if (n == 0){
            return 1;
        }
        for (int i = 0; i<n; i++){
            summ *= b;
        }
        int sm = 0;
        return  sm= summ + sum(b, n-1);
    }

}

import java.util.Scanner;
public class Second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int nn = sc.nextInt();
        System.out.println(sum(arr,nn));

    }

    public static int sum(int [] ar, int n){
        if (n == 0){
            return 0;
        }
        return ar[n-1]+sum(ar, n-1);
    }

}

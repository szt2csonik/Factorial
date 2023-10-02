import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int f=1;
        for (int i = 1; i <= n1; i++) {
           f=f*i;
        }
        System.out.println(f);

        System.out.println("enter another number: ");
        int n2=scanner.nextInt();
        long f2 = calculateFactorial(n2);
        System.out.println(f2);
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
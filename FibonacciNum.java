import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i = 1; i <= n; ++i){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        sc.close();
    }
}

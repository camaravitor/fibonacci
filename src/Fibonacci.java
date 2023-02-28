import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (isFibonacci(n)) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1, c = 1;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return (c == n);
        
    
    }

}

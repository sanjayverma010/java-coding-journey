import java.util.*;

class Factorial {
    int fact = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        Factorial f = new Factorial();
        int result = f.calfact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    int calfact(int no) {
        if (no > 1) {
            fact = fact * no;
            calfact(no - 1);
        }
        return fact;
    }
}
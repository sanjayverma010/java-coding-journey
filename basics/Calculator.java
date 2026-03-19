import java.util.*;

class NewCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No 1");
        int no1 = sc.nextInt();

        System.out.println("Enter No 2");
        int no2 = sc.nextInt();

        System.out.println("Enter the symbol (+, -, *, /):");
        String sym = sc.next();  // Fixed method name

        int res;

        switch (sym) {
            case "+":
                res = no1 + no2;
                System.out.println(res); // Fixed 'System'
                break;

            case "-":
                res = no1 - no2;
                System.out.println(res);
                break;

            case "*":
                res = no1 * no2;
                System.out.println(res);
                break;

            case "/":
                if (no2 != 0) {
                    res = no1 / no2;
                    System.out.println(res);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid user input");
                break;
        }

        sc.close();  // Always a good practice to close Scanner
    }
}

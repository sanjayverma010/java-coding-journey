   // CREATING COMPILE TIME (CHECKED) EXCEPTION
import java.util.Scanner;

class CustomExceptionClass extends Exception {
 
    CustomExceptionClass() {
        super("you are under age");
    }

    CustomExceptionClass(String msg) {
        super(msg);
    }

}

class test {
    public static void main(String[] args) // throws CustomExceptionClass
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {

            if (age < 18) {
                throw new CustomExceptionClass("you are not valid person");
            } else {
                System.out.println("you are valid person");
            }
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
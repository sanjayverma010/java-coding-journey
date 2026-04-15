// CREATING CUSTMISE EXCEPTION FOR THE PROJECT THIS IS NOT PRIDIFIND EXCEPTION 
// THIS IS A RUN TIME EXCEPTION BECOUSE IT IS BETTER THAN COMPILE TIME EXCEPTION 
import java.util.Scanner;
class YoungerAgeException extends RuntimeException {
    YoungerAgeException( String msg)
    {
        super(msg);
    }
}

class Voting {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yuor age");
        int age = sc.nextInt();

        if (age < 18) {
            throw new YoungerAgeException("you are not eligibal for vote");
        } else {
            System.out.println("voting sucsess");

        }
        
    }
}

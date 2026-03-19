import java.util.*;

class Revers{
             public static void main(String[] args){
             Scanner sc = new Scanner (System.in);
             int n = sc.nextInt();
             System.out.println("what is your number n")
             int rem, rev = 0;
             while(n!=0){
                    rem=n%10;
                    rev=rev*10+rem;
                     n= n/10;
                   }
                   System.out.println(rev);
           }
  }

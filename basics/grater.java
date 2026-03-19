// class Grater {
//              public static void main(String[] args){
//                   int a=45;
//                   int b= 90;
//                   int c= 20;
                 
//               if(a>b && a<c)
//               {
//                        System.out.println("a is greatest number: " + a);
//                       } else if (b > a && b > c) { 
//                             System.out.println("b is greatest number: " + b);
//                            } else {
//                                     System.out.println("c is greatest number: " + c);
//                            }
    
//     }
//  } 

class Number {
    public static void main(String[] args) {
        int a = 79;
        int b = 56;
        int c = 67;

        if (a > b) {
            if (a > c) {
                System.out.println("a is the greatest number: " + a);
            } else {
                System.out.println("c is the greatest number: " + c);
            }
        } else if (b > c) {
            System.out.println("b is the greatest number: " + b);
        } else {
            System.out.println("c is the greatest number: " + c);
        }
    }
}

// Static variable is a variable that belongs to the class rather than to any specific instance of the class. It is shared among all instances of the class and can be accessed without creating an object of the class. Static variables are declared using the static keyword.
// without inheriting the static variable can be accessed by using the class name and dot operator.


// first and second rule .... 
// 1 static mathods belongs to the class not object 
// 2 static mathos can be asscess directly usingh class name without creating object of class

class staticvariable {
    static int a = 10;
}

class demo {
    public static void main(String[] args) {

        System.out.println(staticvariable.a);

    }
}
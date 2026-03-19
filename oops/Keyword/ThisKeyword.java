class thiskey {
   int n;
   void set(int n){
       this.n = n;
       // n = n ; this n is instance variable and x is local variable. 
       // so when " n = x;" it print the values but when use n = n it can print zero "0"
       // then we use "this" keyword to solve this problem. "this" keyword is used to refer current class instance variable.
       // so when we use "this.n = n;" it can print the values because "this.n" is instance variable and "n" is local variable. 
   }

    void show(){
         System.out.println(n);
    }
}

  class thiskey1{
    public static void main(String[] args) {
        thiskey t= new thiskey();
        t.set(10);
        t.show();
    }
}
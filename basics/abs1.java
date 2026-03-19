abstract class Vehicle {
   abstract void start();
}

class Car extends Vehicle {
   void start(){
      System.out.println("car is sart");
   }
}

class scooter extends Vehicle {
    void start(){

       System.out.println("scooter is start");
    }

   public static void main(String[] args){

     Car C = new Car();
         C.start();

    scooter s = new scooter();
            s.start();
        
    }
}

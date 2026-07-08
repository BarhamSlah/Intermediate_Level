public class Factory {

   public static void main() {
       
        Car car = new Car();
        Nissan nissan = new Nissan();
        BMW bmw = new BMW();

        System.out.println("Car value: " + car.value);
        System.out.println("Nissan value: " + nissan.value);
        System.out.println("BMW value: " + bmw.value);
        
        nissan.start();
        bmw.start();
        car.start();
        
    }
}

////////////////////////////

public class Car {   // THIS IS A PARENT CLASS 

    boolean value;

    Car () {
        this.value = true;   
    }

 // agadarba agar la classy parent constructort bakar hena nabet argumenty habet agar habet dabet super bakar beny
   
    void start () {
       
        System.out.println("Your car is working");
       
    }
}

/////////////////////////

public class Nissan extends Car {   // THIS IS A CHILD CLASS 
// LERA AWAY LA CLASSY PARENT HAYA LA CLASSY CHILDISH HAYA
}

/////////////////

public class BMW extends Car {   // THIS IS A CHILD CLASS
// LERA AWAY LA CLASSY PARENT HAYA LA CLASSY CHILDISH HAYA
}

*********************************************************************************************************************

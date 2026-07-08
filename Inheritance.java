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

public class Car {

    boolean value;

    Car(){

        this.value = true;

    }

    void start (){
        System.out.println("Your car is working");
    }
}

//////////////////////

 class Nissan extends Car{

}

/////////////////

public class BMW extends Car{

}


SubClass = ChildClass  &  SuperClass = ParentClass

lera ema basy Inheritance dakain :

ema constructor man la parent drwst dakain agar :

1- agar parametery nabw awa dabet lanaww constructor valuey ba variable bdain

2- agar paremetery habw awa la subclass 2 shewazman haya bo away valuey ba variable bdain lanaw constructor

1- super (lera valuey danwsy)
** la katy drwst krdny object hich nanwsy lanaw ()   

2- super (nawy variable danwsy)
** la katy drwst krdny object valuey lanaw () danwsy   

***************************************************************************************************************************
   
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





   

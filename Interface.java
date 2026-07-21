Interface very similiar to abstract class 
  
Interface : 
  
1-  In Interface you can write what to do not how to do 
  
2-  Subclass can have multiple Interface but not Superclass

3-  When you declare variable in interface you can't change value of it 
  
*************************************************************************************
Class to Class: Use extends (A class inherits from another class).
  
Class to Interface: Use implements (A class fulfills the contract of an interface).
  
Interface to Interface: Use extends (An interface can expand upon another interface).
**************************************************************************************
// THIS IS A EXAMPLE OF INTERFACE

public class Main {
    public static void main(String[] args) {

Dog dog = new Dog();
Cat cat = new Cat();
Mouse mouse = new Mouse();

dog.predator();
cat.predator();
cat.prey();
mouse.prey();

    }
}
//////////////////////  
 public interface Predator {

    void predator();

} 
///////////////////////
public interface Prey {

    void prey();

}
//////////////////////
public class Dog implements Predator {

    @Override
    public void predator(){
        System.out.println("The dog always predator");
    }

}
/////////////////////////
public class Mouse implements Prey {

    @Override
    public void prey(){
        System.out.println("The mouse Always prey");
    }

}
///////////////////////////
public class Cat implements Predator , Prey{

    @Override
    public void prey(){
        System.out.println("The cat at here is prey");
    }

    @Override
    public void predator(){
        System.out.println("The cat at here is predator");
    }

}
*****************************************************************************************************************
public class Main {
    public static void main(String[] args) {

        Falcon falcon = new Falcon();
        Cocktail cocktail = new Cocktail();
        Owl owl = new Owl();

        Bird[] birds = {falcon, cocktail, owl };

        for (Bird bird : birds) {
            bird.fly();
        }
    }
    }
//////////////////////
public interface Bird {

    void fly();

}
////////////////////////
public class Falcon implements Bird{

    @Override
    public void fly(){
        System.out.println("The falcon is flying");
    }

}
/////////////////////////
public class Cocktail implements Bird{

    @Override
    public void fly(){
        System.out.println("The cocktail is flying");

    }
}
//////////////////////////
public class Owl implements Bird {

    @Override
    public void fly(){
        System.out.println("The owl is flying");
    }

}
***********************************************************************************************************************************

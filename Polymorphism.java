// WE HAVE 2 TYPES OF POLYPORPHISM

1- STATIC POLYMORPHISM (COMPILE TIME) (METHOD OVERLOADING)

2- DYNAMIC POLYMORPHISM (RUNTIME) (METHOD OVERRIDING)
***************************************************************************************************
// I CREATED 3 SUBCLASS THAT HAS SAME ABSTRACT METHOD AS YOU KNOW ALL OF THEM HAS DIFFERENT OUTPUT
public class Main {
    public static void main(String[] args) {

        Falcon falcon = new Falcon();
        Cocktail cocktail = new Cocktail();
        Owl owl = new Owl();

        Bird[] birds = {falcon, cocktail, owl };

        for (Bird bird : birds) {
            bird.fly();
        }
      
      // THIS IS INSTEAD YOU WRITE MANY TIME OF 
      // falcon.fly();
      //cocktail.fly();
      //owl.fly();
      
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
*********************************************************************************************************************************  
  

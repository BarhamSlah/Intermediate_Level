THE MOST IMPORTANT NOTE IS ALL THING SHOULD BE IN CLASS (THE IS ONE OF THING THAT SEPARATE JAVA FROM OTHER LANGUAGES) 

OOP regayaka bo rekxstny code bo away xoman bparezin la nwsini codey dwbara w narek 

4 bnamay saraky haya ka marja bizany bo control krdny OOP

1- Encapsulation : kary parastny dataya lanaw Class la dastkary daraky 

2- Inheritance : kary gwastnaway taibat mandy la Classy bawk bo Classy mndal

3- Polymorphism :  wargrtny chand shewazeky jyawaz bo yak method bo nmwna farmany bro bdait w har shtek ba shewazy xoy je ba jey daka wakw sayara w motor w hitr

4- Abstraction : shardnaway detail w pshandany shty grng 

******************************************************************************************************************************************

Lerada basy jyawazy newan Class w Object dakain 

Class : aw naxshayaya (qallbaya) ka objecty lasar drwst dakret bo har shtek tanha yak Class drwwst dakret 

Object : aw shtaya ka lasar Class drwst dakret w bo har Classek datwanret chandan Object drwst bkret 

Agar Attributes sifatakany Object bn - Method aw karanaya ka Object datwanet anjamyan bdat    

// nabet hamw codekan la yak class bnwsin awa hallaya bo nmwna agar keshayakt bo drwst bet yan btawe gorankary bkait awa tanha aw Classa 
  
// wa jwantra Classakan la filey jyawaz dabney awa rek w pektra

/* peshtr labar away hamw codekan la yak Class bwn awa keshaman nabw ballam esta labar away la Classy jyawzn boya katek 
  damanawe shtek la Classek bo Classeky tr bgwazinawa dabet sarata nawy Object bnwsin */

*****************************************************************************************************************************************
  
public class Challenge {
   public static void main(String[] args) {

Car car1 = new Car();

car1.company= "Toyota";
car1.model = "Pick Up";
car1.color = "White";
car1.number =12425 ;
car1.price = 18_000 ;
car1.year = 2013 ;

System.out.println("This car is " + car1.company + " " + car1.model + " with " + car1.number + " number.");
System.out.println("It is a " + car1.year + " " + car1.color + " car and costs $" + car1.price);

car1.start();
car1.stop();

    }
}  

//////

public class Car {

  String company;
  String model;
  String color;
  int year;
  int price;
  int number;

  void start(){
      boolean turnOn = true;
      System.out.println("Is your car working ? " + turnOn);
  }

  void stop(){
    boolean turnOn = false;
    System.out.println("Is your car working ? " + turnOn);
  }

}

************************************************************************************************************************************

  

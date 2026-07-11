Method Override: when you write a method in SubClass that already has in SuperClass but there is a different that is the task in the method
but you should inheritance it and same name of method 

that is not necessarily but good if you do it :
write @methodoverriding before the method that you wanna overriding it

****************************************************************************************************************************  
//   THIS METHOD IS IN THE SUPERCLASS
 void start(){
    System.out.println("this car is going");
  } 

// THIS METHOD IS IN THE SUBCLASS
@Override
void start(){
    System.out.println("this car is flying");
 }

***************************************************************************************************************************

 public class Info {
    public static void main() {

Person person1 = new Person ("Barham " , "Kurdistan" , "Student " , 18);
Person person2 = new Person ("Mawsm" , "Kurdistan" , "Jobless" , 21);
Person person3 = new Person ("Daiki Zain" , "Kurdistan" , "Uztaz" , 26);

System.out.println(person1);
System.out.println(person2);
System.out.println(person3);

    }
}

////////////////////////

public class Person {

    String name;
    String fromWhere;
    String job;
    int age;

    Person(String name, String fromWhere, String job, int age){
        this.name = name;
        this.fromWhere = fromWhere;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString(){
        return "The name is " + this.name + "\n" + "The person is " + this.age + " years old \n" +   "The person is from " + this.fromWhere + "\n" +                "The person is a " + this.job + "\n";

    }
}

**************************************************************************************************************************************

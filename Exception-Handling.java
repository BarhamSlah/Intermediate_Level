/*
      finally always execute
      when you just write Exception you don't select the error so the user doesn't know what is the problem
      So always select specific exception
      put things inside try
      you should write letter or word just after Exception in catch
      Never leave catch block empty


      Golden Rule: If you can prevent an error with a simple `if` statement, use `if`.
        But if the error is related to an external system (like a database or a file) that you don't have control over,
        then use `try-catch`.
*/


      try{
              System.out.println(1 / 0);
      } catch (ArithmeticException error){
        System.out.println("You can't divide by zero");
      } finally {
              System.out.println("finally always execute");
      }
***************************************************************************
              try {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your number ");
      double yourNumber = scanner.nextDouble();

       }catch (InputMismatchException e){
         System.out.println("You should enter number");
       }
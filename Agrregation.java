public class Main{
   public static void main() {

       Book book1 = new Book("Atomic Habit", 298);
       Book book2 = new Book("The Power Of Now", 302);
       Book book3 = new Book("Gela Piaw", 280);

       Book[] books = {book1 , book2 , book3};

       Library library = new Library("Ashty" , 2011 , books);


      library.displayInfo();

   }
        }
/////////////////////////
public class Library {

String name;
int publish;
Book[] books;

Library (String name, int publish, Book[] books){
   this.name = name;
   this.publish = publish;
   this.books = books;
}

public void displayInfo() {
    System.out.println(this.name + " library is publish in " + this.publish);
    System.out.println("Books available : ");

    for (Book book : books)
        System.out.println(book.demonstrateInfo());
}

}
//////////////////////////
public class Book {

    String title;
    int pages;

    Book(String title , int pages){
        this.title = title;
        this.pages = pages;
    }

   public  String demonstrateInfo(){
        return this.title + " has " + this.pages + " pages";
    }

}
********************************************************************************************************************************

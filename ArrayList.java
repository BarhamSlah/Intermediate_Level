import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        // ArrayList needs to import it

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");
        // to add somethng

        fruits.remove(1);
        // to remove something

        fruits.set(1, "Pineapple");
        // to replace element

        System.out.println(fruits.get(3));
        // to print element

        System.out.println(fruits.size());
        // to print size of arraylist

        Collections.sort(fruits);
        // it is needs [import java.util.Collection]
        // to sequence arraylist depending on alaphabet

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
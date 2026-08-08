public class Main {
    public static void main() {

        Animal animal = new Animal();

        // you can use it instead of create a class
        Animal parrot = new Animal(){
            @Override
            void go(){
                System.out.println("But parrot can also speak");
            }
        };

        animal.go();
        parrot.go();
    }
}

////////////

public class Animal {

    void go(){
        System.out.println("All animal can walk");
    }

}
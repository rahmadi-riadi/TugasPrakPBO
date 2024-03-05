
//rahmadi Priambudi Riadi
//123200155

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("Sparrow");
        Parrot parrot = new Parrot("Parrot");
        Dog dog = new Dog("Dog");

        System.out.println(sparrow.getName() + " makes sound: ");
        sparrow.sound();

        System.out.println(parrot.getName() + " makes sound: ");
        parrot.sound();

        System.out.println(dog.getName() + " makes sound: ");
        dog.sound();
    }
}


// Interface
interface Animal {
    void sound();
}

// Abstract class
abstract class Bird implements Animal {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Class that extends the abstract class and implements the interface
class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Chirp Chirp");
    }
}

// Another class that extends the abstract class and implements the interface
class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Squawk Squawk");
    }
}

// Another class that implements the interface
class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}

class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class Mammal extends Animal {
    public void sleep() {
        System.out.println("The mammal is sleeping.");
    }
}

class Ferret extends Mammal {
    private String name;

    public Ferret(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(this.name + " is playing.");
    }

    public void introduce() {
        System.out.println("This is " + this.name + ", a pet ferret named Pig.");
    }
}

public class multiInheritanceExample {
    public static void main(String[] args) {
        Ferret pig = new Ferret("Pig");
        pig.introduce();
        pig.eat();
        pig.sleep();
        pig.play();
    }
}

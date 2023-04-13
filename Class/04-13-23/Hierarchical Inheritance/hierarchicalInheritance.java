class Animal {
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Pet extends Animal {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Ferret extends Pet {
    public Ferret(String name) {
        super(name);
    }

    public void play() {
        System.out.println("Playing with " + getName() + " the Ferret...");
    }
}

class Otter extends Pet {
    public Otter(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Swimming with " + getName() + " the Otter...");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Ferret pig = new Ferret("Pig");
        Otter cow = new Otter("Cow");

        pig.eat();
        pig.sleep();
        pig.play();

        cow.eat();
        cow.sleep();
        cow.swim();
    }
}

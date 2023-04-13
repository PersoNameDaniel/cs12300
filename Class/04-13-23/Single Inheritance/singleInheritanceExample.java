class Animal {
  String name;
  
  public Animal(String name) {
    this.name = name;
  }
  
  public void eat() {
    System.out.println(name + " is eating.");
  }
  
  public void sleep() {
    System.out.println(name + " is sleeping.");
  }
  
  public void climb() {
    System.out.println(name + " is climbing.");
  }
}

class Ferret extends Animal {
  public Ferret(String name) {
    super(name);
  }
  
  public void bark() {
    System.out.println(name + " is barking...");
  }
  
  public void fetch() {
    System.out.println(name + " is fetching.");
  }
  
  public void wagTail() {
    System.out.println(name + " is wagging its tail?");
  }

  public void question() {
    System.out.println(name + " might not be a ferret.");
  }
}

public class singleInheritanceExample {
  public static void main(String[] args) {
    Ferret myFerret = new Ferret("Pig");
    
    myFerret.eat();
    myFerret.sleep();
    myFerret.climb();
    myFerret.bark();
    myFerret.fetch();
    myFerret.wagTail();
    myFerret.question();
  }
}

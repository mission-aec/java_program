class Animal1 {
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  class Pig1 extends Animal1 {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
  }
  class Dog extends Animal1 {
    public void animalSound() {
      System.out.println("The dog says: bow wow");
    }
  }
public class java_polymorphism {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        Animal1 myPig = new Pig1();
        Animal1 myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();  
    }
}

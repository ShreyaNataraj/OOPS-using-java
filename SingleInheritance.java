public class SingleInheritance {
  public static void main(String[] args) {
    Dog doggy = new Dog();
    doggy.eats();
    doggy.legs =2;
    System.out.println(doggy.legs);
    
  }
}
class Animal{
  void eats(){
    System.out.print("eats");
  }
}
class Mammals extends Animal{
  int legs;
  void walks(){
    System.out.println("walks");
    

  }
}
class Dog extends Mammals{
  void barks(){
    System.out.println("Dog barks");
  }
}
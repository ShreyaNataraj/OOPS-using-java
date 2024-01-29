public class Hierarchialinheritance {
  public static void main(String[] args) {
    Fish fishs = new Fish();
    fishs.eat();
    fishs.swim();
    
  }
}
class Animals{
  void eat(){
    System.out.println("eats");
  }
}
class Mammals extends Animals{
  void walk(){
    System.out.println("walks");
  }
}
class Fish extends Animals{
  void swim(){
    System.out.println("swims");
  }
}

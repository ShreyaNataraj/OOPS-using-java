public class Overriding {
  public static void main(String[] args) {
    Deer d = new Deer();
    d.eats();

    }
    
  }

class Anim{
  void eats(){
    System.out.println("eats");
  }
}
class Deer{
  void eats(){
    System.out.println("eats grass");
  }
}

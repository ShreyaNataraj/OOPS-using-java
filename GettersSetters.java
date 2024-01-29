public class GettersSetters {
  public static void main(String args[]) {
    Pens p1 = new Pens();
    p1.setcolor("Blue");
    System.out.println(p1.getcolor());
    p1.settip(5);
    System.out.println(p1.gettip());
  }
}

class Pens {
  String color;
  int tip;

  String getcolor() {
    return this.color;
  }

  int gettip() {
    return this.tip;
  }

  void setcolor(String newcolor) {
    this.color = newcolor;
  }

  void settip(int newtip) {
    this.tip = newtip;
  }
}


public class GetSet {
  public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setcolor("Blue");
    System.out.println(p1.getcolor());
    p1.settip(5);
    System.out.println(p1.gettip());

  }
  
  
}
class Pen{
  String color;
  int tip;
  String getcolor(){
    return this.color;
  }
  int gettip(){
    return this.tip;
  }
  void setcolor(String newcolor){
    this.color = newcolor;
  }
  void settip(int newtip){
    this.tip = newtip;
  }

}

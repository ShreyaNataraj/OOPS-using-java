public class ConstructorsNonpara {
  public static void main(String[] args) {
    Students S1 = new Students();
    Students S2 = new Students("Parinith");
    System.out.println(S2.name);
    Students S3 = new Students(55);
    System.out.println(S3.roll);

  }
}
class Students{
  String name ;
  int roll ;
  //without parameter
  Students(){
    System.out.println("Constructor is called");
  }
  //with parameter
  Students(String name){
    this.name = name;
  }
  //with parameter
  Students(int roll){
    this.roll =roll;
  }

}
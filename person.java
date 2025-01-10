public class person {
    private String name;
    private int age;
   person()
   {
    this.name="Null";
    this.age=0;
   }
   person(String name, int age){
       this.name=name;
       this.age=age;
   }
   void display(){
       System.out.println("Name is : " +name);
       System.out.println("Age is: " +age);
   }
   public static void main(String[ ] args)
   {
       person dconst=new person();
       dconst.display();
       person pconst=new person("Anu Karki",19);
       pconst.display();

   }
}

public class Abstraction
{
    public static void main(String[] args) {
        surname ab = new surname();
        ab.show();
        ab.disp();
    }
}//main class end;
 abstract class name
 {
     abstract  void show();
     void disp()
     {
         System.out.println("hello");

     }
 }//abstract end;

class surname extends name
{
    void show()
    {
        System.out.println("yes");
    }


}

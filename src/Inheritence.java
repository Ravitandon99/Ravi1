
public class Inheritence
{
    public static void main(String[] args)
    {

        c ab = new c();
        ab.sum3();
        ab.sum2();
        ab.sum();
    }//main end;
}//public class end;


class a
{
    void sum()
    {
        System.out.println("my name is ravi");
    }

}//class a end;

class b extends a  // single inheritence;
{
    void sum2()
    {
        System.out.println("my name is azad");
    }

}//class b end;


class c extends b  // Mulitiple inheritence;
{
    void sum3()
    {
        System.out.println("my name is dheeraj");
    }

}//class c end;
public class Extendss
{
    public static void main(String[] args)
    {

        C ab = new C();

        System.out.println(ab.x);
        System.out.println(ab.y);
        System.out.println(ab.z);

    }
}

class  A
{
    int x=5;
    A()
    {
        System.out.println("constructor A");
    }

}

class B extends A
{
    int y =10;
    B()
    {
        System.out.println("construtor B");
    }
}

class C extends B
{
    int z=20;
}

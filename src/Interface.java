public class Interface
{
    public static void main(String[] args) {
        java in = new java();
        in.show();
        in.display();


    }
}

interface tcg
{
    void show();
    void display();
}

class java implements tcg
{

    public void show ()
    {
        System.out.println("show");
    }
    public void display()
    {
        System.out.println("display");
    }
}
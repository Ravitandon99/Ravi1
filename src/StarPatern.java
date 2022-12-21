import java.util.*;
public class StarPatern {
    public static void main(String[] args) {
        Patern ptr = new Patern();
        ptr.star();

    }
}
class Patern
{
    int a;
    void star()
    {
        int i=5;
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter your num for star patren:");
       // a= sc.nextByte();
        for(i=1;i>=5;i++)
        {
            for(int j=i;j<=1;j--)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }
}

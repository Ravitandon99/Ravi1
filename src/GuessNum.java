import java.util.Random;
import java.util.Scanner;

public class GuessNum extends Generate{
    public static void main(String[] args) {
        while(true) {
            GuessNum gn = new GuessNum();
            gn.randm();
            gn.check();
        }//while loop end;
    }
}
abstract class Generate
{
    int r;
    int rn;
    int n;
   int randm()
    {
        Random rl = new Random();
       r = rl.nextInt(50);
       return r;
    }
    void check()
    {
        rn = randm();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your guess num under 50: you have 3 chance ");

        for(int i=0;i<=2;i++) {
            n=sc.nextInt();
            if (rn == n) {
                System.out.println("great you win");
            } else if (rn < n) {
                System.out.println("oops plz enter smaller num");
            } else {
                System.out.println("oops plz enter bigger num");
            }
        }
        System.out.println("you lose the right num is:"+rn);

    }
}

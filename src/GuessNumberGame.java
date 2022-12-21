import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame extends Guess
{
    public static void main(String[] args)
    {
        while(true) {
            GuessNumberGame gn = new GuessNumberGame();
            gn.check();
        }//while loop end;
    }//main end;
}

abstract class Guess {
    int a;
    int b;
int n;
    int Random()
    {
       Random rn = new Random();
      a = rn.nextInt(50);
        return a;
    }

    void check()
    {
        int flag =0;
        b = Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("guess a number between 0 to 50 : you have 3 chances");
        for(int i=0;i<=2;i++)
        {
            n = sc.nextInt();
            if(b==n)
            {
                System.out.println("congrulation!! you win this game");
                flag=1;
                break;

            }

            else if(b<n)
            {
                System.out.println("plz try agian with smallest number ");
            }
            else
            {
                System.out.println("plz try agian with biggest number");
            }

        }//for loop end;

        if(flag==0) {
            System.out.println("oops!! you lost this game\n  the Right number is " + b);
        }

    }//check method end;
}//abstract class end;
import java.util.*;
public class GenerateNum
{
    int generate()
    {
        Random rn = new Random();
        int value = rn.nextInt(50);
        return value;
    }

    void guess()
    {
        int num = generate();
        Scanner val = new Scanner(System.in);
        int flag = 0;
        for(int i=0;i<5;i++)
        {
            System.out.println("guess a number between 0 to 50");
            int dat = val.nextInt();

            if(dat==num)
            {
                System.out.println("you won");
                flag=1;
                break;
            }
            else if(dat<num)
            {
                System.out.println("you entered smaller number ");
            }
            else
            {
                System.out.println("you entered a bigger number ");
            }
            System.out.println("chances left" + (4-i));

        }//for loop end;

        if(flag==0)
        {
            System.out.println("you lost this game !! try again");
            System.out.println("number was : " +num);
        }
    }//guess method end;
}//class end;

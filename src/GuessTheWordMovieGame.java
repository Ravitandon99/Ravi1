import java.io.*;
import java.util.Random;
import java.util.Scanner;

class GenerateWord
{
     String word="";
    String word()

    {
        String movies[] = {"jeene nahi dunga","ddlj","indian","kgf","pk"};

        Random obj = new Random();
        int index = obj.nextInt(movies.length-1);
         word = movies[index];
        System.out.println(word);
        return word;

    }//word method end;

    void check()
    {
        String temp[] = new String[word.length()] ;

         word = word();
        System.out.println("guess the bollywood movies name !!\n length :" +word.length());
        Scanner sc = new Scanner(System.in);


        int flag = 0;
        for(int i=0;flag<=4;i++) {

            System.out.println("enter your movie name here : ");
            String ctr = sc.next();
            if (word.contains(ctr)) {
                int ind = word.indexOf(ctr);
                temp[ind] = ctr;
                word = word.replace(ctr, " ");
                System.out.println("word");

                for (String string : temp) {

                    System.out.println(string);
                }
            }
else

            {
                System.out.println("try again");
                flag++;
            }

        }
        System.out.println("you lose");



            /*for(int j=0;j<word.length();j++) {

                {



                    flag = 1;



                }
                else
                {

                    flag = 0;


                }
                System.out.println("chance left " +(word.length()-i));
            }//nested loop end;


            if(flag==1)
            {
                System.out.println("right choose :");

            }
            else
            {

                System.out.println("try again: ");
            }
            */


       // }//for end;


    }//void method end;

}// class generateword end;













public class GuessTheWordMovieGame
{
    public static void main(String[] args) {
        while (true) {
            GenerateWord gw = new GenerateWord();
            gw.check();

        }//while end;
    }//main end;
}

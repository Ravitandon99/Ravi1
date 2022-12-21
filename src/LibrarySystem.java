import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystem
{
   static ArrayList<String> books = new  ArrayList<String>();
   static String temp[]=new String[100];
    void add()
    {
        System.out.println(" hey ! Friends :-" +
                "available books in our library :-");
        books.add("math");
        books.add("english");
        books.add("physics");
        for(int i =0;i<books.size();i++)
        {
            System.out.println(books.get(i));
            temp[i] = books.get(i);
        }
    }
    static  void issue()
    {  for(int i =0;i<books.size();i++)
    {
        System.out.println(books.get(i));
    }
    int flag=0;
        System.out.println("what would you like which subject book :- ");
        Scanner sc = new Scanner(System.in);
       String a = sc.nextLine();

        for(int i=0;i<books.size();i++)
        {  flag = 0;
            if(a.equals(books.get(i)))
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("successful issued");
            books.remove(a);
        }
        else {
            System.out.println("sorry this books is not avalible in our library");
        }
        System.out.println("now available books in library :-");
        for(int i=0;i<books.size();i++)
        {
            System.out.println(books.get(i));
        }
    }//issue method end;
  static void newBook()
    {
        System.out.println("enter the new book name add in our library :-");
        Scanner ss = new Scanner(System.in);
        String c = ss.nextLine();
        books.add(c);

        System.out.println("now total books in our library \n");

        for (int i =0 ;i<books.size();i++)
        {
            System.out.println(books.get(i));
            temp[i] = books.get(i);
        }
    }//newbook method end;
    static void retrn()
    {
        int flag =0;
        System.out.println("enter your return book name here");
        Scanner ss = new Scanner(System.in);
String c = ss.nextLine();

        for(int i = 0; i<temp.length;i++)
        {
            flag = 0;
            if (c.equals(temp[i])) {
                flag = 1;
                break;
            }
        }
            if (flag == 1)
            {
                System.out.println("thank u ");
                System.out.println("successfully return your book ");
                books.add(c);
            }
            else
            {
                System.out.println("sorry");

                System.out.println("this book is not our library book");
            }
    }//retrn method end;
    public static void main(String[] args)
    {
        LibrarySystem ls = new LibrarySystem();
        ls.add();
        while(true) {
            System.out.println("if u want issue book then press '1' and you want add newbook " +
                    "then press '2' and u want retrn book then press '3' :- ");
            Scanner sc = new Scanner(System.in);
            int press = sc.nextInt();
            if (press == 1)
            {
                issue();
            }
            else if (press == 2)
            {
                newBook();
            }
            else if (press == 3)
            {
                retrn();
            }
            else
            {
                System.out.println("sorry invalid input");
            }
        }//while end;
}//main end;
    }//file class end;


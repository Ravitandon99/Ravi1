import java.io.*;
import java.util.*;

public class EmailRegister
{
    static void create()
    {
       try
       {
           File obj = new File("newFile1.txt");
           if (obj.createNewFile())
           {
                System.out.println("successfully created");
           }
           else
           {
               System.out.println("Already Exist");
           }

       }
       catch (Exception e)
       {
           System.out.println(e);
       }
    }
    static void write(String name, String mail)
    {
        try
        {
        FileWriter writer = new FileWriter("newFile1.txt",true);
        writer.write(name+"\t"+mail+"\n");
        writer.close();
        System.out.println("data successfully saved");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    static void nameMail()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Name Here: ");
        String name = obj.nextLine();
        int flag=0;
        while (flag==0)
        {
            if (name.length() >= 5 && !name.contains(" "))

            {

                flag=1;
            }
            else
            {
                System.out.println("Invaid Input");
                System.out.println("Enter your Name Here: ");
                name = obj.nextLine();

            }
        }
        if(flag==1)
        {
            System.out.println("Your Name: " + name);
        }
        System.out.println("Enter your Email Here: ");
        String mail = obj.nextLine();
        if(mail.contains("@") && mail.contains(".") && !mail.contains(".@") || mail.contains("@."))
        {
            System.out.println("Your mail id:"+mail);
        }
        else
        {
            System.out.println("Invaild mail id");
        }
        write(name,mail);
    }
    public static void main(String[] args) {
        while (true) {
            // create();
            nameMail();
        }
    }
}

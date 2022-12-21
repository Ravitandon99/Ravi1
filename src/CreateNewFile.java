import java.io.*;
import java.util.*;

public class CreateNewFile
{
    static void create ()
    {
        try
        {
            File obj =  new File("NewFile.txt");
            if(obj.createNewFile())
            {
                System.out.println("successfully created");
            }
            else
            {
                System.out.println("already exist");
            }
        }//try end;
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//cretae method end;

       static void write1(String name , String email)
        {
            try {
                FileWriter writer = new FileWriter("NewFile.txt",true);
                writer.write(name+"\t"+email+"\n");

                writer.close();
                System.out.println("new data saved");

            }// try end;
            catch(Exception e)
            {
                System.out.println(e);
            }

    } // write method end;

    static void read()
    {
        try
        {
            int i = 0;
            File obj = new File("NewFile.txt");
            Scanner rd = new Scanner(obj);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your input here");
            String c = sc.nextLine();

            while(rd.hasNextLine()) {
                String data = rd.nextLine();
               // System.out.println(data);







                if (data.contains(c)) {
                    i++;

                }


            }
            rd.close();
            if (i >= 1)
            {
                System.out.println("data Exist:");


            }

            else
            {
                System.out.println("data Not match:");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//read method end;

    static void delete()
    {
        try {
            File obj = new File("NewFile.txt");
            obj.delete();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//delete method end;

    static void emailName()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your name here");
        String name = obj.nextLine();
int flag =1;
        while(flag==1)
        {
            a:
            if (name.length() >= 5 && !name.contains(" "))
            {

                flag = 0;
                break;

            }
             else
            {
                System.out.println("sorry your name is not valid");
                System.out.println("enter your name here");
                 name = obj.nextLine();
            }
        }

        if(flag==0)
        {
            System.out.println("your name = " + name);
        }



        System.out.println("enter your email here");
        String email = obj.nextLine();

        if(email.contains("@") && email.contains(".") && !email.contains("@.") || email.contains(".@"))
        {
            System.out.println("your email :-"+email);
        }
        else
        {
            System.out.println("sorry your email is invalid");
        }
        write1(name,email);
    }//emailName method end;

    public static void main(String[] args)
    {
      while(true) {

          // emailName();


         //   CreateNewFile cr = new CreateNewFile();

            read();
        }//while loop end;
    }//main end;
}//class end;

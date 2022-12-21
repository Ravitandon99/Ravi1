import java.util.Scanner;

public class Calcu extends cal
{

    void add()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number here");
        int a = sc.nextInt();
        System.out.println("enter your second number here");
        int b = sc.nextInt();

        System.out.println("your two number addtion =  " + (a+b));
    }

    void sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number here");
        int a = sc.nextInt();
        System.out.println("enter your second number here");
        int b = sc.nextInt();

        System.out.println("your two number subtration =  " + (a-b));
    }

    void multi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number here");
        int a = sc.nextInt();
        System.out.println("enter your second number here");
        int b = sc.nextInt();

        System.out.println("your two number multiplication =  " + (a*b));
    }

    void devide()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number here");
        int a = sc.nextInt();
        System.out.println("enter your second number here");
        int b = sc.nextInt();

        System.out.println("your two number devidetion =  " + (a/b));
    }

    void sin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your angel here");
        double a = sc.nextDouble();

        System.out.println(Math.sin(a));
    }

    void cos()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your angel here");
        double a = sc.nextDouble();

        System.out.println(Math.cos(a));
    }
    void tan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your angel here");
        double a = sc.nextDouble();

        System.out.println(Math.tan(a));
    }

    void cot()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your angel here");
        double a = sc.nextDouble();

        System.out.println(1/Math.tan(a));
    }

    void cosec()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your angel here");
        double a = sc.nextDouble();

        System.out.println(1/Math.sin(a));
    }

    void sec()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your angel here");
        double a = sc.nextDouble();

        System.out.println(1/Math.cos(a));
    }

    void square()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value here");
        double a = sc.nextDouble();
        System.out.println("your square = " +(a*a));
    }

}//public class end;


abstract class cal
{
    abstract void add();
    abstract void sum();

    abstract void multi();
    abstract void devide();
    abstract void sin();
    abstract void cos();
    abstract void tan();

    abstract void cot();

    abstract void sec();

  abstract   void square();

    abstract void cosec();




}
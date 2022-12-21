import java.util.Scanner;

public class CalculatorSintific
{
    public static void main(String[] args)
    {
        while(true) {
            Calcu ca = new Calcu();


            System.out.println(" if u want" +
                    " add then press '1'\n u want sum then press '2'\n u want multiplication then press " +
                    "'3'\n u want devide then press '4'\n u want sin then press '5'\n u want cos then press '6'\n" +
                    "you want tan then press '7'\n u want cot then press '8'\n u want sec then press '9'\n u want cosec then" +
                    "press '10'\n if u want square then press'11'\n " + "plz use me ");
            Scanner sc = new Scanner(System.in);
            int press = sc.nextInt();


            if (press == 1) {
                ca.add();
            } else if (press == 2) {
                ca.sum();
            } else if (press == 3) {
                ca.multi();
            } else if (press == 4) {
                ca.devide();
            } else if (press == 5) {
                ca.sin();
            } else if (press == 6) {
                ca.cos();
            } else if (press == 7) {
                ca.tan();
            } else if (press == 8) {
                ca.cot();
            } else if (press == 9) {
                ca.sec();
            } else if (press == 10) {
                ca.cosec();
            } else if (press == 11) {
                ca.square();
            } else {
                System.out.println("invalid input");
            }





        }//while loop end;
    }//main end;
}

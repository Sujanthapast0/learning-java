import java.util.Scanner;

public class additon {
    public static void main (String[] add)
    {
        int a,b,c;

        System.out.print("Enter the num you want to add");
        Scanner s=new Scanner(System.in);


        a= s.nextInt();
        b= s.nextInt();

        c= a+b;

        System.out.println("The result is :"+c);



    }
}

import java.util.Scanner;
class Example1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18)
        {
            if(age>=21)
            {
                System.out.println("Allowed and take alcohol");
            }
            else
            {
                System.out.println("Allowed and don't take alcohol ");
            }
        }
        else
        {
            System.out.println("Not allowed");
        }
    }
}
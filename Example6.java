//check if a number is prime or not

public class Example6
{
    public static void main(String args[])
    {
        int a=6;
        int count=0;
        for(int i=2;i<7;i++)
        {
            if(a%i==0)
            {
                count++;
                System.out.println("Not a prime");
                break;
            }
        }
        if(count==0)
        {
            System.out.println("It is a prime number");
        }
    }
}
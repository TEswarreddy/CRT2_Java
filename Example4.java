//print a netegative even numbers from 0 to -10
//output: -2,-4,..
public class Example4
{
    public static void main(String args[])
    {
        for(int i=-1;i>-11;i--)
        {
            //System.out.println(i);
            if(i%2==0)
            {
                System.out.print(i);
            }
        }
        System.out.println();
        int i=-1;
        while(i>-11)
        {
            if(i%2==0)
            {
                System.out.print(i);
            }
            i--;

        }
    }
}
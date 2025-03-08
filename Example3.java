import java.util.Scanner;

public class Example3
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        sc.close();
        int a=1;
        int b=9;
        int c=3;
        int fl=a;
        int sl=a;
        // int fs=a;
        // int ss=a;
        if(b>fl)
        {
            if(sl<fl)
            {
                sl=fl;
            }
            fl=b;
            
        }
        else if(c>fl)
        {
            if(sl<fl)
            {
                sl=fl;
            }
            fl=c;
        }
        if(b>sl && fl!=b)
        {
            sl=b;
        }
        else if(c>sl && fl!=c)
        {
            sl=c;
        }
        System.out.println(fl);
        System.out.println(sl);

   } 
}
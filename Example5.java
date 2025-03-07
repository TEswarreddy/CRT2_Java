//print the sequence 100,90,80,.....10

public class Example5
{
    public static void main(String args[])
    {
        for(int i=100;i>0;i-=10)
        {
            System.out.print(i+"  ");   
        }
        System.out.println();
        int i=100;
        while(i>0)
        {
            System.out.print(i+" ");
            
            i-=10;
        }
    }
}
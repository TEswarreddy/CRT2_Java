//palindrome or not

class Example9
{
    public static void main(String args[])
    {
        int n=123;
        int original=n;
        int rev=0;
        while(n>0)
        {
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        if(rev==original)
        {
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
import java.util.*;
class sumoffactors
{
    public static void main(String[] args)
    {
        Scanner j=new Scanner(System.in);
        int a=j.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
            sum+=i;
            System.out.printf("%d\n",i);
            }
        }
      System.out.printf("%d",sum);  
    }
}
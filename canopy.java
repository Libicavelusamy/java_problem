import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int max=obj.nextInt();
        int rr=obj.nextInt();
        int arr[]=new int[n-1];
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            arr[i]=obj.nextInt();
            sum+=arr[i];
        }
        int res=(rr*n)-sum;
        if(res<=max)
            System.out.print(res);
        else
            System.out.print(-1);
    }
}
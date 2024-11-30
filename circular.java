import java.util.*;
class java
{
    public static  void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        int i,j,sum=0;
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i!=n-1)
            {
                int res=Math.abs(arr[i]-arr[i+1]);
                sum+=res;
            }
            else
            {
                int res=Math.abs(arr[i]-arr[0]);
                sum+=res;

            }
        }
        System.out.println(sum);
    }
}
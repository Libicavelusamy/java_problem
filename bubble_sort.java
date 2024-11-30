
import java.util.*;
class sorting{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        int i,j;
        for( i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
            for( i=0;i<size-1;j++)
            {
                for(j=i+1;j<size-1;j++)
                {
                if(arr[i]>arr[j])
                {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
                arr[i]=arr[j];
                arr[j]=arr[j+1];
            }

            }
            System.out.print(arr[j]+" ");
  
        }
        
    }
}
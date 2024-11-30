import java.util.*;
class ascii {
    public static void main(String[] args)
    {
        Scanner j=new Scanner(System.in);
        char ch=j.next().charAt(0);
        if(ch>=65&&ch<=90)
        {
            System.out.print("uppercase");
        }
        else if(ch>=97&&ch<=122)
        {
            System.out.print("lowercase");
        }
        else if(ch>=48&&ch<=57)
        {
            System.out.print("number");
        }
        else
        {
            System.out.print("NONE");
        }
    }
}

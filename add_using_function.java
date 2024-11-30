import java.util.*;
class arithmatic
{
    int a=50,b=20;
}
class add extends arithmatic{
    void display()
    {
        System.out.println(a+b);
    }
}
class sub extends add
{
    void print()
    {
        System.out.println(a-b);
    }
}
class mul extends sub{
    void print1()
    {
        System.out.println(a*b);
    }
}
class div extends mul{
    void print2()
    {
        System.out.println(a/b);
    }
}
class main
{
    public static void main(String[] args)
    {
        div obj=new div();
        obj.display();
        obj.print();
        obj.print1();
        obj.print2();
    }
}


import java.util.*;
class engineering
{
    int totalsem=8;
    void dept()
    {
        System.out.printf("i am IT dept");
    }
}

class Main
{
    public static void main(String[] args)
    {
        engineering obj=new engineering();
        System.out.println(obj.totalsem);
        obj.dept();
    }
}

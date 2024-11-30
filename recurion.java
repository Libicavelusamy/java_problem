import java.util.*;
class program{
    static void g(int m){
        if(m>3)
        {
            g(m);
        }
        System.out.println(m);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=35;
        g(v);
    }
}
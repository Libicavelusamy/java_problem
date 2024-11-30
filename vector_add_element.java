import java.util.*;
class program{
    public static void main(String[] args){
       Vector<Integer> v=new Vector<Integer>();
       Vector<Integer> v1=new Vector<Integer>();
       Scanner obj=new Scanner(System.in);
       v.add(24);
       v.add(03);
       v.add(20);
       v.add(04);
       v.add(21);
       System.out.println("v ="+v);
       System.out.println("no of elements in the array ="+v.size());
       System.out.println("--------------------------------");
       v.add(3,333);
       System.out.println("added element in specfied index");
       System.out.println("v="+v);
    }
}
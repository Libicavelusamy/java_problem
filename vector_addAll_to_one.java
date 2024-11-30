import java.util.*;
class program{
    public static void main(String[] args){
       Vector<Integer> vc=new Vector<Integer>();
       Vector<Integer> vc1=new Vector<Integer>();
       Vector<Integer> vc2=new Vector<Integer>();
       Scanner obj=new Scanner(System.in);
       vc.add(24);
       vc.add(03);
       vc.add(20);
       vc.add(04);
       vc.add(21);
       System.out.println("v ="+vc);
       vc1.add(1);
       vc1.add(2);
       vc1.add(3);
       vc1.add(4);
       System.out.println("v1="+vc1);
       vc2.addAll(vc);
       vc2.addAll(vc1);
       System.out.println("v2"+vc2);
    }
}
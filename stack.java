import java.util.*;
class cll{
  Node head;
  Node tail;
  class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int val){
      data=val;
      next=null;
      prev=null;
      
    }
  }
  cll(){
    head=null;
    tail=null;
  }
  public void insertend(int val){
    Node newnode=new Node(val);
    if(head==null)
    {
      head=newnode;    
      tail=newnode;
    }
    else
    {
      tail.next=newnode;
      newnode.prev=tail;
      tail=newnode;
    }
  }
   public void dltend(){
        Node temp=tail;
        Node temp3=tail.prev;
        temp.prev.next=null;
        temp.prev=null;
        tail=temp3;
   }
   public void peak(){
        if(tail!=null){
            System.out.print(tail.data+"-->peak");
        }
   }
 
  public void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" \n");
      temp=temp.next;
    }
  }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    cll list=new cll();
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
        int s=sc.nextInt();
        list.insertend(s);
    }
    list.dltend();
    
    list.display();
    list.peak();
  }
}
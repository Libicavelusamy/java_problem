import java.util.*;
class Main
{
    Node last;
    Node newnode;
  class Node{
    int data;
    Node next;
    
    Node(int val){
      data=val;
      next=null;
      
      
    }
  }
  Main(){
    last=null;
  }

public void insertend(int val){
  Node newnode=new Node(val);
  if(last==null){
    newnode.next=newnode;
    last=newnode;
    
  }
  else{
    newnode.next=last.next;
    last.next=newnode;
    last=newnode;
  }                                                        
}
public void sorting(){
  
}
   public void display() 
    {
       
        Node temp = last.next;
        do 
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        } while (temp != last.next);
    }

    public static void main(String[] args) 
    {
        Main list = new Main();
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            int num=scan.nextInt();
            if(num==-1){
                break;
            }
            else{
            list.insertend(num);
            }
        }
        list.display();
    }
}

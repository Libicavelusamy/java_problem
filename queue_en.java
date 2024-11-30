import java.util.Scanner;

class ArrayQueue
{
    int size=30;
    int s[];
    int rear;
    int front;

    ArrayQueue(){
        s = new int[size];
        rear = -1;
        front = -1;
    }
    void enqueue(int val)
    {
        if(rear == size-1)
        {
            System.out.println("full");
        }
        if(front == -1)
        {
            front ++;
        }
        s[++rear]=val;
    }
        
    int dequeue()
    {
        if(front==-1)
        {
            System.out.print("Empty");
        }
        return s[front++];
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(s[i]+ " ");
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        ArrayQueue a1 = new ArrayQueue();

        a1.enqueue(10);
        a1.enqueue(20);
        a1.enqueue(30);
        a1.enqueue(40);
        a1.enqueue(50);
        a1.display();

        System.out.println();
        a1.dequeue();
        // a1.pop();
        a1.display();

    }
    private static void ArrayQueue(int n) 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ArrayQueue'");
    }
}
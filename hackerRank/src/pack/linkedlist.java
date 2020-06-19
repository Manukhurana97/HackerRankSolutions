package pack;

import java.io.IOException;
import java.util.Scanner;

class linklist {

    Node head;

    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void append(int data){
        Node new_node = new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) throws IOException {

        linklist ll = new linklist();
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for(int i=0;i<no;i++)
        {
            ll.append(sc.nextInt());
        }
        ll.display();
    }
}

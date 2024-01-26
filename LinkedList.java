import java.util.Enumeration;
import java.util.Iterator;

public class LinkedList extends Node  {

    private Node head;
    public void insert(int in){
        Node newOne = new Node();
        newOne.putdata(in);
        if(head == null){
            head = newOne;
        }
        else{
            Node NextNode = head;
            while (NextNode.getNext() != null)
                NextNode = NextNode.getNext();

            NextNode.putasnext(NextNode,newOne);
        }
    }

    public int getfirst(){
           return head.get();
    }

    public void showdata(){
        Node node = head;
        while (node != null)
        {
            System.out.println(node.get());
            node = node.getNext();
        }
    }
//head 696
    //new 697
    void insertAt(int pos, int in){
        Node newOne = new Node();
        newOne.putdata(in);
        int idx = 0;
        if(pos == 0){
            Node n = head;
            head = newOne;
            newOne.putasnext(newOne,n);
            return;
        }
        Node node = head;
        while (idx < pos-1){
            idx++;
            node = node.getNext();
        }
        newOne.putasnext(node,node.getNext());
        node.putasnext(newOne,newOne);
    }
}

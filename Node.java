public class Node {
    private int data;
    private Node Next;

    void putasnext(Node node,Node Nextnoe){
        this.Next = Nextnoe;
//        node.Next = Nextnoe;
    }
    void putdata(int data){
        this.data = data;
    }

    Node getNext(){
        return this.Next;
    }
    int get(){
        return this.data;
    }

}

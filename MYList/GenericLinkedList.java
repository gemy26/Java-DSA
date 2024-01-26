package MYList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class GenericLinkedList<T> extends GeneticNode<T> implements Iterable<T>  {
   private GeneticNode root;
   private int size ;

    public void insert(T in){
        GeneticNode newOne = new GeneticNode();
        newOne.putdata(in);
        if(root == null){
            root = newOne;
        }
        else{
            GeneticNode NextNode = root;
            while (NextNode.getNext() != null)
                NextNode = NextNode.getNext();

            NextNode.putasnext(newOne);
        }
    }

    public void showdata(){
        GeneticNode node = root;
        while (node != null)
        {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public Iterator<T> iterator(){
         return new MyIterator<>(this);
    }


    protected class MyIterator<T> implements Iterator<T>{

        private GeneticNode<T> curNode;

        public MyIterator(GenericLinkedList<T> list){
            this.curNode = list.root;
        }

        @Override
        public boolean hasNext() {
            return this.curNode!=null;
        }

        @Override
        public T next() {
            if(!this.hasNext()){
                throw new NoSuchElementException();
            }
            T data = this.curNode.getData();
            this.curNode = this.curNode.getNext();
            return data;

        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Iterator.super.forEachRemaining(action);
        }
    }




}

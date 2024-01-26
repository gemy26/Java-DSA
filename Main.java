import MYList.GenericLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

/*
       Integer[] a = {1,5,4,3,2};
       SortingAlgos<Integer>sal = new SortingAlgos<>(a);
       Integer []A2 = sal.BubbleSort();
       System.out.println(Arrays.toString(A2));

 */

        /*
        LinkedList l = new LinkedList();
        l.insert(5);
        l.insert(6);
        l.insert(7);
        l.insert(11);
        l.insertAt(0,66);

//        System.out.println(l.getfirst());
        l.showdata();
        */

        GenericLinkedList<Integer> gl = new GenericLinkedList<>();
        gl.insert(1);
        gl.insert(2);
        gl.insert(3);


//        Iterator<Integer>it = gl.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


        for(Integer x : gl)
            System.out.println(x);



//        gl.showdata();






    }
}


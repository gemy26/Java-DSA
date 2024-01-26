import java.util.Arrays;

public class SortingAlgos<T extends Comparable<? super T>>  {

    T[] A;
    public SortingAlgos(T[] in){
        this.A = in;
    }
    public T[]  BubbleSort(){
        for (int i = 0; i < A.length ; i++){
            for (int j =  i+1 ; j < A.length ; j++){
                // if a[j]  a[i] return 1
                // if a[i] > a[j] return -1
                // if a[i] == a[j] return 0
                if(A[j].compareTo(A[i]) < 0){
                    T tmp = A[j];
                    A[j] = A[i];
                    A[i] = tmp;
                }
            }
        }

        return A;
    }
}

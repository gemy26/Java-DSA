package MYList;

public   class  GeneticNode <T>{

    private  T data;

    private GeneticNode Next;

//    protected GeneticNode hasNext(){
//        return this.Next ;
//    }
    protected GeneticNode getNext(){
        return this.Next;
    }
    protected T getData(){
        return this.data;
    }

    protected void putdata(T in){
        this.data = in;
    }



      protected void putasnext(GeneticNode Nextnoe){
         this.Next = Nextnoe;
//        node.Next = Nextnoe;
     }


}

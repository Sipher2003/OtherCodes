public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    //inserting  a node in the beginning of the linkedlist
    public void Insertfirst(int val){
         Node node=new Node(val);
         node.next=head;
         head=node;

         if(tail==null){
            tail=head;
         }
         size+=1;
    }

    //inserting element in the last
    public void Insertlast(int val){
       //if tail is initially set to null in your linked list (because the list is empty).
        if(tail==null){
            Insertfirst(val);
            return;
        }
       
       Node node=new Node(val);
       tail.next=node;
       tail=node;
       size+=1;
    }

    //inserting elements at a particular index
    public void insert(int val,int index){
        if(index==0){
            Insertfirst(val);
            return;
        }
        if(index==size){
            Insertlast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;

        size+=1;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 1; i < index; i++) {
            node=node.next;
        }

        return node;
    }

    //delete first element
    public int deletefirst(){
      int val=head.value;
      head=head.next;
      
      if(head==null){
        tail=null;
      }
      
      size--;
      return val;
    }

    //delete last element
    public int deletelast(){
        // same as deleting the first element
        if(size<=1){
            return deletefirst();
        }

        Node secondlast=get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }

        Node prev=get(index-1);
        int val=prev.next.value;

        prev.next=prev.next.next;
   size--;
        return val;

    }

    //displaying the linkedlist
    public void display(){
      Node temp=head;
 
      while (temp!=null) {
        System.out.print(temp.value+"->");
        temp=temp.next;
      }     
      System.out.println("end");
    }

    private class Node {
     
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    
}

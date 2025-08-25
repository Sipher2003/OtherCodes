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

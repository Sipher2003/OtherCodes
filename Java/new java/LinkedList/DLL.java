public class DLL {
    
   private Node head;

   public void Insertfirst(int val){
     Node node=new Node(val);
     node.next=head;
     node.prev=null;
     if (head!=null) {
        head.prev=node;
     }
     head=node;
   }
   

   public void display(){
    Node temp=head;
    Node last=null; //used for reversing the ll

    while (temp!=null) {
        last=temp; //just updating last into the last value of ll so it wcan be used whie reversing ll
        System.out.print(temp.value+"->");
        temp=temp.next;
    }
    System.out.println("End");

    System.out.println("Printing in reverse");

    while(last!=null){
        System.out.print(last.value+"->");
        last=last.prev;
    }
    System.out.println("START");
   }
    




    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}

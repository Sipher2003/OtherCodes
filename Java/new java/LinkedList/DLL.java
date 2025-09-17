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
        last=temp; //just updating last into the last value of ll so it can be used whie reversing ll
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



   public void insertLast(int value){
    Node node = new Node(value);
    Node last=head;

    node.next=null;
    if (head==null) {
       node.prev=null;
       head=node;
       return;
    }

    while (last.next!=null) {
        last=last.next;      
    }
    last.next=node;
    node.prev=last;
   }



   public Node find(int value){
    Node node=head;
    while (node!=null) {
        if(node.value==value){
            return node;
        }
        node=node.next;
    }
    return null;
   }


   
   public void insert(int next,int value){
    Node p=find(next);

    if(p==null){
        System.out.println("Value not found");
        return;
    }

    Node node=new Node(value);
    node.next=p.next;
    p.next=node;
    node.prev=p;
    if(node.next!=null){
        node.next.prev=node;
    }
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

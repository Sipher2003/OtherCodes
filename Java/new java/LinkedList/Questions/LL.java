public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // 83. Remove Duplicates from Sorted List
    public void remdup() {
        Node node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // 21. Merge Two Sorted Lists
    public static LL merge(LL first, LL second) {

        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.Insertlast(f.val);
                f = f.next;
            } else {
                ans.Insertlast(s.val);
                s = s.next;
            }
        }

        while(f!=null){
            ans.Insertlast(f.val);
            f=f.next;
        }

        while(s!=null){
            ans.Insertlast(s.val);
            s=s.next;
        }

        return ans;
    }

// check if the linkedlist has cycle
public boolean hasCycle(Node head){
     
     Node f=head; 
     Node s=head;
     
     while(f!=null && f.next!=null){
        f=f.next.next;
        s=s.next;
        if(f==s){
            return true;
        }
     }
     
        return false;
    }




    // inserting a node in the beginning of the linkedlist
    public void Insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // inserting element in the last
    public void Insertlast(int val) {
        // if tail is initially set to null in your linked list (because the list is
        // empty).
        if (tail == null) {
            Insertfirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    // inserting elements at a particular index
    public void insert(int val, int index) {
        if (index == 0) {
            Insertfirst(val);
            return;
        }
        if (index == size) {
            Insertlast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size += 1;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL list = new LL();
        LL list2 = new LL();

        list.Insertlast(1);
        list.Insertlast(3);
        list.Insertlast(5);
        list2.Insertlast(1);
        list2.Insertlast(2);
        list2.Insertlast(9);
        list2.Insertlast(14);

    

        // LL ans=LL.merge(list,list2);
        // ans.display();

        // list.display();
        // list.remdup();
        // list.display();

    }
}

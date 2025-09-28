import java.util.List;

public class InterviewQuestions {


    //detect if linkedlist has a cycle
    public boolean hasCycle(ListNode head){
     
     ListNode f=head; 
     ListNode s=head;
     
     while(f!=null && f.next!=null){
        f=f.next.next;
        s=s.next;
        if(f==s){
            return true;
        }
     }
     
        return false;
    }

//check the length of the linkedlist cycle
    public int lengthCycle(ListNode head){
     ListNode f=head; 
     ListNode s=head;
     
     while(f!=null && f.next!=null){
        f=f.next.next;
        s=s.next;
        if(f==s){
          ListNode temp=s;
          int len=0;
          do{
            temp=temp.next;
            len+=1;
          }while(temp!=s);
          return len;
        }
     }  
        
        return 0;
    }

    //linkedlist cycle -II, return the node where the cycle starts
   public ListNode detectCycle(ListNode head) {
        ListNode f=head; 
     ListNode s=head;
     
     int len=0;

     while(f!=null && f.next!=null){
        f=f.next.next;
        s=s.next;
        if(f==s){
        len=lengthCycle(s);
          break;
        }
     }

     if(len==0){
     return null;
     }

     ListNode first=head;
     ListNode second =head;

     while(len>0){
        second=second.next;
        len--;
     }

     while(first!=second){
        first=first.next;
        second=second.next;
     }
     return second;
     
    }




    
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}
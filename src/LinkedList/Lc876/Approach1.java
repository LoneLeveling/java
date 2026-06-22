package LinkedList.Lc876;

public class Approach1 //Simple approach: we iterate find the length and then fetch the mid
{
    public static void main(String[] args) {
        //Creating a linked list
        ListNode head=new ListNode(10);
        ListNode second=new ListNode(20);
        ListNode third=new ListNode(30);
        ListNode fourth=new ListNode(40);
        ListNode fifth=new ListNode(50);
//connecting the nodes
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

//Traversal
        ListNode tmp=head;
        while (tmp!=null)
        {
            System.out.println(tmp.val);
            tmp=tmp.next;
        }

        System.out.println("Calling the method to return the mid of linked list(lc-876)");
        ListNode var=middleNode(head);
        while (var!=null)
        {
            System.out.println(var.val);
            var=var.next;
        }
    }

     static ListNode middleNode(ListNode head) {
          ListNode curr=head;
          int length=0;
          while(curr!=null){
             length++;
             curr=curr.next;
          }

          int mid=length/2;
          curr=head;
          for(int i=0;i<mid;i++){
          curr=curr.next;
          }
          return curr;
     }
}



class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
}
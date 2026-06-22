package LinkedList.Lc876;
//https://leetcode.com/problems/middle-of-the-linked-list/description/


public class Approach1 {
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
        ListNode slow=middleNode(head); //slow points to the middle node
        ListNode var=slow;//we start iterating from middle node
        while(var!=null){//null is = last location so we iterate till null from mid, printing the list while we iterate
            System.out.println(var.val);
            var=var.next;
        }
    }

    static ListNode middleNode(ListNode head){
    ListNode slow=head;
    ListNode fast=head;

    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
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
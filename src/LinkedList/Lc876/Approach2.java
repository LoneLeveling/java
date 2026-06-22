package LinkedList.Lc876;
//https://leetcode.com/problems/middle-of-the-linked-list/description/


public class Approach2 {
    public static void main(String[] args) {
//Creating a linked list
ListNode2 head=new ListNode2(10);
ListNode2 second=new ListNode2(20);
ListNode2 third=new ListNode2(30);
ListNode2 fourth=new ListNode2(40);
ListNode2 fifth=new ListNode2(50);
//connecting the nodes
head.next=second;
second.next=third;
third.next=fourth;
fourth.next=fifth;

//Traversal
        ListNode2 tmp=head;
        while (tmp!=null)
        {
            System.out.println(tmp.val);
            tmp=tmp.next;
        }

        System.out.println("Calling the method to return the mid of linked list(lc-876)");

        //Slow-fast pointer Approach
        ListNode2 slow=middleNode(head); //slow points to the middle node
        ListNode2 var=slow;//we start iterating from middle node
        while(var!=null){//null is = last location so we iterate till null from mid, printing the list while we iterate
            System.out.println(var.val);
            var=var.next;
        }
    }
    static ListNode2 middleNode(ListNode2 head){
    ListNode2 slow=head;
    ListNode2 fast=head;

    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    }
}



class ListNode2{
    int val;
    ListNode2 next;
    ListNode2(){}
    ListNode2(int val){
        this.val=val;
    }
    ListNode2(int val, ListNode2 next){
        this.val=val;
        this.next=next;
    }
}
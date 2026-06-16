package LinkedList;

import java.util.LinkedList;
import java.util.List;

class ListNode
{
int val;
ListNode next;
ListNode( int val)
{
    this.val=val;
    this.next=null;
}
}
public class Problem1
{
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        //Connecting nodes
        head.next=second;
        second.next=third;

        //Traversal
        ListNode tmp = head;
        while (tmp!=null)
        {
            System.out.println(tmp.val);
            if (tmp.val==20)
            {
                System.out.println("Found 20 so stopping the loop...");
                break;
            }
        tmp=tmp.next;
        }
    }
}
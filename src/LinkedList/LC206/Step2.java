package LinkedList.LC206;

//Step 2: Connecting 3 nodes
class ListNode1
{
    int val;
    ListNode1 next;
    ListNode1(int val)
    {
        this.val=val;
        this.next=null;
    }
}
public class Step2 {
    public static void main(String[] args) {

        ListNode1 head = new ListNode1(10);
        ListNode1 second = new ListNode1(20);
        ListNode1 third = new ListNode1(30);
        head.next = second;
        second.next = third;

        //Directly printing the list, same as doing sout(arr[0])
        /* System.out.println(head.val);
        System.out.println(head.next.val); //second.val == head.next.val
        */

        //Iterating/Traversing over the list
        ListNode1 tmp = head;
        //pointing the tmp to head, head = stores address of first node,
        // temp = head means traversal starts from first node
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;//temp = temp.next moves forward
        }
    }

}
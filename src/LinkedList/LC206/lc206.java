package LinkedList.LC206;
class ListNode2
{
    int val;
    ListNode2 next;

    ListNode2(int val)
    {
        this.val = val;
        this.next = null;
    }
}
public class lc206 {
    public static void main(String[] args) {
        // Creating nodes
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        // Connecting nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        // Original list
        System.out.println("Original Linked List:");
        printList(node1);

        // Reverse list
        ListNode reversedHead = reverseList(node1);

        // Reversed list
        System.out.println("Reversed Linked List:");
        printList(reversedHead);

    }
    // Function to print linked list
    public static void printList(ListNode head)
    {
        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            // Save next node
            ListNode nextNode = curr.next;

            // Reverse link
            curr.next = prev;

            // Move prev ahead
            prev = curr;

            // Move curr ahead
            curr = nextNode;
        }

        return prev;
    }
}

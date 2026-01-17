public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Given the head of a singly linked list, return the middle node of the linked
         * list.
         * 
         * If there are two middle nodes, return the second middle node.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: head = [1,2,3,4,5]
         * Output: [3,4,5]
         * Explanation: The middle node of the list is node 3.
         * 
         * Example 2:
         * 
         * Input: head = [1,2,3,4,5,6]
         * Output: [4,5,6]
         * Explanation: Since the list has two middle nodes with values 3 and 4, we
         * return the second one.
         * 
         */
        System.out.println("Hello, World!");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode result = solution.middleNode(head);
        System.out.println("The given linked list is: ");
        printList(head);

        System.out.println("The middle node of the linked list is: " + result.val);

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

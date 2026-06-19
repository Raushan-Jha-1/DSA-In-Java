// Leetcode Question link = https://leetcode.com/problems/reverse-linked-list/

// Time Complexity = O(n);
// Space Complexity = O(1);


public ListNode reverseList(ListNode head) {

    // Stores the head of the reversed linked list
    ListNode reversedHead = null;

    // Traverse the original linked list
    while (head != null) {

        // Store the current node
        ListNode currentNode = head;

        // Move head to the next node
        head = head.next;

        // Link current node to the reversed list
        currentNode.next = reversedHead;

        // Update reversed list head
        reversedHead = currentNode;
    }

    return reversedHead;
}
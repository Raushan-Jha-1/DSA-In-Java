//LeetCode Question link= https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//Time Complexity = O(n)
//Space Complexity = O(1)

public ListNode deleteDuplicates(ListNode head) {
    // Handle empty list or single-node list.
    if (head == null || head.next == null) {
        return head;
    }

    ListNode current = head;

    // Traverse the linked list.
    while (current != null) {

        // Check if the next node exists and is a duplicate.
        if (current.next != null && current.val == current.next.val) {
            ListNode duplicateNode = current.next;

            // Skip the duplicate node.
            if (duplicateNode.next != null) {
                current.next = duplicateNode.next;
            } else {
                current.next = null;
            }

            // Help the garbage collector by removing the reference.
            duplicateNode = null;

            // Recheck the current node in case multiple duplicates exist.
            continue;
        }

        // Move to the next distinct node.
        current = current.next;
    }

    return head;
}
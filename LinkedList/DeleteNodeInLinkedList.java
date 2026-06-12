// Leetcode Question link = https://leetcode.com/problems/delete-node-in-a-linked-list/

// Time Complexity = O(n);
// Space Complexity = O(1);



public void deleteNode(ListNode node) {

    // Start traversing from the given node.
    ListNode currentNode = node;

    // Shift the value of the next node into the current node
    // until reaching the second last node.
    while (currentNode != null) {
        if (currentNode.next.next == null) {
            // Copy the last node's value and remove the last node.
            currentNode.val = currentNode.next.val;
            currentNode.next = null;
            break;
        } else {
            currentNode.val = currentNode.next.val;
            currentNode = currentNode.next;
        }
    }
}
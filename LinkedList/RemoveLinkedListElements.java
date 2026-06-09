//GFG Question link= https://leetcode.com/problems/remove-linked-list-elements/
//Time Complexity = O(n)
//Space Complexity = O(1)



class Solution {
    public ListNode removeElements(ListNode headNode, int targetValue) {

        ListNode currentNode = headNode;

        // Return immediately if the list is empty.
        if (headNode == null) {
            return headNode;
        }

        // Handle the single-node list case.
        if (headNode.next == null && headNode.val == targetValue) {
            return null;
        }

        // Traverse the linked list and remove matching nodes.
        while (currentNode != null) {

            // Remove matching nodes from the head of the list.
            if (currentNode.val == targetValue) {
                headNode = headNode.next;
                currentNode = headNode;
                continue;
            }

            // Check whether the next node should be removed.
            if (currentNode.next != null) {

                if (currentNode.next.val == targetValue) {

                    ListNode nodeToDelete = currentNode.next;

                    // Bypass the node to be removed.
                    if (nodeToDelete.next != null) {
                        currentNode.next = nodeToDelete.next;
                        nodeToDelete = null;
                        continue;
                    } else {
                        currentNode.next = null;
                        continue;
                    }
                }
            }

            // Move to the next node.
            currentNode = currentNode.next;
        }

        return headNode;
    }
}
// GFG Question link = https://www.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// Time Complexity = O(n);
// Space Complexity = O(1);


Node removeDuplicates(Node head) {

    // Return as it is if the list is empty or contains only one node.
    if (head == null || head.next == null) {
        return head;
    }

    Node currentNode = head;

    while (currentNode != null) {

        // Check if the next node contains duplicate data.
        if (currentNode.next != null && currentNode.data == currentNode.next.data) {

            Node duplicateNode = currentNode.next;

            // Skip the duplicate node by updating the links.
            if (duplicateNode.next != null) {
                currentNode.next = duplicateNode.next;
                duplicateNode.next = null;
                continue;
            } else {
                currentNode.next = null;
            }
        }

        currentNode = currentNode.next;
    }

    return head;
}

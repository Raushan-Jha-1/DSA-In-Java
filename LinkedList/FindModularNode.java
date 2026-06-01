//GFG Question link=https://www.geeksforgeeks.org/problems/modular-node/1?page=1&category=Linked%20List&sortBy=difficulty
//Time Complexity = O(n)
//Space Complexity = O(1)

// Returns the data of the last node whose position is divisible by k
public int modularNode(Node head, int k) {

    // Tracks the current node position (1-based indexing)
    int nodePosition = 0;

    // Stores the data of the latest modular node found
    int modularNodeData = -1;

    // Traverse the linked list
    while (head != null) {
        nodePosition++;

        // Update the result whenever the position is divisible by k
        if (nodePosition % k == 0) {
            modularNodeData = head.data;
        }

        head = head.next;
    }

    return modularNodeData;
}

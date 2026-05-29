// GFG Question link == https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// Time Complexity = O(n);
// Space Complexity = O(1);

// Returns the total number of nodes present in the linked list
public int getCount(Node head) {
    
    // Stores the count of nodes
    int nodeCount = 0;

    // Traverse the linked list until the end is reached
    while (head != null) {
        nodeCount++;
        head = head.next;
    }

    return nodeCount;
}

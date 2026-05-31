// GFG Question link = https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1?page=1&category=Linked%20List&sortBy=difficulty

// Time Complexity = O(n);
// Space Complexity = O(1);


// Checks whether the number of nodes in the linked list is even
public boolean isEven(Node head) {

    // Stores the total number of nodes in the linked list
    int nodeCount = 0;

    // Traverse the linked list and count each node
    while (head != null) {
        nodeCount++;
        head = head.next;
    }

    // Return true if the node count is even, otherwise false
    return nodeCount % 2 == 0;
}
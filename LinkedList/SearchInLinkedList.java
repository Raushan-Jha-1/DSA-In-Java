//GFG Question link= https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
//Time Complexity = O(n)
//Space Complexity = O(1)


// Function to search a key in the linked list
public boolean searchKey(Node head, int targetKey) {

    // Pointer used to traverse the linked list
    Node currentNode = head;

    // Traverse until end of linked list
    while (currentNode != null) {

        // Check if current node data matches target key
        if (currentNode.data == targetKey) {
            return true;
        }

        // Move to next node
        currentNode = currentNode.next;
    }

    // Key not found in linked list
    return false;
}
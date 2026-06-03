//GFG Question link= https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?page=1&category=Linked%20List&sortBy=difficulty
//Time Complexity = O(n)
//Space Complexity = O(1)


public Node insertAtEnd(Node head, int data) {

    // If the list is empty, create and return the first node
    if (head == null) {
        return new Node(data);
    }

    // Traverse to the last node of the linked list
    Node currentNode = head;

    while (currentNode != null) {

        // Insert the new node when the last node is reached
        if (currentNode.next == null) {
            currentNode.next = new Node(data);
            break;
        }

        currentNode = currentNode.next;
    }

    return head;
}
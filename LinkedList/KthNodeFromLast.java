//GFG Question link= https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=2&category=Linked%20List&sortBy=difficulty
//Time Complexity = O(n)
//Space Complexity = O(1)



int getKthFromLast(Node head, int positionFromEnd) {

    // Calculate the length of the linked list
    int listLength = 0;
    Node currentNode = head;

    while (currentNode != null) {
        listLength++;
        currentNode = currentNode.next;
    }

    // Return -1 if the requested position exceeds the list length
    if (positionFromEnd > listLength) {
        return -1;
    }

    // Convert kth position from the end to position from the start
    int targetPositionFromStart = listLength - positionFromEnd + 1;

    currentNode = head;

    // Traverse to the target node and return its value
    for (int currentPosition = 1;
         currentPosition <= targetPositionFromStart;
         currentPosition++) {

        if (currentPosition == targetPositionFromStart) {
            return currentNode.data;
        }

        currentNode = currentNode.next;
    }

    return -1;
}
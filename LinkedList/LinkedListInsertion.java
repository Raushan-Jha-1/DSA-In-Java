//GFG Question link= http://geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=1&category=Linked%20List&sortBy=difficulty
//Time Complexity = O(n)
//Space Complexity = O(1)

//You can do with fast and slow pointer also but when i was learning i did it first so i m pushing this code only.


public Node insertInMiddle(Node head, int data) {

    // Calculate the length of the linked list
    int listLength = 0;
    Node currentNode = head;

    while (currentNode != null) {
        listLength++;
        currentNode = currentNode.next;
    }

    // If the list is empty, create and return a new node
    if (listLength == 0) {
        return new Node(data);
    }

    // Determine the insertion position
    int middleIndex = (listLength % 2 == 0)
            ? listLength / 2
            : (listLength + 1) / 2;

    currentNode = head;

    // Traverse to the node just before the insertion position
    for (int index = 0; index < middleIndex; index++) {

        if (index == middleIndex - 1) {

            // Create and insert the new node
            Node newNode = new Node(data);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }

        currentNode = currentNode.next;
    }

    return head;
}
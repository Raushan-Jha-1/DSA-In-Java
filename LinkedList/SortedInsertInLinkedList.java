//GFG Question link= https://www.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
//Time Complexity = O(n)
//Space Complexity = O(1)


// Insert a value into a sorted linked list while preserving sorted order.
Node sortedInsert(Node headNode, int valueToInsert) {

    // If the list is empty, create and return the first node.
    if (headNode == null) {
        return new Node(valueToInsert);
    }

    // Insert at the beginning if the value is smaller than the head node.
    if (headNode.data > valueToInsert) {
        Node newNode = new Node(valueToInsert);
        newNode.next = headNode;
        return newNode;
    }

    Node currentNode = headNode;

    // Traverse the list to find the correct insertion position.
    while (currentNode != null) {

        // Check if the value belongs between currentNode and currentNode.next.
        if (currentNode.next != null) {

            if (currentNode.data <= valueToInsert
                    && currentNode.next.data >= valueToInsert) {

                Node newNode = new Node(valueToInsert);

                newNode.next = currentNode.next;
                currentNode.next = newNode;

                return headNode;
            }
        }

        // Append the node at the end if no larger element exists.
        if (currentNode.next == null) {
            Node newNode = new Node(valueToInsert);
            currentNode.next = newNode;

            return headNode;
        }

        currentNode = currentNode.next;
    }

    return headNode;
}
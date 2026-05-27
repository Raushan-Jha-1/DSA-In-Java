//GFG Question link= https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1
//Time Complexity = O(n)
//Space Complexity = O(1)


public Node arrayToList(int[] arr) {

    // Return null if the array is empty
    if (arr.length == 0) {
        return null;
    }

    // Create the head node using the first element of the array
    Node headNode = new Node(arr[0]);

    // Pointer used to build the linked list
    Node currentNode = headNode;

    // Traverse remaining array elements
    for (int index = 1; index < arr.length; index++) {

        // Create new node and attach it to the current node
        currentNode.next = new Node(arr[index]);

        // Move pointer to the newly created node
        currentNode = currentNode.next;
    }

    // Return head of the generated linked list
    return headNode;
}


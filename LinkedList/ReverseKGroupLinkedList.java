// GFG Question link = https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// Time Complexity = O(n^2);
// Space Complexity = O(n/k);

class Solution {

    // Stores the head of each reversed group
    private ArrayDeque<Node> reversedGroups = new ArrayDeque<>();

    /**
     * Reverses a group of k nodes and stores the group's head in the queue.
     */
    private void reverseGroup(Node currentNode, int groupSize) {

        int count = 1;
        Node previousNode = null;

        while (count <= groupSize && currentNode != null) {
            Node nextNode = currentNode.next;

            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

            count++;
        }

        // Store the head of the reversed group
        if (previousNode != null) {
            reversedGroups.offer(previousNode);
        }

        // Base case: no more nodes left
        if (currentNode == null) {
            return;
        }

        reverseGroup(currentNode, groupSize);
    }

    public Node reverseKGroup(Node head, int k) {

        if (head == null) {
            return null;
        }

        reversedGroups.clear();

        // Reverse all groups recursively
        reverseGroup(head, k);

        Node newHead = reversedGroups.peek();

        // Connect all reversed groups together
        while (!reversedGroups.isEmpty()) {

            Node currentGroupHead = reversedGroups.pop();
            Node tailNode = currentGroupHead;

            while (tailNode.next != null) {
                tailNode = tailNode.next;
            }

            tailNode.next = reversedGroups.peek();
        }

        return newHead;
    }
}
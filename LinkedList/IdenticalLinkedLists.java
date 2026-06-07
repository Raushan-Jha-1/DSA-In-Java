//GFG Question link= https://www.geeksforgeeks.org/problems/identical-linked-lists/1?page=1&category=Linked%20List&sortBy=difficulty
//Time Complexity = O(n)
//Space Complexity = O(1)


// Traverse both linked lists simultaneously and compare node values.
while (firstListHead != null && secondListHead != null) {

    // If data differs at any position, lists are not identical.
    if (firstListHead.data != secondListHead.data) {
        return false;
    }

    // Move to the next node in both lists.
    firstListHead = firstListHead.next;
    secondListHead = secondListHead.next;
}

// If one list still contains nodes, lengths are different.
if (firstListHead != null || secondListHead != null) {
    return false;
}

// All nodes matched and both lists ended together.
return true;
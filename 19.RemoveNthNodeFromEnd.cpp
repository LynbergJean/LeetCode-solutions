


struct ListNode {

 int val;

 ListNode *next;

 ListNode() : val(0), next(nullptr) {}

 ListNode(int x) : val(x), next(nullptr) {}
 ListNode(int x, ListNode *next) : val(x), next(next) {}

};


class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int length = 0;
        ListNode *temp = head;
        
        // 1. Find the total length
        while(temp) {
            length++;
            temp = temp->next;
        }

        // 2. Edge Case: Removing the very first node (head)
        if (n == length) {
            ListNode* newHead = head->next;
            delete head; // Good practice if memory management is manual
            return newHead;
        }

        // 3. Find the node BEFORE the one we want to remove
        // Target index is (length - n - 1)
        ListNode* cur = head;
        for (int i = 0; i < length - n - 1; i++) {
            cur = cur->next;
        }

        // 4. Delete the target node
        ListNode* nodeToDelete = cur->next;
        cur->next = cur->next->next;
        delete nodeToDelete;

        return head;
    }
};
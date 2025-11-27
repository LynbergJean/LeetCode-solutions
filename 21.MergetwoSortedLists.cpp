struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        //understand 
        //plan 
        //implement
        if(!list1)
            return list2;

        if(!list2)
            return list1;


        ListNode *dummy = new ListNode();

        ListNode *first = list1;
        ListNode *second = list2;
        ListNode *result = dummy;

        while(first && second)
        {
            if(first->val < second->val)
            {
                dummy->next = first;
                dummy = first;
                first = first->next;
            }else{
                dummy->next = second;
                dummy = second;
                second = second->next;
            }
        }

        while(first)
        {
            dummy->next = first;
            dummy = first;
            first = first->next;
        }

        while(second)
        {
            dummy->next = second;
            dummy = second;
            second = second->next;
        }

        return result->next;
    }
};
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* middleNode(struct ListNode* head){
    struct ListNode* temp= head;
    int len=0;
    for (temp; temp!=NULL; temp=temp->next){
        len++;
    }
    temp=head;
    for (int x=1; x!=(len/2)+1; x++){
        temp=temp->next;
    }
    return temp;
}

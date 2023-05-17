/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    struct Listnode* reversehead = (struct Listnode*)malloc(sizeof(struct Listnode*));
    reversehead=NULL;
    while (head!=NULL){
        struct Listnode* temp;
        temp=head->next;
        head->next = reversehead;
        reversehead=head;
        head= temp;
    }
    return reversehead;
}

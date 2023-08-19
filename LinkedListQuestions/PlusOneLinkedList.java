//https://leetcode.com/problems/plus-one-linked-list/
package LinkedListQuestions;
class ListNode{
    int val;
    ListNode next;
    public ListNode(){

    }
    public ListNode(int val){
        this.val=val;
    }
    public ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }

}
public class PlusOneLinkedList {
    public ListNode plusOne(ListNode head) {
        ListNode sentinel=new ListNode(0);
        ListNode notNine=sentinel;
        sentinel.next=head;
        while(head!=null ){
            if(head.val!=9){
                notNine=head;
            }
            head=head.next;
        }
        notNine.val++;
        notNine=notNine.next;
        while(notNine!=null){
            notNine.val=0;
            notNine=notNine.next;
        }
        if(sentinel.val==0){
            return sentinel.next;
        }
        return sentinel;

        
    }
}


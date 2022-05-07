package LinkedListQuestions;
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
  }
public class DesignLinkedList {
    Node node;
    int size;
    public DesignLinkedList() {
        node=new Node(0);
        size=0;
    }
    
    public int get(int index) {
        if(index>=size||index<0){
            return -1;
        }
        Node temp=node;
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return ;
        }
        if(index<0){
            index=0;
        }
        ++size;
        Node curr=node;
        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        Node toAdd=new Node(val);
        toAdd.next=curr.next;
        curr.next=toAdd;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size||index<0){
            return ;
        }
        --size;
        Node temp=node;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
}

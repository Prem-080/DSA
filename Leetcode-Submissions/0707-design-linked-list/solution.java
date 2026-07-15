class Node{
    int val;
    Node next;

    Node(){
        this.next = null;
    }
    Node(int data){
        this(data, null);
    }

    Node(int data, Node next){
        this.val = data;
        this.next = next;
    }
}

class MyLinkedList {
    Node head;
    public MyLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        Node temp = head;
        int i = 0;
        
        while(i < index && temp != null){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            return -1;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node first = new Node(val, head);
        head = first;
    }

    public void addAtTail(int val) {
        if(head == null){
            head = new Node(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(val);
    }

    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node temp = head;
        int i = 1;

        while(temp.next != null && i < index){
            temp = temp.next;
            i++;
        }
        if(i == index){
        Node node = new Node(val, temp.next);
        temp.next = node;
        
        }
    }

    public void deleteAtIndex(int index) {
        if(index == 0){
            head = head.next;
            return;
        }
        int i = 1;
        Node temp = head;
        while(temp.next != null && i < index){
            temp = temp.next;
            i++;
        }
        if(temp.next != null){

        temp.next = temp.next.next;
        }

    }

    public int size(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
        }
        return count;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

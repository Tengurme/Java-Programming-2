public class Q20 {
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void addLast(int data){
        Node nn = new Node();
        nn.data = data;
        nn.next = null;

        if(this.size>=1){
            this.tail.next = nn;
        }
        if(this.size==0){
            this.head=nn;
            this.tail=nn;
            this.size++;
        }else {
            this.tail = nn;
            this.size++;
        }
    }
    public Node Klastnode(int k){
        Node slow = this.head;
        Node fast = this.head;
        int count = k;
        while (count--!=0||fast.next!=null){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}

public class Q21 {
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
    public void reverse(){
       Node pre = this.head;
       Node cur = pre.next;
       while(cur!=null){
           Node ahead = cur.next;
           cur.next = pre;
           pre=cur;
           cur=ahead;
       }
       Node t = this.head;
       this.head = this.tail;
       this.tail = t;
    }
}

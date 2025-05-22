class Node{
    int data;
    Node next;
    Node(){
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node node){
        this.data=data;
        this.next=node;
    }
}
public class SLL {
    private static Node head=null;
    private static void addAtbegining(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    
    private static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        int [] arr={2,5,6,1,3};
        for(int ele: arr){
            addAtbegining(ele);
        }
        display();
    }
}

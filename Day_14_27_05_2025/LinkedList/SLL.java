import java.util.*;
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
    private static void addAtEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    private static void makeCycle(int pos) {
    if (head == null) return;

    Node temp = head;
    Node cyclePoint = null;
    int index = 0;

    while (temp.next != null) {
        if (index == pos) {
            cyclePoint = temp;
        }
        temp = temp.next;
        index++;
    }

    // Link the last node to the node at position `pos`
    if (cyclePoint != null) {
        temp.next = cyclePoint;
        // System.out.println("Cycle created at position " + pos + " with value " + cyclePoint.data);
    } 
    else {
        System.out.println("Position out of bounds. No cycle created.");
        }
    }

    private static void detectCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("Cycle dected ");
                return;
            }
        }
        System.out.println("No Cycle");
    }
        private static void cycleDetectedAt(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println("Cycle deteced at "+ slow.data);
    }
    private static void removeCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        // slow=head; Cant use bcoz we are incresing both slow and fast in one while loop
        slow=head.next;
        while(fast.next!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
    private static void noOfEleInCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                break;
            }
        }
        int k=1;
        slow=slow.next;
        while(fast!=slow){
            k++;
            slow=slow.next;
        }
        System.out.println("No Of Eelements in Cycle " +k);
    }
    private static void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prev=null;
        Node curr=head;
        Node nxt=head.next;
        while(curr!=null){
            // Node nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            if(curr!=null){
                nxt=curr.next;
            }
        }
        head=prev;
    }
    private static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int [] arr={2,5,6,1,3};
        int [] arr={5,2,4,7,3,6,5,8};
        for(int ele: arr){
            addAtEnd(ele);
        }
        display();
        makeCycle(3);
        detectCycle();
        cycleDetectedAt();
        noOfEleInCycle();
        removeCycle();
        detectCycle();
        reverse();
        display();
    }
}
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
    private static void addAtIndex(int data,int i){
        if(i==0){
            addAtbegining(data);
            return ;
        }
        Node temp = head;
        Node newNode = new Node(data);
        while(temp!=null && i-->1){ // 1 2 3 4 5 6 7  i=6
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    private static void SumwithLessEqualConsiK(int k){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            if((temp.data + temp.next.data)<=k){
                count++;
            }
            temp=temp.next;
        }
        System.out.println(count);
    }
    private static void AllPosibbleSumEqualConsiK(int t){
        HashSet<Integer> set= new HashSet<>();
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(set.contains(t-(temp.data))){
                count++;
            }
            set.add(temp.data);
            temp=temp.next;
        }
        System.out.println(count);

    }
    private static void secondHalf(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            System.out.print(slow.data+" ");
            slow=slow.next;
        }

    }
    private static void kthNodeFromLastBrutForce(int k){
        Node temp=head;
        ArrayList<Integer> t= new ArrayList<>();
        while(temp!=null){
            t.add(temp.data);
            temp=temp.next;
        }
        System.out.println();
        System.out.println(t.get(t.size()-k));

    }
    private static void kthNodeFromLastOptimal(int k){
        Node slow=head;
        Node fast=head;
        while(fast!=null && k-->0){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
    }
    private static void bubbleSort(){
        Node temp=head;
        while(temp.next!=null){
            Node j=temp.next;
            boolean isSorted=true;
            while(j!=null){
                if(j.data<temp.data){
                    int t= j.data;
                    j.data=temp.data;
                    temp.data=t;
                    isSorted=false;
                }
                j=j.next;
            }
            temp=temp.next;
            if(isSorted){
                break;
            }
        }
    }
    private static void kthLargest(int k){
        Node temp=head;
        while(temp.next!=null && k-->0){
            Node j=temp.next;
            while(j!=null){
                if(j.data<temp.data){
                    int t= j.data;
                    j.data=temp.data;
                    temp.data=t;
                }
                j=j.next;
            }
            temp=temp.next;
        }
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
        // addAtIndex(10, 5);
        // display();
        // SumwithLessEqualConsiK(10);
        // AllPosibbleSumEqualConsiK(10);
        // secondHalf();
        // kthNodeFromLastBrutForce(4);
        // kthNodeFromLastOptimal(4);
        // bubbleSort();
        display();
        kthLargest(3);
        kthNodeFromLastOptimal(3);
    }
}

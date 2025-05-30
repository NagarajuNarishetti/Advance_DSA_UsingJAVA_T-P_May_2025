class Node{
    int data;
    Node left;
    Node right;
    int height;
    Node (){
    }
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Trees {
    private static Node root;
    private static void insert(int data){
        root= insertData(root,data);
    }
    private static Node insertData(Node node, int data){
        if(node==null){
            return new Node(data);
        }
        if(data<node.data){
            node.left= insertData(node.left, data);
        }else{
           node.right= insertData(node.right, data);
        }
        return node;
    }
    private static void preOrder(Node node ){
        if(node==null){
            return ;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    private static void inOrder(Node node){
        if(node==null){
            return ;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    private static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }
    private static int sumOfNode(Node  node){
        if(node==null){
            return 0;
        }
        return node.data+sumOfNode(node.left)+sumOfNode(node.right);
    }
    private static int EvenSum(Node node){
        if(node==null){
             return 0;
        }
        if(node.data%2==0){
            return node.data+ EvenSum(node.left)+EvenSum(node.right);
        }
        else 
        return EvenSum(node.left)+ EvenSum(node.right);
    }
    private static int height(Node node){
        if(node==null){
            return -1;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
    private static boolean search( Node node ,int data){
        if(node==null){
            return false;
        }
        if(node.data==data){
            return true;
        }
        else if(data<node.data){
           return search(node.left, data);
        }
        else{
           return search(node.right, data);
        }
        //  return search(node.left, data)|| search(node.right, data);
    }
    public static void main(String[] args) {
        root= new Node(10);
        root.left= new Node(5);
        root.right= new Node(20);
        root.left.left= new Node(2);
        root.left.right=new Node(8);
        root.left.right.left= new Node(6);
        root.left.right.right= new Node(9);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // int [] arr={3 ,7 ,2,9,1,8};
        // for( int ele:arr){
            // insert(ele);
        // }
        // insert(root,10);
       preOrder(root);
       System.out.println();
       inOrder(root);
       System.out.println();
        postOrder(root);
        System.out.println();
        // System.out.println("sum "+sumOfNode(root));
        // System.out.println("Even sum "+EvenSum(root));
        System.out.println("Height = " +height(root));
        System.out.println(search(root,5));
    }
}

/*
 * pre Ro L R   10 5 2 8 20 15 22
 * in  L Ro L   2 5 8 10 20 15 22
 * post L R Ro  2 8 5 15 22 20 10
 * 
 * 
 */
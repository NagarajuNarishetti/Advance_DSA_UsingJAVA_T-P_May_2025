import java.util.*;
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
    private static void inOrder(Node node){
        if(node==null){
            return ;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }
    private static int height(Node node){
        if(node==null){
            return -1;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
    private static int countLeafNodes(Node node){
        if(node!=null && node.left==null && node.right==null){
            return 1;
        }
        return countLeafNodes(node.left)+countLeafNodes(node.right);
    }
    
    private static void allPaths(Node node,ArrayList<Integer> list){
        if(node==null){
            return;

        }
        list.add(node.data);
        if(node.left==null && node.right==null){
            System.out.println(list);
            list.remove(list.size()-1);
            return;
        }
        allPaths(node.left, list);
        allPaths(node.right, list);
        list.remove(list.size()-1);
    }
    private static void bfs(){
        if(root==null){
            return;
        }
        Queue<Node> queue= new LinkedList<>() ;
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp= queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
    }
    private static void countLeafNodesBFS(Node node){
        if(node==null){
            return;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.add(node);
        int count=0;
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            if(temp.left==null && temp.right==null){
                count++;
            }
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        System.out.println(count);
    }
    private static TreeMap<Integer,Node> map= new TreeMap<>();
    private static void leftView(Node node,int count){
        if(node==null){
            return;
        }
        if(!map.containsKey(count)){
            map.put(count,node);
        }
        leftView(node.left, count+1);
        leftView(node.right, count+1);
    }
    private static void rightView(Node node,int count){
        if(node==null){
            return;
        }
        map.put(count,node);
        rightView(node.left, count+1);
        rightView(node.right, count+1);
    }
    // Wrong code 
       public static void topView(Node node, int count) {
        if (node == null) return;

        // Only put the node in map if this horizontal distance is not yet added
        if (!map.containsKey(count)) {
            map.put(count, node);
        }

        topView(node.left, count - 1);
        topView(node.right, count + 1);
    }
    // Wrong code 
    private static void bottomView(Node node,int count){
        if(node==null){
            return;
        }
        if(count>0){
            if(!map.containsKey(count)){
                map.put(count,node);
            }
        }else{
            if(map.containsKey(count)){
                map.put(count, node);
            }
        }
        bottomView(node.left, count+1);
        bottomView(node.right, count+1);
    }
    private static void printView(){
        for(Map.Entry<Integer,Node> entry: map.entrySet()){
            System.out.println(entry.getValue().data +" ");
        }
    }
    // Wrong
    private static void lcaBST(Node node,int a,int b){
        if(node==null){
            return ;
        }
        if(a<node.data && b<node.data){
            lcaBST(node.left, a, b);
        }
        else if(a>node.data && b>node.data){
            lcaBST(node.right, a, b);
        }
        else
        System.out.println(node.data);     
    }
    // Wrong 
    private static Node lcaBT(Node node,int a,int b){
        if(node==null){
            return null ;
        }
        if(a==node.data || b == node.data){
            return node;
        }
        Node l=lcaBT(node.left, a, b);     
        Node r=lcaBT(node.right, a, b);
        if(l!=null && r!=null){
            return node;
        }
        if(l!=node){
            return l;
        }
        else{
            return r;
        }
    }
    //  Give Tree Balanced or Not
    private static boolean balancedOrNot(Node node){
        if(node==null){
            return true;
        }
        int l=height(node.left);
        int r=height(node.right);
        if(Math.abs(l-r)>1){
            return false;
        }
        return balancedOrNot(node.left) && balancedOrNot(node.right);

    }
    public static void main(String[] args) {
        root= new Node(10);
        root.left= new Node(5);
        root.left.left=new Node(6);
        root.left.right= new Node(8);
        root.right= new Node(20);
        root.right.right=new Node(30);
        root.right.right.left= new Node(40);
        root.right.right.right= new Node(50);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // int [] arr={3 ,7 ,2,9,1,8};
        // for( int ele:arr){
        //     insert(ele);
        // }
        // insert(10);
    //    inOrder(root);
       System.out.println();
    //    ArrayList<Integer> list= new ArrayList<>();
    //    System.out.println(countLeafNodes(root));
    //    allPaths(root, list);
    //    bfs();
    //    countLeafNodesBFS(root);
    //    int count=0,
    //    leftView(root,0);
    //    rightView(root, 0);
    //    topView(root, 0);
        //   bottomView(root, 0);
        // lcaBST(root,40,50);
        // System.out.println(lcaBT(root, 5, 30).data);
        System.out.println(balancedOrNot(root));
    //    printView();
      
    }
}
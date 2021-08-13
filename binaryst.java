class Node{
    int data;
    Node left;
    Node right;
}
class bst{
    public Node createnewnode(int d){
        Node nn=new Node();
        nn.data=d;
        nn.left=null;
        nn.right=null;
        return nn;
    }
    public Node insert(Node node,int val){
        if(node==null){
            node=createnewnode(val);
        return node;
    }
    if(val<node.data){
        node.left=insert(node.left, val);
    }
    else if(val>node.data){
        node.right=insert(node.right, val);
    }
    return node;
    }
    void inorder(Node node){
        if(node==null)
        return;
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
    }
}
class binaryst{
    public static void main(String[] args) {
        bst a=new bst();
        Node root=null;
        root = a.insert(root, 2);
        root = a.insert(root, 4);
}
}
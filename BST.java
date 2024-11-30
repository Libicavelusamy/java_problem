public class BST {
class Node {
        int key;
        Node left, right;
        public Node(int data){
            key = data;
            left = right = null;
        }
    }
    Node root;
    BST(){
        root = null;
    }
    void deleteKey(int key) {
        root = delete_Recursive(root, key);
    }
    Node delete_Recursive(Node root, int key)  {
    if (root == null)  return root;
        if (key < root.key)     
            root.left = delete_Recursive(root.left, key);
        else if (key > root.key)  
            root.right = delete_Recursive(root.right, key);
        else  {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;


            root.key = minValue(root.right);
            root.right = delete_Recursive(root.right, root.key);
        }
        return root;
    }
    int minValue(Node root){
    int minval = root.key;
    while (root.left != null)  {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }
    void insert(int key){
        root = insert_Recursive(root, key);
    }
    Node insert_Recursive(Node root, int key) {
      if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) 
            root.left = insert_Recursive(root.left, key);
        else if (key > root.key) 
            root.right = insert_Recursive(root.right, key);

        return root;
    }
    void inorder() {
        inorder_Recursive(root);
    }


    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }
    void preorder() {
        preorder_Recursive(root);
    }
    void preorder_Recursive(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder_Recursive(root.left);
            preorder_Recursive(root.right);
        }
    }
    void postorder() {
        postorder_Recursive(root);
    }
    void postorder_Recursive(Node root) {
        if (root != null) {
            postorder_Recursive(root.left);
            postorder_Recursive(root.right);
            System.out.print(root.key + " ");
        }
    }
    boolean search(int key)  {
        root = search_Recursive(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }
    Node search_Recursive(Node root, int key)  {
        if (root==null || root.key==key)
            return root;
        if (root.key > key)
            return search_Recursive(root.left, key);
            return search_Recursive(root.right, key);
    }
}
class tree{
    public static void main(String[] args){
        BST bst = new BST();
        bst.insert(22);
        bst.insert(12);
        bst.insert(20);
        bst.insert(8);
        bst.insert(30);
        bst.insert(25);
        bst.insert(40);

        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();
        System.out.println();
        System.out.println("The BST Created with input data(root-Left-right):");
        bst.preorder();
        System.out.println();
        System.out.println("The BST Created with input data(Left-right-root):");
        bst.postorder();
        System.out.println("\nThe BST after Delete 12(leaf node):");
        bst.deleteKey(8);
        bst.inorder();
        System.out.println("\nThe BST after Delete 90 (node with 1 child):");
        bst.deleteKey(12);
        bst.inorder();
        System.out.println("\nThe BST after Delete 45 (Node with two children):");
        bst.deleteKey(30);
        bst.inorder();
        boolean ret_val = bst.search (25);
        System.out.println(ret_val==true ? "Found" : "Not Found");
        boolean ret_val1 = bst.search (70);
        System.out.println(ret_val1==true ? "Found" : "Not Found");
    }
}

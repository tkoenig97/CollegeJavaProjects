public class BST {

// BST class

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int data) {
        key = data;
        left = right = null;
    }
}

    TreeNode root;

    BST() {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }

    TreeNode insertKey(TreeNode root, int key) {

        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);

        return root;
    }

    void inorder() {
        System.out.print("Inorder Traversal= [");
        inorderUtil(root);
        System.out.println("]");
        System.out.println();
    }

    void inorderUtil(TreeNode root) {
        if (root != null) {
            inorderUtil(root.left);
            System.out.print(" "+root.key+" ");
            inorderUtil(root.right);
        }
    }

// Dijkstra Algorithm

    void printMaxWeightPath()
    {
        System.out.print("MaxWeight Route with Dijkstra Algorithm = ");
        printMaxWeightPathUtil(root);
    }
    private void printMaxWeightPathUtil(TreeNode root) {

        if(root!=null)
        {
            TreeNode temp=root;
            while(temp!=null)
            {
                System.out.print(temp.key+"->");
                temp=temp.right;
            }
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(27);
        bst.insert(14);
        bst.insert(35);
        bst.insert(10);
        bst.insert(19);
        bst.insert(31);
        bst.insert(42);

        // In-order traversal of the tree
        bst.inorder();

        // Print route with the max weight
        bst.printMaxWeightPath();
    }
}
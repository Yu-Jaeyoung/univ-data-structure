package tree.binarytree;

public class BinaryTree<E> {
    protected TreeNode<E> root;

    public BinaryTree() {
        this.root = null;
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    void preorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getItem() + " ");
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    public void postorder() {
        postorder(root);
        System.out.println();
    }

    void postorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        postorder(node.getLeft());
        postorder(node.getRight());
        System.out.print(node.getItem() + " ");
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    void inorder(TreeNode<E> node) {
        if (node == null) {
            return;
        }

        inorder(node.getLeft());
        System.out.print(node.getItem() + " ");
        inorder(node.getRight());
    }
}

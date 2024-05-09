package binarytree;

public class BinaryTree<E> {
    TreeNode<E> root;

    public BinaryTree() {
        root = null;
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(final TreeNode<E> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getItem() + " ");
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    void inorder() {
        inorder(root);
        System.out.println();
    }

    void inorder(final TreeNode<E> root) {
        if (root == null) {
            return;
        }

        inorder(root.getLeft());
        System.out.print(root.getItem() + " ");
        inorder(root.getRight());
    }

    void postorder() {
        postorder(root);
        System.out.println();

    }

    void postorder(final TreeNode<E> root) {
        if (root == null) {
            return;
        }

        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root.getItem() + " ");
    }
}
package binarytree;

public class TreeNode<E> {
    private E item;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode(final E newItem, final TreeNode<E> left, final TreeNode<E> right) {
        this.item = newItem;
        this.left = left;
        this.right = right;
    }

    public E getItem() {
        return item;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }
}
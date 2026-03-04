package binarytree;

public class BinarySearchTree<E> extends BinaryTree<E> implements IndexInterface<TreeNode<E>, E> {

    @Override
    public TreeNode<E> search(Comparable<E> x) {
        return searchItem(root, x);
    }

    private TreeNode<E> searchItem(TreeNode<E> t, Comparable<E> x) {
        if (t == null) {
            return null;
        }

        if (x.compareTo(t.getItem()) < 0) {
            return searchItem(t.getLeft(), x);
        } else if (x.compareTo(t.getItem()) > 0) {
            return searchItem(t.getRight(), x);
        } else {
            return t;
        }
    }

    @Override
    public void insert(Comparable<E> x) {
        root = insertItem(root, x);
    }

    private TreeNode<E> insertItem(TreeNode<E> t, Comparable<E> x) {
        if (t == null) {
            return new TreeNode<E>((E) x, null, null);
        } else if (x.compareTo(t.getItem()) < 0) {
            t.setLeft(insertItem(t.getLeft(), x));
            return t;
        } else {
            t.setRight(insertItem(t.getRight(), x));
            return t;
        }
    }

    @Override
    public void delete(final Comparable<E> x) {
        root = findAndDelete(root, x);
    }

    private TreeNode<E> findAndDelete(TreeNode<E> t, final Comparable<E> x) {
        if (t == null) {
            return null; // item not found!
        } else {
            if (x.compareTo(t.getItem()) == 0) {
                t = deleteNode(t); // item found at t
            } else if (x.compareTo(t.getItem()) < 0) {
                t.setLeft(findAndDelete(t.getLeft(), x));
            } else {
                t.setRight(findAndDelete(t.getRight(), x));
            }
            return t;
        }
    }

    private TreeNode<E> deleteNode(TreeNode<E> t) {
        if (t.getLeft() == null && t.getRight() == null) {
            return null; // case 1 (no child)
        } else if (t.getLeft() == null) {
            return t.getRight(); // case 2 (only right child)
        } else if (t.getRight() == null) {
            return t.getLeft(); // case 2 (only left child)
        } else { // case 3 (two children)
            returnPair rPair = deleteMinItem(t.getRight());
            t.setItem((E) rPair.minItem);
            t.setRight(rPair.node);
            return t; // t survived
        }
    }

    private returnPair deleteMinItem(TreeNode<E> t) {
        if (t.getLeft() == null) { // found minimum at t
            return new returnPair(t.getItem(), t.getRight());
        } else { // branch left, then backtrack
            returnPair rPair = deleteMinItem(t.getLeft());
            t.setLeft(rPair.node);
            rPair.node = t;
            return rPair;
        }
    }

    private class returnPair {
        E minItem;
        TreeNode<E> node;

        private returnPair(E x, TreeNode<E> t) {
            minItem = x;
            node = t;
        }
    }
}
package tree.binarytree;

public class BinaryTreeMain {
    public static int evaluate(BinaryTree<Character> expression) {
        return evaluate(expression.root);
    }

    public static int evaluate(TreeNode<Character> root) {
        if (root == null) {
            return 0;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            return Character.getNumericValue(root.getItem());
        }

        int op1 = evaluate(root.getLeft());
        int op2 = evaluate(root.getRight());

        return switch (root.getItem()) {
            case '+' -> op1 + op2;
            case '-' -> op1 - op2;
            case '*' -> op1 * op2;
            case '/' -> op1 / op2;
            default -> 0;
        };

    }

    public static void main(String[] args) {
        TreeNode<Character> n4 = new TreeNode<>('3', null, null);
        TreeNode<Character> n5 = new TreeNode<>('2', null, null);
        TreeNode<Character> n6 = new TreeNode<>('5', null, null);
        TreeNode<Character> n7 = new TreeNode<>('6', null, null);

        TreeNode<Character> n2 = new TreeNode<>('*', n4, n5);
        TreeNode<Character> n3 = new TreeNode<>('+', n6, n7);

        TreeNode<Character> n1 = new TreeNode<>('+', n2, n3);

        BinaryTree<Character> binaryTree = new BinaryTree<>();
        binaryTree.root = n1;

        binaryTree.preorder();
        binaryTree.inorder();
        binaryTree.postorder();

        System.out.println(evaluate(binaryTree.root));
    }
}

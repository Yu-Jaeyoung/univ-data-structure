package binarytree;

public class BinaryTreeMain {
    public static int evaluate(BinaryTree<Character> expression) {
        return evaluate(expression.root);
    }

    private static int evaluate(final TreeNode<Character> root) {
        if (root == null) {
            return 0;
        }

        int valueL = evaluate(root.getLeft());
        int valueR = evaluate(root.getRight());

        switch (root.getItem()) {
            case '+':
                return valueL + valueR;
            case '*':
                return valueL * valueR;
            case '/':
                return valueL / valueR;
            case '-':
                return valueL - valueR;
            default:
                return Character.getNumericValue(root.getItem());
        }
    }


    public static void main(String[] args) {
        TreeNode<Character> n1 = new TreeNode<>('3', null, null);
        TreeNode<Character> n2 = new TreeNode<>('2', null, null);
        TreeNode<Character> n3 = new TreeNode<>('*', n1, n2);
        TreeNode<Character> n4 = new TreeNode<>('5', null, null);
        TreeNode<Character> n5 = new TreeNode<>('6', null, null);
        TreeNode<Character> n6 = new TreeNode<>('+', n4, n5);
        TreeNode<Character> n7 = new TreeNode<>('+', n3, n6);

        BinaryTree<Character> binaryTree = new BinaryTree<>();
        binaryTree.root = n7;

        binaryTree.preorder();
        binaryTree.inorder();
        binaryTree.postorder();

        System.out.println("수식의 결과는: " + evaluate(binaryTree));
    }

}
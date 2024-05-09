package binarytree;

import java.util.Scanner;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        while (true) {
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }

            int value = Integer.parseInt(input);
            bst.insert(value);
        }

        bst.inorder();

        System.out.println("찾고 싶은 값?");
        int searchKey = scanner.nextInt();
        TreeNode<Integer> result = bst.search(searchKey);

        if (result == null) {
            System.out.println("찾고 싶은 값이 없음");
        } else {
            System.out.println("찾은 값: " + result.getItem());
        }

        System.out.print("삭제하고 싶은 값?");
        int deleteKey = scanner.nextInt();
        bst.delete(deleteKey);

        bst.inorder();

        scanner.close();
    }
}

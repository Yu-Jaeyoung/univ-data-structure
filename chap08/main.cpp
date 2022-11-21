#include <stdio.h>

#include "binarytree.h"

//		 15
//	 4	    20
// 1      16  25

//맨 아래 리프 노드 부터 작성하는게 쉽다.

int main(void) {

    TreeNode n1 = {1, NULL, NULL};
    TreeNode n2 = {4, &n1, NULL};
    TreeNode n3 = {16, NULL, NULL};
    TreeNode n4 = {25, NULL, NULL};
    TreeNode n5 = {20, &n3, &n4};
    TreeNode n6 = {15, &n2, &n5};
    TreeNode *root = &n6;

    preorder(root);
    printf("\n");

    inorder(root);
    printf("\n");

    inorder_iter(root);
    printf("\n");

    postorder(root);
    printf("\n");


    if (search(root, 15) != NULL) {
        printf("찾음\n");
    } else {
        printf("없음\n");
    }


    if (isearch(root, 15) != NULL) {
        printf("찾음\n");
    } else {
        printf("없음\n");
    }

    return 0;
}
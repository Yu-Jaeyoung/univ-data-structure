/*
#include <stdio.h>
#include "binarytree.h"

// 전위 순회 : VLR

void preorder(TreeNode *root) {
    // NULL처리 1번 방법
    if (root == NULL)
        return;

    printf("[%2d] ", root->data);    // V (노드 방문)
    preorder(root->left);            // L (왼쪽 서브트리 순회)
    preorder(root->right);            // R (오른쪽 서브트리 순회)
}

// 중위 순회 : LVR

void inorder(TreeNode *root) {
    // NULL처리 2번 방법
    if (root != NULL) {
        inorder(root->left);            // L (왼쪽 서브트리 순회)
        printf("[%2d] ", root->data);    // V (노드 방문)
        inorder(root->right);            // R (오른쪽 서브트리 순회)
    }
}

// 후위 순회 : LRV

void postorder(TreeNode *root) {
    // NULL처리 3번 방법
    if (root) {
        postorder(root->left);            // L (왼쪽 서브트리 순회)
        postorder(root->right);            // R (오른쪽 서브트리 순회)
        printf("[%2d] ", root->data);    // V (노드 방문)
    }
}

#define SIZE 100
int top = -1;
TreeNode *stack[SIZE];

void push(TreeNode *p) {
    if (top < SIZE - 1)
        stack[++top] = p;
}


TreeNode *pop() {
    TreeNode *p = NULL;

    if (top >= 0)
        p = stack[top--];

    return p;
}


void inorder_iter(TreeNode *root) {
    while (1) {
        for (; root; root = root->left)
            push(root);

        root = pop();

        if (!root)
            break;

        printf("[%2d] ", root->data);

        root = root->right;
    }
}
*/

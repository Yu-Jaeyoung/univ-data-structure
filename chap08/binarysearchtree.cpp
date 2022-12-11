/*
#include <stdio.h>
#include "binarytree.h"

//조건. 루트를 기준으로 왼쪽은 그값보다 작고 오른쪽은 그 값보다 크다.

TreeNode *search(TreeNode *root, int key) {
    if (root == NULL)
        return NULL;

    if (root->data == key)
        return root;
    else if (root->data > key) {
        return search(root->left, key);
    } else //if (root->data < key)
    {
        return search(root->right, key);
    }
}

TreeNode *isearch(TreeNode *root, int key) {
    TreeNode *node = root;

    while (node != NULL) {
        if (key == node->data)
            return node;
        else if (key < node->data)
            node = node->left;
        else
            node = node->right;
    }

    return NULL;
}*/

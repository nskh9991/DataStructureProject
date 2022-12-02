/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureproject;

/**
 *
 * @author LEGION
 */
public class BST {
    
     NodeBst root;

    public BST() {
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void Insert(Items data) {
        root = InsertHelper(root, data);
    }

    private NodeBst InsertHelper(NodeBst root, Items data) {
        NodeBst n = new NodeBst(data);
        if (root == null) {
            root = n;
            return root;
        } else if (n.data.getItemNumber() < root.data.getItemNumber()) {
            root.left = InsertHelper(root.left, data);
        } else {
            root.right = InsertHelper(root.right, data);
        }
        return root;
    }

    public void preOrder(NodeBst temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.data);
        preOrder(temp.left);
        preOrder(temp.right);
    }

    public void inOrder(NodeBst temp) {
        if (temp == null) {
            return;
        }
        inOrder(temp.left);
        System.out.println(temp.data);
        inOrder(temp.right);
    }
 public void postOrder(NodeBst temp) {
        if (temp == null) {
            return;
        }
        preOrder(temp.left);
        preOrder(temp.right);
        System.out.print(temp.data);
    }

    public NodeBst Search(Items data) {
        return SearchHelper(root, data);
    }

    private NodeBst SearchHelper(NodeBst root, Items data) {
        NodeBst n = new NodeBst(data);
        if (root == null) {
            return null;
        } else if (root.data == n.data) {
            return n;
        } else if (n.data.getItemNumber() < root.data.getItemNumber()) {
            return SearchHelper(root.left, data);
        } else if (n.data.getItemNumber() > root.data.getItemNumber()) {
            return SearchHelper(root.right, data);
        } else {
            return null;
        }
    }

    
}

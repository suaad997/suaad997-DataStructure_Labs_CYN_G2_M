package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bTREE= new BinaryTree(10);
        bTREE.insertNode(5);
        bTREE.insertNode(12);
        bTREE.insertNode(2);
        bTREE.insertNode(7);
        bTREE.insertNode(11);
        bTREE.insertNode(13);
        System.out.println("searching for 11: "+ bTREE.searchNode(11));
        System.out.println("Preorder Traversal:");
        bTREE.preorder();
        System.out.println("Inorder Traversal:");
        bTREE.inorder();
        System.out.println("Postorder Traversal:");
        bTREE.postorder();








    }
}


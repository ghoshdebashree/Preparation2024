package BST.BSTIteration;

public class BSTIterativeMain {

  public static void main(String[] args){
    BSTIterativeLogic bst = new BSTIterativeLogic();
    bst.add(56);
    bst.add(28);
    bst.add(12);
    bst.add(26);
    bst.add(65);
    bst.add(33);
    bst.printTree(bst.getRoot());
  }
  
}

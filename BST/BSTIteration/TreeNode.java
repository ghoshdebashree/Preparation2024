package BST.BSTIteration;

//Class for a binary tree Node
class TreeNode {

  //Variables
  private int data;
  TreeNode leftChild;
  TreeNode rightChild;

  //Constructor  
  TreeNode(int value) {
      this.data = value;
      leftChild = null;
      rightChild = null;
  }

  //Getter-Setter  
  public TreeNode getLeftChild() {
      return leftChild;
  }

  public TreeNode getRightChild() {
      return rightChild;
  }

  public int getData() {
      return data;
  }

  public void setData(int value) {
      this.data = value;
  }

  public void setLeftChild(TreeNode left) {
      this.leftChild = left;
  }

  public void setRightChild(TreeNode right) {
      this.rightChild = right;
  }
}
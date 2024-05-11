package BST.BSTIteration;

public class RecursiveAppoach {
  TreeNode root;
  public TreeNode getRoot(){
    return root;
  }
  public void setRoot(TreeNode root){
    this.root = root;
  }
  TreeNode currentNode = root;
  public TreeNode recursive_approach(TreeNode root, int value){
    if(root == null) { return new TreeNode(value);
    }
    if(value < currentNode.getData() ){
       currentNode.setLeftChild(recursive_approach(currentNode.getLeftChild(), value));
    }
    else if(value > currentNode.getData()){
      currentNode.setRightChild(recursive_approach(currentNode.getRightChild(), value));
    }
    else{
      return currentNode;
    }
    return currentNode;

  }

  public boolean add(int value){
    root = recursive_approach(this.root, value);
    return true;
  }
  
}

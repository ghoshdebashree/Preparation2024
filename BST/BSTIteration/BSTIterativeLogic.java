package BST.BSTIteration;
class BSTIterativeLogic{
  TreeNode root;
  public TreeNode getRoot() {
		return root;
    }
    
	public void setRoot(TreeNode root) {
		this.root = root;
	}

  public boolean add(int value){
    if(isEmpty()){
      root = new TreeNode(value);
      return true;

    }
    TreeNode currentNode = root;
    while (currentNode != null) {

			TreeNode leftChild = currentNode.getLeftChild();
			TreeNode rightChild = currentNode.getRightChild();

			//If the value to insert is less than root value then move to left subtree
			//else move to right subtree of root
			//and before moving check if the subtree is null, if it's then insert the value.
			if (currentNode.getData() > value) {
				if (leftChild == null) {
					leftChild = new TreeNode(value);
					currentNode.setLeftChild(leftChild);
					return true;
				}
				currentNode = leftChild;
			} else {
				if (rightChild == null) {
					rightChild = new TreeNode(value);
					currentNode.setRightChild(rightChild);
					return true;
				}
				currentNode = rightChild;
			} //end of else
		} //end of while
		return false;
	}


  public boolean isEmpty(){
    return root == null;
  }

  public void printTree(TreeNode current){
    if(current == null) return;
      System.out.print(current.getData()+ " , "  );
      printTree(current.getLeftChild());
      printTree(current.getRightChild());
    }
}


package LO4_dataStructures

class BinaryTreeNode [A](var value:A,
                        var left:BinaryTreeNode[A],
                        var right:BinaryTreeNode[A]){
  //pre-order traveral
  def preOrderTraversal[A](node: BinaryTreeNode[A]):String={
    var out:String=""
    if (node!=null) {
      //top
      out += node.value.toString+" "
      //left
      out += preOrderTraversal(node.left)+" "
      //right
      out += preOrderTraversal(node.right)+" "
    }
    out
  }
  def inOrderTraversal[A](node: BinaryTreeNode[A]):String={
    //left
    //right
    //top
    var out:String=""
    if (node!=null) {
      //left
      out += inOrderTraversal(node.left)+" "
      //right
      out += inOrderTraversal(node.right)+" "
      //top
      out += node.value.toString+" "
    }
    out

  }
  def postOrderTraversal[A](node: BinaryTreeNode[A]):String={
    //left
    //top
    //right
    var out:String=""
    if (node!=null) {
      //left
      out += postOrderTraversal(node.left)+" "
      //top
      out += node.value.toString+" "
      //right
      out += postOrderTraversal(node.right)+" "

    }
    out
  }
}
object runBT{
  def main(args: Array[String]): Unit = {
    val root=new BinaryTreeNode[Int](5,null,null)
    root.left=new BinaryTreeNode[Int](2,null,null)
    root.right=new BinaryTreeNode[Int](8,null,null)
    root.left.left=new BinaryTreeNode[Int](-3,null,null)
    root.left.right=new BinaryTreeNode[Int](4,null,null)
    root.right.left=new BinaryTreeNode[Int](7,null,null)
    root.right.right=new BinaryTreeNode[Int](14,null,null)

    println(root.preOrderTraversal(root))
    println(root.inOrderTraversal(root))
    println(root.postOrderTraversal(root))
  }
}
package LO4_dataStructures

class BinarySearchTree [T](comparator: (T,T)=>Boolean){
  var root:BinaryTreeNode[T]=null
  def insert(a: T):Unit={
    if (this.root==null){
      this.root=new BinaryTreeNode[T](a,null,null)
    } else {
      insertHelper(a,this.root)
    }
  }
  def insertHelper(t: T, node: BinaryTreeNode[T]):Unit={
    if (comparator(t,node.value)){
      if (node.left==null){
        node.left=new BinaryTreeNode[T](t,null,null)
      } else {
        insertHelper(t,node.left)
      }
    } else {
      if (node.right==null){
        node.right=new BinaryTreeNode[T](t,null,null)
      } else {
        insertHelper(t,node.right)
      }
    }
  }
  def find(a:T):BinaryTreeNode[T]={
    findHelper(a,root)
  }
  def findHelper(a:T,node:BinaryTreeNode[T]):
    BinaryTreeNode[T]={
    if (node==null){
      null
    } else if (comparator(a,node.value)){
      findHelper(a,node.left)
    } else if (comparator(node.value,a)){
      findHelper(a,node.right)
    } else {
      node
    }
  }
}

object runThis{
  def main(args: Array[String]): Unit = {
    val intLessThan=(a:Int,b:Int)=>a>b
    val bst=new BinarySearchTree[Int](intLessThan)
    bst.insert(5)
    bst.insert(2)
    bst.insert(8)
    bst.insert(4)
    bst.insert(7)
    bst.insert(14)
    bst.insert(-3)
    println(bst.root.postOrderTraversal(bst.root))
    val node=bst.find(4)
  }
}

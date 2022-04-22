package LO4_dataStructures

import LO2_OOP.GameObject

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
  def sortString2(a:String,b:String):Boolean={
    if (a.length<b.length){
      true
    } else if (a.length==b.length && a<b){
      true
    } else {
      false
    }
  }
  def sortGameObject(a:GameObject,b:GameObject):Boolean={
    val aDist=a.xLoc*a.xLoc+a.yLoc*a.yLoc
    val bDist=b.xLoc*b.xLoc+b.yLoc*b.yLoc
    if (aDist<bDist){
      true
    } else {
      false
    }
  }
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
    println(bst.root.inOrderTraversal(bst.root))
    val node=bst.find(4)

    //holds string
    //sort by length then by alphabetical order
    //a b c aa ab cd aaa
    val sortString=(a:String,b:String)=> a<b
    val bst2=new BinarySearchTree[String](sortString2)
    bst2.insert("aa")
    bst2.insert("az")
    bst2.insert("bbb")
    bst2.insert("acd")
    bst2.insert("acdc")
    bst2.insert("b")
    bst2.insert("a")
    bst2.insert("c")
    bst2.insert("caa")
    println(bst2.root.inOrderTraversal(bst2.root))

    val bst3=new BinarySearchTree[GameObject](sortGameObject)
  }
}

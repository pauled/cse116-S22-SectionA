package LO4_dataStructures

class LinkedListNode[T] (var value:T,
                         var next:LinkedListNode[T]) {
  //size
  def size():Int={
    if (next==null){
      1
    } else {
      1+next.size()
    }
  }

  //print
  override def toString: String = {
    var out:String=this.value.toString
    var current:LinkedListNode[T]=next
    while (current!=null){
      out+=", "+current.value
      current=current.next
    }
    out
  }
  //getElement(num)
  def getElement(num:Int):LinkedListNode[T]={
    if(num==0){
      this
    } else if (next==null) {
      null
    } else {
      next.getElement(num-1)
    }
  }
  //add/remove
  //find
}
object runLinkedList{
  def main(args: Array[String]): Unit = {
    var myList:LinkedListNode[Int]=
      new LinkedListNode[Int](1,null)
    myList=new LinkedListNode[Int](3,myList)
    myList=new LinkedListNode[Int](5,myList)
    println(myList.size())
    println(myList)
    println(myList.getElement(10))
  }
}
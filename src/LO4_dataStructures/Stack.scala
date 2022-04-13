package LO4_dataStructures

class Stack[T] {
  var top:LinkedListNode[T]=null

  //push
  def push(element:T):Unit={
    this.top=new LinkedListNode[T](element,this.top)
  }
  //pop
  def pop():T={
    val toReturn=top.value
    this.top=this.top.next
    toReturn
  }

  override def toString: String = {
    this.top.toString
  }
}
object runStack{
  def main(args: Array[String]): Unit = {
    val stack=new Stack[Int]()
    stack.push(3)
    stack.push(5)
    stack.push(7)
    println(stack.pop())
    println(stack)
  }
}

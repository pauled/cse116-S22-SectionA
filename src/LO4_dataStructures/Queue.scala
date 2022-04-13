package LO4_dataStructures

class Queue [A]{
  var front:LinkedListNode[A]=null
  var back:LinkedListNode[A]=null

  //enqueue
  def enqueue(element:A):Unit= {
    if (back == null) {
      this.back = new LinkedListNode[A](element,
        null)
      this.front=this.back
    } else {
      this.back.next=new LinkedListNode[A](element,
        null)
    }
  }
  //dequeue
  def dequeue():A={
    val toReturn=this.front.value
    this.front=this.front.next
    if (this.front==null){
      this.back=null
    }
    toReturn
  }
}

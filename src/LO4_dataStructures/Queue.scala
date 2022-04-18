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
      this.back=this.back.next
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

  override def toString: String = {
    front.toString
  }
}

object runQueue{
  def main(args: Array[String]): Unit = {
    val myQueue:Queue[Int]=new Queue()
    myQueue.enqueue(1)
    myQueue.enqueue(2)
    myQueue.enqueue(3)
    println(myQueue)
    println()
    val temp=myQueue.dequeue()
    println(temp)
    println(myQueue)

    val deck:Queue[Card]=new Queue()
    val suits:Array[String]=Array("hearts",
      "clubs","diamonds","spades")
    for (suit <- suits){
      for (i <- 1 to 13){
        deck.enqueue(new Card(suit,i))
      }
    }
    println(deck)
  }
}
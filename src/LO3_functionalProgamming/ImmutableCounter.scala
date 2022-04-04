package LO3_functionalProgamming

class ImmutableCounter (counter:Int){
  def printCounter():Unit={
    println(counter)}
  def increase():ImmutableCounter={
    new ImmutableCounter(this.counter+1)}
  def decrease():ImmutableCounter={
    new ImmutableCounter(this.counter-1)}
}
object RunImmutableCounter{
  def updateCounter(n:Int,counter:ImmutableCounter):
    ImmutableCounter={
    if(n==0){
      counter} else if (n>0){
      updateCounter(n-1,counter.increase())} else {
      updateCounter(n+1,counter.decrease())
    }
  }
  def main(args: Array[String]): Unit = {
    val counter:ImmutableCounter=
      new ImmutableCounter(10)
    val counter2=updateCounter(3,counter)
    counter.printCounter()
    counter2.printCounter()
  }
}

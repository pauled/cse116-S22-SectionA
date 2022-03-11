package LO2_statePattern

class Depressed (brain2:Student) extends State (brain2){
  override def study(): Unit = {
    println("What's the point")
  }
  override def getCloserToExam(): Unit = {
    println("I'm having panic attacks outside of a course")
  }
  override def expressFeelings(): Unit = {
    println("I am so depressed")
  }
}

